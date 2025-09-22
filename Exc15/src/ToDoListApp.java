import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ToDoListApp extends JFrame {
    private JTextField txtTask;
    private JButton btnAdd, btnDel;
    private DefaultListModel<ToDoList> listModel;
    private JList<ToDoList> taskList;
    private ArrayList<ToDoList> tasks;

    public ToDoListApp() {
        setTitle("To-Do List");
        setSize(400, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // ให้อยู่กลางจอ
        setLayout(new BorderLayout(5, 5));
        getContentPane().setBackground(new Color(189, 189, 189));

        tasks = new ArrayList<>();

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        inputPanel.setBackground(new Color(189, 189, 189));
        inputPanel.add(new JLabel("Task : "));

        txtTask = new JTextField(20);
        inputPanel.add(txtTask);

        btnAdd = new JButton("ADD");
        inputPanel.add(btnAdd);

        JPanel centerPanel = new JPanel(new BorderLayout(5, 5));
        centerPanel.setBackground(new Color(189, 189, 189));
        centerPanel.setPreferredSize(new Dimension(350, 120));

        JLabel lblTodo = new JLabel("Todo List :");
        lblTodo.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
        centerPanel.add(lblTodo, BorderLayout.NORTH);

        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(taskList);
        centerPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel wrapper = new JPanel(new FlowLayout(FlowLayout.CENTER));
        wrapper.setBackground(new Color(189, 189, 189));
        wrapper.add(centerPanel);

        // แถบล่าง
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        bottomPanel.setBackground(new Color(189, 189, 189));

        btnDel = new JButton("Del");
        bottomPanel.add(btnDel);

        add(inputPanel, BorderLayout.NORTH);
        add(wrapper, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        btnAdd.addActionListener(e -> {
            String taskName = txtTask.getText().trim();
            if (!taskName.isEmpty()) {
                ToDoList newTask = new ToDoList(taskName);
                tasks.add(newTask);
                listModel.addElement(newTask);
                txtTask.setText("");
            }
        });

        btnDel.addActionListener(e -> {
            int index = taskList.getSelectedIndex();
            if (index != -1) {
                tasks.remove(listModel.getElementAt(index));
                listModel.remove(index);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ToDoListApp().setVisible(true));
    }
}
