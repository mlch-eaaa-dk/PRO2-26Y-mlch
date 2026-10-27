package iterator.dinerpancakehousecafemerger;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinerMenu implements Iterable<MenuItem> {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        this.addItem("Vegetarian BLT",
            "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99
        );
        this.addItem("BLT",
            "Bacon with lettuce & tomato on whole wheat", false, 2.99
        );
        this.addItem("Soup of the day",
            "Soup of the day, with a side of potato salad", false, 3.29
        );
        this.addItem("Hotdog",
            "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05
        );
        this.addItem("Steamed Veggies and Brown Rice",
            "Steamed vegetables over brown rice", true, 3.99
        );
        this.addItem("Pasta",
            "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89
        );
    }

    public void addItem(
        String name, String description,
        boolean vegetarian, double price
    ) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    // other menu methods here

    @Override
    public Iterator<MenuItem> iterator() {
        return new DinerMenuIterator(menuItems);
    }

    private static class DinerMenuIterator implements Iterator<MenuItem> {
        private final MenuItem[] items;
        private int position = 0;

        public DinerMenuIterator(MenuItem[] items) {
            this.items = items;
        }

        @Override
        public MenuItem next() {
            if (!this.hasNext())
                throw new NoSuchElementException();

            MenuItem menuItem = items[position];
            position = position + 1;
            return menuItem;
        }

        @Override
        public boolean hasNext() {
            return position < items.length && items[position] != null;
        }
    }
}
