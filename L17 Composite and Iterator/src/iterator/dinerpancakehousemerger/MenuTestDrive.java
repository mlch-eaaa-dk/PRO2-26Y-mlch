package iterator.dinerpancakehousemerger;

public class MenuTestDrive {
    void main() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

//        // first attempt
//        waitress.printMenuWithLoop();

        // second attempt
        waitress.printMenu();
    }
}
