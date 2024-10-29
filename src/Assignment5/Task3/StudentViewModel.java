package Assignment5.Task3;

import java.util.ArrayList;
import java.util.List;

public class StudentViewModel {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(String name, int age, String course) {
        students.add(new Student(name, age, course));
    }

    public void updateStudent(int index, String name, int age, String course) {
        students.set(index, new Student(name, age, course));
    }
}
