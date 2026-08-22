package demointerface.size;

public class SizeApp {
    void main() {
        Dog[] dogs = {new Dog(45), new Dog(30), new Dog(50), new Dog(20)};
        int maxDogSize = max(dogs);
        IO.println("Dogs max size: " + maxDogSize);

        Country[] countries = {new Country(450), new Country(700), new Country(500)};
        int maxCountrySize = max(countries);
        IO.println("Countries max size: " + maxCountrySize);

    }

    /** Pre: Param arr is not empty. */
    static int max(Dog[] arr) {
        Dog max = arr[0];
        for (Dog obj : arr) {
            if (obj.getSize() > max.getSize())
                max = obj;
        }
        return max.getSize();
    }

    /** Pre: Param arr is not empty. */
    static int max(Country[] arr) {
        Country max = arr[0];
        for (Country obj : arr) {
            if (obj.getSize() > max.getSize())
                max = obj;
        }
        return max.getSize();
    }
}

class Dog {
    private int height;

    public Dog(int height) {
        this.height = height;
    }

    public int getSize() {
        return height;
    }
}

class Country {
    private int area;

    public Country(int area) {
        this.area = area;
    }

    public int getSize() {
        return area;
    }
}
