package iterator.dinerpancakehousemerger;

import java.util.ArrayList;

public class Waitress {
	private final PancakeHouseMenu pancakeHouseMenu;
	private final DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	// first attempt
	public void printMenuWithLoop() {
		IO.println("MENU\n----\nBREAKFAST");
		ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            IO.print(menuItem.getName() + ", ");
            IO.print(menuItem.getPrice() + " -- ");
            IO.println(menuItem.getDescription());
        }
		IO.println();

		IO.println("\nLUNCH");
		MenuItem[] lunchItems = dinerMenu.getMenuItems();
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            IO.print(menuItem.getName() + ", ");
            IO.print(menuItem.getPrice() + " -- ");
            IO.println(menuItem.getDescription());
        }
		IO.println();
	}

	// second attempt: with Iterator
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();

		IO.println("MENU\n----\nBREAKFAST");
		this.printMenu(pancakeIterator);
		IO.println("\nLUNCH");
		this.printMenu(dinerIterator);
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			IO.print(menuItem.getName() + ", ");
			IO.print(menuItem.getPrice() + " -- ");
			IO.println(menuItem.getDescription());
		}
	}

	// other methods here
}
