package iterator.withjavaiterator;

public class WaitressIterable {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public WaitressIterable(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        IO.println("MENU\n----\nBREAKFAST");
        this.printMenu(pancakeHouseMenu);
        IO.println("\nLUNCH");
        this.printMenu(dinerMenu);
    }

    private void printMenu(Iterable<MenuItem> iterable) {
        for (MenuItem menuItem : iterable) {
            IO.print(menuItem.getName() + ", ");
            IO.print(menuItem.getPrice() + " -- ");
            IO.println(menuItem.getDescription());
        }
    }
}
