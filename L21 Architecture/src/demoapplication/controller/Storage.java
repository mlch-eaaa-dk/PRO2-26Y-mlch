package demoapplication.controller;

import demoapplication.model.Student;
import org.jspecify.annotations.NullMarked;

import java.util.List;

@NullMarked
public interface Storage {
    List<Student> getStudents();
    void storeStudent(Student student);
    void deleteStudent(Student student);
}
