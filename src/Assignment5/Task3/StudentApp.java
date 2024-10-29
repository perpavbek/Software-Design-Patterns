package Assignment5.Task3;

// StudentApp.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentApp extends JFrame {
    private final StudentViewModel viewModel;
    private final DefaultListModel<Student> studentListModel;
    private final JList<Student> studentList;

    public StudentApp() {
        viewModel = new StudentViewModel();
        studentListModel = new DefaultListModel<>();
        studentList = new JList<>(studentListModel);

        setupUI();
    }

    private void setupUI() {
        setTitle("Student Management");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));

        JTextField nameField = new JTextField();
        JTextField ageField = new JTextField();
        JTextField courseField = new JTextField();
        JButton addButton = new JButton("Add Student");

        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Age:"));
        inputPanel.add(ageField);
        inputPanel.add(new JLabel("Course:"));
        inputPanel.add(courseField);
        inputPanel.add(addButton);

        JScrollPane scrollPane = new JScrollPane(studentList);

        JButton updateButton = new JButton("Update Selected");

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(updateButton, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                int age = Integer.parseInt(ageField.getText().trim());
                String course = courseField.getText().trim();

                if (!name.isEmpty() && !course.isEmpty()) {
                    viewModel.addStudent(name, age, course);
                    refreshStudentList();
                    nameField.setText("");
                    ageField.setText("");
                    courseField.setText("");
                }
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = studentList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String name = nameField.getText().trim();
                    int age = Integer.parseInt(ageField.getText().trim());
                    String course = courseField.getText().trim();

                    if (!name.isEmpty() && !course.isEmpty()) {
                        viewModel.updateStudent(selectedIndex, name, age, course);
                        refreshStudentList();
                    }
                }
            }
        });
    }

    private void refreshStudentList() {
        studentListModel.clear();
        for (Student student : viewModel.getStudents()) {
            studentListModel.addElement(student);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentApp().setVisible(true));
    }
}
