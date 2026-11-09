package demoapplication.test;

import demoapplication.controller.Controller;
import demoapplication.controller.Storage;
import demoapplication.model.Student;
import demoapplication.storage.ListStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {
    @BeforeEach
    public void setUp() {
        Storage storage = new ListStorage();
        Controller.setStorage(storage);
    }

    @Test
    public void testCreateStudent() {
        // act
        Student student = Controller.createStudent("Hanne", 51, true);
        // assert
        assertEquals("Hanne", student.getName());
        assertEquals(51, student.getAge());
        assertTrue(student.isActive());
        List<Student> students = Controller.getStudents();
        assertTrue(students.contains(student));
    }

    @Test
    public void testDeleteStudent() {
        // arrange
        Student student = Controller.createStudent("Hanne", 51, true);
        // act
        Controller.deleteStudent(student);
        // assert
        List<Student> students = Controller.getStudents();
        assertFalse(students.contains(student));
    }
}
