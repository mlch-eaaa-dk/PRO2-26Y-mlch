package iterator.dinerpancakehousecafemerger;

import java.util.Iterator;

public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;
	private CafeMenu cafeMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, CafeMenu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.iterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.iterator();
		Iterator<MenuItem> cafeIterator = cafeMenu.iterator();

		IO.println("MENU\n----\nBREAKFAST");
		this.printMenu(pancakeIterator);
		IO.println("\nLUNCH");
		this.printMenu(dinerIterator);
		IO.println("\nDINNER");
		this.printMenu(cafeIterator);
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
