import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatePanel extends JFrame {
    private JTextField txtNum1, txtNum2;
    private JLabel lblResult;

    Color btnColor = new Color(225, 228, 232);
    Color backgroundColor = new Color(189, 189, 189);

    public CalculatePanel() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(backgroundColor);
        setLayout(null);

        // Number 1
        JLabel lblNum1 = new JLabel("Number 1 : ");
        lblNum1.setBounds(30, 25, 90, 25);
        lblNum1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNum1.setHorizontalAlignment(SwingConstants.RIGHT);
        add(lblNum1);
        txtNum1 = new JTextField();
        txtNum1.setBounds(130, 25, 180, 25);
        add(txtNum1);

        // Number 2
        JLabel lblNum2 = new JLabel("Number 2 : ");
        lblNum2.setBounds(30, 60, 90, 25);
        lblNum2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNum2.setHorizontalAlignment(SwingConstants.RIGHT);
        add(lblNum2);

        txtNum2 = new JTextField();
        txtNum2.setBounds(130, 60, 180, 25);
        add(txtNum2);

        // ปุ่มบวก
        JButton btnAdd = new JButton("+");
        btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnAdd.setBounds(50, 115, 60, 30);
        btnAdd.setFocusPainted(false);
        btnAdd.setBackground(btnColor);
        btnAdd.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        add(btnAdd);


        // ปุ่มลบ
        JButton btnSubtract = new JButton("-");
        btnSubtract.setBounds(120, 115, 60, 30);
        btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnSubtract.setFocusPainted(false);
        btnSubtract.setBackground(btnColor);
        btnSubtract.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        add(btnSubtract);

        // ปุ่มคูณ
        JButton btnMultiply = new JButton("×");
        btnMultiply.setBounds(190, 115, 60, 30);
        btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnMultiply.setFocusPainted(false);
        btnMultiply.setBackground(btnColor);
        btnMultiply.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        add(btnMultiply);

        // ปุ่มหาร
        JButton btnDivide = new JButton("/");
        btnDivide.setBounds(260, 115, 60, 30);
        btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnDivide.setFocusPainted(false);
        btnDivide.setBackground(btnColor);
        btnDivide.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        add(btnDivide);

        // Label แสดงผล


        // ActionListener สำหรับปุ่ม
        btnAdd.addActionListener(e -> calculate('+'));
        btnSubtract.addActionListener(e -> calculate('-'));
        btnMultiply.addActionListener(e -> calculate('*'));
        btnDivide.addActionListener(e -> calculate('/'));
    }

    private void calculate(char operator) {
        try {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            double result = 0;

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                    if (num2 == 0) {
                        lblResult.setText("Result: Cannot divide by zero!");
                        return;
                    }
                    result = num1 / num2; break;
            }

            lblResult.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            lblResult.setText("Result: Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        CalculatePanel frame = new CalculatePanel();
        frame.setVisible(true);
    }
}
