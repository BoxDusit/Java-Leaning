import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// คลาสขอบมินิมอล
class MinimalBorder extends AbstractBorder {
    private Color normalColor;
    private Color focusColor;
    private boolean isFocused;

    public MinimalBorder(Color normalColor, Color focusColor) {
        this.normalColor = normalColor;
        this.focusColor = focusColor;
        this.isFocused = false;
    }

    public void setFocused(boolean focused) {
        this.isFocused = focused;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(isFocused ? focusColor : normalColor);
        g2.drawLine(x, y + height - 1, x + width, y + height - 1);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(8, 0, 8, 0);
    }
}

// คลาส TextField มินิมอล
class MinimalTextField extends JTextField {
    private MinimalBorder border;

    public MinimalTextField(int columns) {
        super(columns);
        setupField();
    }

    private void setupField() {
        setFont(new Font("Segoe UI", Font.PLAIN, 15));
        setBackground(Color.WHITE);
        setForeground(new Color(33, 33, 33));
        border = new MinimalBorder(new Color(224, 224, 224), new Color(33, 150, 243));
        setBorder(border);
        setOpaque(false);

        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                border.setFocused(true);
                repaint();
            }

            @Override
            public void focusLost(FocusEvent e) {
                border.setFocused(false);
                repaint();
            }
        });
    }
}

// คลาสปุ่มมินิมอล
class MinimalButton extends JButton {
    private Color backgroundColor;
    private Color hoverColor;
    private boolean isHovered = false;

    public MinimalButton(String text, Color backgroundColor) {
        super(text);
        this.backgroundColor = backgroundColor;
        this.hoverColor = backgroundColor.darker();

        setupButton();
    }

    private void setupButton() {
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        setForeground(Color.WHITE);
        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                isHovered = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                isHovered = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Color currentColor = isHovered ? hoverColor : backgroundColor;
        g2.setColor(currentColor);
        g2.fillRect(0, 0, getWidth(), getHeight());

        super.paintComponent(g);
    }
}

