package demopersist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersistPerson {
    void main() {
        Person p = new Person("Jane Jensen");
        p.addGrade(12);
        p.addGrade(10);
        p.addGrade(7);
        p.addGrade(12);

        String filename = "L21 Architecture/src/demopersist/Person.ser";
        try (FileOutputStream f_out = new FileOutputStream(filename);
             ObjectOutputStream obj_out = new ObjectOutputStream(f_out)
        ) {
            obj_out.writeObject(p);
            IO.println("Person er gemt: " + p);
        } catch (IOException ex) {
            IO.println("Error serializing object");
            IO.println(ex);
        }
    }
}
