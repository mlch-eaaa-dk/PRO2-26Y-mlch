package iterator.withjavaiterator;

public class MenuTestDrive {
    void main() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
//		WaitressIterable waitress = new WaitressIterable(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
