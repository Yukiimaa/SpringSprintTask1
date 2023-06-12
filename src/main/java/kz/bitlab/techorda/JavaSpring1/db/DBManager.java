package kz.bitlab.techorda.JavaSpring1.db;

import kz.bitlab.techorda.JavaSpring1.model.Student;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Student> students = new ArrayList<>();
    private static Long id = 6L;

    static {
        students.add(new Student(1L, "Ilyas", "Zhuanyshev", 100, "A"));
        students.add(new Student(2L, "Aigerim", "Mirzakanova", 75, "B"));
        students.add(new Student(3L, "Nazerke", "Bisametova", 90, "A"));
        students.add(new Student(4L, "San", "Sanych", 34, "F"));
        students.add(new Student(5L, "Yukii", "Matthew", 65, "C"));
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void addStudent(Student student) {
        student.setId(id);
        id++;
        students.add(student);
    }
}
