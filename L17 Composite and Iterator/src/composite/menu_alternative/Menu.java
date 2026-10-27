package composite.menu_alternative;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent { // could be named CompositeMenu
    private final List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, String description) {
        super(name, description);
    }

    //-------------------------------------------------------------------------

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    //-------------------------------------------------------------------------

    @Override
    public void print() {
        IO.print("\n" + this.getName());
        IO.println(", " + this.getDescription());
        IO.println("---------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