public class MinimalForm {
    public static void main(String[] args) {
        // ตั้งค่า Look and Feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // สร้าง JFrame
        JFrame frame = new JFrame("Form");
        frame.setSize(450, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        // พาเนลหลัก
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        // พาเนลฟอร์ม
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        formPanel.setBorder(BorderFactory.createEmptyBorder(60, 60, 60, 60));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;

        // หัวข้อ
        JLabel titleLabel = new JLabel("Registration");
        titleLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 28));
        titleLabel.setForeground(new Color(33, 33, 33));
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        gbc.insets = new Insets(0, 0, 40, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(titleLabel, gbc);

        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;

        // ชื่อ
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        nameLabel.setForeground(new Color(117, 117, 117));
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.insets = new Insets(20, 0, 5, 20);
        formPanel.add(nameLabel, gbc);

        MinimalTextField nameField = new MinimalTextField(20);
        gbc.gridx = 1; gbc.gridy = 1;
        gbc.insets = new Insets(20, 0, 5, 0);
        formPanel.add(nameField, gbc);

        // นามสกุล
        JLabel lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lastNameLabel.setForeground(new Color(117, 117, 117));
        gbc.gridx = 0; gbc.gridy = 2;
        gbc.insets = new Insets(15, 0, 5, 20);
        formPanel.add(lastNameLabel, gbc);

        MinimalTextField lastNameField = new MinimalTextField(20);
        gbc.gridx = 1; gbc.gridy = 2;
        gbc.insets = new Insets(15, 0, 5, 0);
        formPanel.add(lastNameField, gbc);

        // อีเมล
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        emailLabel.setForeground(new Color(117, 117, 117));
        gbc.gridx = 0; gbc.gridy = 3;
        gbc.insets = new Insets(15, 0, 5, 20);
        formPanel.add(emailLabel, gbc);

        MinimalTextField emailField = new MinimalTextField(20);
        gbc.gridx = 1; gbc.gridy = 3;
        gbc.insets = new Insets(15, 0, 5, 0);
        formPanel.add(emailField, gbc);

        // ทักษะ
        JLabel skillsLabel = new JLabel("Skills");
        skillsLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        skillsLabel.setForeground(new Color(117, 117, 117));
        gbc.gridx = 0; gbc.gridy = 4;
        gbc.insets = new Insets(25, 0, 5, 20);
        formPanel.add(skillsLabel, gbc);

        JPanel skillsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        skillsPanel.setBackground(Color.WHITE);

        JCheckBox[] skills = {
                new JCheckBox("Python", true),
                new JCheckBox("Java"),
                new JCheckBox("PHP")
        };

        for (JCheckBox skill : skills) {
            skill.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            skill.setBackground(Color.WHITE);
            skill.setForeground(new Color(33, 33, 33));
            skill.setFocusPainted(false);
            skill.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 20));
            skillsPanel.add(skill);
        }

        gbc.gridx = 1; gbc.gridy = 4;
        gbc.insets = new Insets(25, 0, 5, 0);
        formPanel.add(skillsPanel, gbc);

        // เพศ
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        genderLabel.setForeground(new Color(117, 117, 117));
        gbc.gridx = 0; gbc.gridy = 5;
        gbc.insets = new Insets(20, 0, 5, 20);
        formPanel.add(genderLabel, gbc);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        genderPanel.setBackground(Color.WHITE);

        JRadioButton maleRadio = new JRadioButton("Male", true);
        JRadioButton femaleRadio = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        JRadioButton[] genders = {maleRadio, femaleRadio};
        for (JRadioButton gender : genders) {
            gender.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            gender.setBackground(Color.WHITE);
            gender.setForeground(new Color(33, 33, 33));
            gender.setFocusPainted(false);
            gender.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 20));
            genderPanel.add(gender);
        }

        gbc.gridx = 1; gbc.gridy = 5;
        gbc.insets = new Insets(20, 0, 5, 0);
        formPanel.add(genderPanel, gbc);

        // ภาษา
        JLabel languageLabel = new JLabel("Language");
        languageLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        languageLabel.setForeground(new Color(117, 117, 117));
        gbc.gridx = 0; gbc.gridy = 6;
        gbc.insets = new Insets(20, 0, 5, 20);
        formPanel.add(languageLabel, gbc);

        String[] languages = {"Python", "Java", "PHP", "JavaScript"};
        JComboBox<String> languageCombo = new JComboBox<>(languages);
        languageCombo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        languageCombo.setBackground(Color.WHITE);
        languageCombo.setForeground(new Color(33, 33, 33));
        languageCombo.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(224, 224, 224)));
        gbc.gridx = 1; gbc.gridy = 6;
        gbc.insets = new Insets(20, 0, 5, 0);
        formPanel.add(languageCombo, gbc);

        // ปุ่ม Submit
        MinimalButton submitButton = new MinimalButton("Submit", new Color(33, 150, 243));
        submitButton.setPreferredSize(new Dimension(120, 40));

        gbc.gridx = 0; gbc.gridy = 7; gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(40, 0, 10, 0);
        formPanel.add(submitButton, gbc);

        // ปุ่ม Clear
        MinimalButton clearButton = new MinimalButton("Clear", new Color(158, 158, 158));
        clearButton.setPreferredSize(new Dimension(80, 35));
        clearButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));

        gbc.gridy = 8;
        gbc.insets = new Insets(5, 0, 0, 0);
        formPanel.add(clearButton, gbc);

        // Event handlers
        submitButton.addActionListener(e -> {
            StringBuilder msg = new StringBuilder("Submitted:\n\n");
            msg.append("Name: ").append(nameField.getText()).append(" ").append(lastNameField.getText()).append("\n");
            msg.append("Email: ").append(emailField.getText()).append("\n");

            msg.append("Skills: ");
            for (JCheckBox skill : skills) {
                if (skill.isSelected()) {
                    msg.append(skill.getText()).append(" ");
                }
            }
            msg.append("\n");

            msg.append("Gender: ").append(maleRadio.isSelected() ? "Male" : "Female").append("\n");
            msg.append("Language: ").append(languageCombo.getSelectedItem());

            JOptionPane.showMessageDialog(frame, msg.toString(), "Form Submitted", JOptionPane.PLAIN_MESSAGE);
        });

        clearButton.addActionListener(e -> {
            nameField.setText("");
            lastNameField.setText("");
            emailField.setText("");
            skills[0].setSelected(true);
            for (int i = 1; i < skills.length; i++) {
                skills[i].setSelected(false);
            }
            maleRadio.setSelected(true);
            languageCombo.setSelectedIndex(0);
        });

        mainPanel.add(formPanel, BorderLayout.CENTER);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}