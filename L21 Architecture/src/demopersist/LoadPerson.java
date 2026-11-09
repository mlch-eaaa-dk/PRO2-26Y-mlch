package demopersist;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadPerson {
    void main() {
        Person p;

        String filename = "L21 Architecture/src/demopersist/Person.ser";
        try (FileInputStream f_in = new FileInputStream(filename);
             ObjectInputStream obj_in = new ObjectInputStream(f_in)
        ) {
            Object obj = obj_in.readObject();
            p = (Person) obj;
        } catch (IOException | ClassNotFoundException ex) {
            IO.println("Error deserializing object");
            IO.println(ex);
            return;
        }

        IO.println("Person er hentet: " + p);
    }
}
