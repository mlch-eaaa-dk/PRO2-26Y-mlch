package list26y;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class City {
    private String name;
    private int inhabitants;

    public City(String name, int inhabitants) {
        this.name = name;
        this.inhabitants = inhabitants;
    }

    @Override
    public String toString() {
        return String.format("%s:%,d", name, inhabitants);
    }
}
