package demoapplication.gui;

import demoapplication.controller.Controller;
import demoapplication.controller.Storage;
import demoapplication.storage.ListStorage;
import javafx.application.Application;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class StudentApp {
    void main() {
        String fileName = "L21 Architecture/src/demoapplication/storage.ser";
        Storage storage = ListStorage.loadStorage(fileName);
        if (storage == null) {
            storage = new ListStorage();
            IO.println("Empty ListStorage is created");
            Controller.setStorage(storage);
            initStorage();
            IO.println("Storage is initialized");
        } else {
            Controller.setStorage(storage);
        }

        Application.launch(StudentGui.class);

        ListStorage.saveStorage(fileName, storage);
    }

    public static void initStorage() {
        Controller.createStudent("Ib Ibsen", 20, true);
        Controller.createStudent("Jens Jens", 30, false);
    }
}
