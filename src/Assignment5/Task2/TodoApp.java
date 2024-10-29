package Assignment5.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoApp extends JFrame {
    private final TodoController controller;
    private final DefaultListModel<Todo> todoListModel;
    private final JList<Todo> todoList;
    private final JTextField todoInputField;

    public TodoApp() {
        controller = new TodoController();
        todoListModel = new DefaultListModel<>();
        todoList = new JList<>(todoListModel);
        todoInputField = new JTextField(15);

        setupUI();
    }

    private void setupUI() {
        setTitle("Todo List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input field and add button
        JPanel inputPanel = new JPanel();
        inputPanel.add(todoInputField);
        JButton addButton = new JButton("Add Todo");
        inputPanel.add(addButton);

        // Todo list
        JScrollPane scrollPane = new JScrollPane(todoList);
        JButton deleteButton = new JButton("Delete Selected");

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(deleteButton, BorderLayout.SOUTH);

        // Button action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = todoInputField.getText().trim();
                if (!title.isEmpty()) {
                    controller.addTodo(title);
                    refreshTodoList();
                    todoInputField.setText("");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Todo selectedTodo = todoList.getSelectedValue();
                if (selectedTodo != null) {
                    controller.deleteTodo(selectedTodo);
                    refreshTodoList();
                }
            }
        });
    }

    private void refreshTodoList() {
        todoListModel.clear();
        for (Todo todo : controller.getAllTodos()) {
            todoListModel.addElement(todo);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TodoApp().setVisible(true));
    }
}