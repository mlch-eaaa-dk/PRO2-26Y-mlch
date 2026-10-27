package composite.menu_alternative;

public class MenuItem extends MenuComponent {
    private double price;

    public MenuItem(String name, String description, double price) {
        super(name, description);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    //-------------------------------------------------------------------------

    @Override
    public void print() {
        IO.print("  " + this.getName());
        IO.println(", " + this.getPrice());
        IO.println("     -- " + this.getDescription());
    }
}
