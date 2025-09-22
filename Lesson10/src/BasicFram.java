import javax.swing.*;
import javax.swing.border.StrokeBorder;
import java.awt.*;

public class BasicFram {
    public static void main(String[] args) {
        //สร้างfram
        JFrame fr = new JFrame("Exam GUI");
        fr.setSize(450,600);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

        fr.setTitle("Programa ");
        //fr.setLocation(200,200);
        fr.setLocationRelativeTo(null);
        fr.setBackground(Color.GRAY);

        //สร้างtext
        JLabel lb1 = new JLabel("Example Form");
        lb1.setFont(new Font("Tahoma", Font.BOLD,25));
        lb1.setForeground(Color.BLACK);
        fr.add(lb1);


        //สร้าง Input
        JTextField txt1 = new JTextField(40);
        txt1.setToolTipText("Enter text here....");
        fr.add(txt1);


        //สร้าง Input
        JTextField txt2 = new JTextField(20);
        txt1.setToolTipText("Enter text here....");
        fr.add(txt2);

        //สร้าง CheckBox
        JCheckBox chk1 = new JCheckBox("Python",true);
        JCheckBox chk2 = new JCheckBox("Java",true);
        JCheckBox chk3 = new JCheckBox("PHP",true);
        fr.add(chk1);
        fr.add(chk2);
        fr.add(chk3);

        //สร้าง redio
        JRadioButton rdb1 = new JRadioButton("Male",true);
        JRadioButton rdb2 = new JRadioButton("FeMale");

        ButtonGroup genderGr = new ButtonGroup();
        genderGr.add(rdb1);
        genderGr.add(rdb2);
        fr.add(rdb1);
        fr.add(rdb2);

        //สร้างDropdownList
        String[] language = {"Python","Java","PHP","TypeScript"};
        JComboBox<String> cbo1 = new JComboBox<String>(language);
        cbo1.setPrototypeDisplayValue("XXXXXXXXXXXXXXX");
        fr.add(cbo1);

        //สร้างปุ่ม
        JButton bt1 = new JButton("Click Me!");
        bt1.setBackground(Color.white);
        bt1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        bt1.setFont(new Font("Tahoma", Font.BOLD,15));
        bt1.setForeground(Color.black);
        bt1.setPreferredSize(new Dimension(200, 30));

        fr.add(bt1);




        fr.setVisible(true);
    }
}
