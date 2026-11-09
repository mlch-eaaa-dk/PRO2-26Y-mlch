package demoapplication.storage;

import demoapplication.controller.Storage;
import demoapplication.model.Student;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@NullMarked
public class ListStorage implements Storage, Serializable {
    private final List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return List.copyOf(students);
    }

    public void storeStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }

    // -------------------------------------------------------------------------

    public static @Nullable ListStorage loadStorage(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objIn = new ObjectInputStream(fileIn)
        ) {
            Object obj = objIn.readObject();
            ListStorage storage = (ListStorage) obj;
            IO.println("Storage loaded from file " + fileName);
            return storage;
        } catch (IOException | ClassNotFoundException ex) {
            IO.println("Error deserializing storage");
            IO.println(ex);
            return null;
        }
    }

    public static void saveStorage(String fileName, Storage storage) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut)
        ) {
            objOut.writeObject(storage);
            IO.println("Storage saved in file " + fileName);
        } catch (IOException ex) {
            IO.println("Error serializing storage");
            IO.println(ex);
            throw new RuntimeException();
        }
    }
}
