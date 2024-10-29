package Assignment5.Task2;

import java.util.ArrayList;
import java.util.List;

public class TodoController {
    private List<Todo> todos = new ArrayList<>();

    public List<Todo> getAllTodos() {
        return todos;
    }

    public void addTodo(String title) {
        Todo todo = new Todo();
        todo.setTitle(title);
        todos.add(todo);
    }

    public void deleteTodo(Todo todo) {
        todos.remove(todo);
    }
}