package iterator.withjavaiterator;

import java.util.Iterator;

public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.iterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.iterator();

		IO.println("MENU\n----\nBREAKFAST");
		this.printMenu(pancakeIterator);
		IO.println("\nLUNCH");
		this.printMenu(dinerIterator);
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			IO.print(menuItem.getName() + ", ");
			IO.print(menuItem.getPrice() + " -- ");
			IO.println(menuItem.getDescription());
		}
	}
}
