package composite.menu_book;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
	private String name;
	private String description;
	private final List<MenuComponent> menuComponents = new ArrayList<>();

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	//-------------------------------------------------------------------------

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	@Override
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
