import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {
    private JTextField txtUserName;
    private JPasswordField txtPassword;

    public LoginForm(){
        setSize(400,300);
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Username Label
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Username : "),gbc);

        // Username TextField
        txtUserName = new JTextField(15);
        gbc.gridx = 1; gbc.gridy = 0;
        panel.add(txtUserName,gbc);

        // Password Label
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Password : "),gbc);

        // Password Field
        txtPassword = new JPasswordField(15);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(txtPassword,gbc);

        // ปุ่ม Login/Cancel
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,30,10));
        JButton btnLogin = new JButton("Login");
        JButton btnCancel = new JButton("Cancel");

        Dimension btnSize = new Dimension(100,30);
        btnLogin.setPreferredSize(btnSize);
        btnCancel.setPreferredSize(btnSize);

        btnPanel.add(btnLogin);
        btnPanel.add(btnCancel);

        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        panel.add(btnPanel,gbc);

        add(panel);

        //ตรวจจับเหตุการณ์คลิกปุ่ม btncancel
        btnCancel.addActionListener(ActiveEvente ->{
            txtUserName.setText("");
            txtPassword.setText("");
        });

        //ตรวจจับเหตุการณ์คลิกที่ btnlogin
        btnLogin.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUserName.getText();
                String password = txtPassword.getText();

                if (username.equals("admin") && password.equals("12345")){
                    JOptionPane.showMessageDialog(LoginForm.this,"Login success....","Success",JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(LoginForm.this,"Access Deined....","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }

    public static void main(String[] args) {
        LoginForm fr = new LoginForm();
        fr.setVisible(true);
    }
}
