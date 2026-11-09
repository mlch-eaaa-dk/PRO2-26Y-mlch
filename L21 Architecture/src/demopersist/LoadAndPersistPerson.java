package demopersist;

import java.io.*;

public class LoadAndPersistPerson {
    void main() {
        Person person;

        String filename = "L21 Architecture/src/demopersist/Person.ser";
        try (FileInputStream f_in = new FileInputStream(filename);
             ObjectInputStream obj_in = new ObjectInputStream(f_in)
        ) {
            Object obj = obj_in.readObject();
            person = (Person) obj;
        } catch (IOException | ClassNotFoundException ex) {
            IO.println("Error deserializing object");
            IO.println(ex);
            return;
        }
        IO.println("Person er hentet: " + person);

        person.addGrade(4);
        person.addGrade(7);

        try (FileOutputStream f_out = new FileOutputStream(filename);
             ObjectOutputStream obj_out = new ObjectOutputStream(f_out)
        ) {
            obj_out.writeObject(person);
            IO.println("Person er gemt: " + person);
        } catch (IOException ex) {
            IO.println("Error serializing object");
            IO.println(ex);
        }
    }
}
