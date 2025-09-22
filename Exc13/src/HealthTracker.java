import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

// ส่วน UI
public class HealthTracker extends JFrame {
    private JRadioButton rdbMale, rdbFemale;
    private JTextField txtAge, txtHeight, txtWeight;
    private JComboBox<String> cboActivity;
    private JLabel lbBMI, lbBMR, lbTDEE;

    public HealthTracker() {
        // สีหลัก
        Color backgroundColor = new Color(225, 228, 232);
        Color labelColor = new Color(50, 0, 209);
        Color buttonBgColor = new Color(173, 216, 230);
        Color resultTextColor = new Color(0, 102, 204);
        Color tdeeBgColor = new Color(105, 105, 105);
        Color tdeeResultColor = new Color(0, 255, 255);

        Font labelFont = new Font("Tahoma", Font.BOLD, 12);
        Font resultFont = new Font("Tahoma", Font.BOLD, 30);

        // ตั้งค่า Frame
        setTitle("Health Tracker");
        setSize(800, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(backgroundColor);
        setLayout(null);

        // Panel ข้อมูลสุขภาพ
        JPanel infoPanel = new JPanel(null);
        infoPanel.setBorder(BorderFactory.createTitledBorder("Health Information"));
        infoPanel.setBounds(10, 10, 360, 380);
        infoPanel.setBackground(backgroundColor);
        add(infoPanel);

        // เพศ
        JLabel lblGender = new JLabel("Gender :");
        lblGender.setBounds(30, 40, 90, 25);
        lblGender.setFont(labelFont);
        lblGender.setForeground(labelColor);
        lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
        infoPanel.add(lblGender);

        rdbMale = new JRadioButton("Male", true);
        rdbMale.setBounds(130, 40, 70, 25);
        rdbMale.setBackground(backgroundColor);
        infoPanel.add(rdbMale);

        rdbFemale = new JRadioButton("Female");
        rdbFemale.setBounds(200, 40, 80, 25);
        rdbFemale.setBackground(backgroundColor);
        infoPanel.add(rdbFemale);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rdbMale);
        genderGroup.add(rdbFemale);

        // อายุ
        JLabel lblAge = new JLabel("Age :");
        lblAge.setBounds(30, 80, 90, 25);
        lblAge.setFont(labelFont);
        lblAge.setForeground(labelColor);
        lblAge.setHorizontalAlignment(SwingConstants.RIGHT);
        infoPanel.add(lblAge);

        txtAge = new JTextField();
        txtAge.setBounds(130, 80, 150, 25);
        infoPanel.add(txtAge);
        infoPanel.add(new JLabel("years")).setBounds(290, 80, 50, 25);

        // ส่วนสูง
        JLabel lblHeight = new JLabel("Height :");
        lblHeight.setBounds(30, 120, 90, 25);
        lblHeight.setFont(labelFont);
        lblHeight.setForeground(labelColor);
        lblHeight.setHorizontalAlignment(SwingConstants.RIGHT);
        infoPanel.add(lblHeight);

        txtHeight = new JTextField();
        txtHeight.setBounds(130, 120, 150, 25);
        infoPanel.add(txtHeight);
        infoPanel.add(new JLabel("cm.")).setBounds(290, 120, 50, 25);

        // น้ำหนัก
        JLabel lblWeight = new JLabel("Weight :");
        lblWeight.setBounds(30, 160, 90, 25);
        lblWeight.setFont(labelFont);
        lblWeight.setForeground(labelColor);
        lblWeight.setHorizontalAlignment(SwingConstants.RIGHT);
        infoPanel.add(lblWeight);

        txtWeight = new JTextField();
        txtWeight.setBounds(130, 160, 150, 25);
        infoPanel.add(txtWeight);
        infoPanel.add(new JLabel("kg.")).setBounds(290, 160, 50, 25);

        // ระดับกิจกรรม
        JLabel lblActivity = new JLabel("Activity level :");
        lblActivity.setBounds(10, 200, 110, 25);
        lblActivity.setFont(labelFont);
        lblActivity.setForeground(labelColor);
        lblActivity.setHorizontalAlignment(SwingConstants.RIGHT);
        infoPanel.add(lblActivity);

        String[] activityLevels = {
                "Little or No Exercise",
                "Light exercise 1-3 Days/Week",
                "Moderate exercise 3-5 Days/Week",
                "Hard exercise 6-7 Days/Week",
                "Very Hard Exercise & Physical Job"
        };
        cboActivity = new JComboBox<>(activityLevels);
        cboActivity.setBounds(130, 200, 200, 25);
        infoPanel.add(cboActivity);

        // ปุ่มคำนวณ
        JButton btnCalculate = new JButton("CALCULATE");
        btnCalculate.setBounds(40, 250, 280, 30);
        btnCalculate.setBackground(buttonBgColor);
        btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 14));
        infoPanel.add(btnCalculate);

        // Panel แสดงผลลัพธ์
        JPanel resultsPanel = new JPanel(null);
        resultsPanel.setBorder(BorderFactory.createTitledBorder("Results"));
        resultsPanel.setBounds(390, 10, 380, 380);
        resultsPanel.setBackground(backgroundColor);
        add(resultsPanel);

        Border resultBorder = BorderFactory.createLineBorder(Color.GRAY);

        // BMI
        JPanel pnlBmi = new JPanel(null);
        pnlBmi.setBounds(30, 40, 130, 110);
        pnlBmi.setBackground(buttonBgColor);
        pnlBmi.setBorder(resultBorder);
        resultsPanel.add(pnlBmi);

        JLabel bmiTitle = new JLabel("BMI :");
        bmiTitle.setBounds(0, 10, 120, 20);
        bmiTitle.setHorizontalAlignment(SwingConstants.CENTER);
        pnlBmi.add(bmiTitle);

        lbBMI = new JLabel("0");
        lbBMI.setBounds(0, 40, 120, 40);
        lbBMI.setFont(resultFont);
        lbBMI.setForeground(resultTextColor);
        lbBMI.setHorizontalAlignment(SwingConstants.CENTER);
        pnlBmi.add(lbBMI);

        // BMR
        JPanel pnlBmr = new JPanel(null);
        pnlBmr.setBounds(180, 40, 130, 110);
        pnlBmr.setBackground(buttonBgColor);
        pnlBmr.setBorder(resultBorder);
        resultsPanel.add(pnlBmr);

        JLabel bmrTitle = new JLabel("BMR :");
        bmrTitle.setBounds(0, 10, 120, 20);
        bmrTitle.setHorizontalAlignment(SwingConstants.CENTER);
        pnlBmr.add(bmrTitle);

        lbBMR = new JLabel("0");
        lbBMR.setBounds(0, 40, 120, 40);
        lbBMR.setFont(resultFont);
        lbBMR.setForeground(resultTextColor);
        lbBMR.setHorizontalAlignment(SwingConstants.CENTER);
        pnlBmr.add(lbBMR);

        // TDEE
        JPanel pnlTdee = new JPanel(null);
        pnlTdee.setBounds(30, 170, 280, 180);
        pnlTdee.setBackground(tdeeBgColor);
        pnlTdee.setBorder(resultBorder);

        resultsPanel.add(pnlTdee);

        JLabel tdeeTitle = new JLabel("TDEE");
        tdeeTitle.setBounds(0, 15, 300, 20);
        tdeeTitle.setForeground(Color.WHITE);
        tdeeTitle.setHorizontalAlignment(SwingConstants.CENTER);
        pnlTdee.add(tdeeTitle);

        JLabel maintainLabel = new JLabel("Maintain your current weight :");
        maintainLabel.setBounds(0, 45, 300, 20);
        maintainLabel.setForeground(Color.WHITE);
        maintainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        pnlTdee.add(maintainLabel);

        lbTDEE = new JLabel("0");
        lbTDEE.setBounds(0, 75, 300, 40);
        lbTDEE.setFont(resultFont);
        lbTDEE.setForeground(tdeeResultColor);
        lbTDEE.setHorizontalAlignment(SwingConstants.CENTER);
        pnlTdee.add(lbTDEE);

        JLabel calLabel = new JLabel("Calories per day");
        calLabel.setBounds(0, 130, 300, 20);
        calLabel.setForeground(Color.WHITE);
        calLabel.setHorizontalAlignment(SwingConstants.CENTER);
        pnlTdee.add(calLabel);

        // กดปุ่มแล้วคำนวณ
        btnCalculate.addActionListener(e -> calculateHealth());
    }

    private void calculateHealth() {
        try {
            char gender = rdbMale.isSelected() ? 'm' : 'f';
            int age = Integer.parseInt(txtAge.getText());
            double height = Double.parseDouble(txtHeight.getText());
            double weight = Double.parseDouble(txtWeight.getText());
            int activityIndex = cboActivity.getSelectedIndex();

            Health health = new Health(gender, age, height, weight, activityIndex);

            double bmi = health.calBMI();
            int bmr = health.calBMR();
            int tdee = health.calTDEE(bmr);

            lbBMI.setText(String.format("%.2f", bmi));
            lbBMR.setText(String.valueOf(bmr));
            lbTDEE.setText(String.valueOf(tdee));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid numbers for Age, Height, and Weight.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
