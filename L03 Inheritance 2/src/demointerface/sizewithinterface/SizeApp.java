package demointerface.sizewithinterface;

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
    static int max(Sizeable[] arr) {
        Sizeable max = arr[0];
        for (Sizeable obj : arr) {
            if (obj.size() > max.size())
                max = obj;
        }
        return max.size();
    }
}

interface Sizeable {
    int size();
}

class Dog implements Sizeable {
    private int height;

    public Dog(int height) {
        this.height = height;
    }

    @Override
    public int size() {
        return height;
    }
}

class Country implements Sizeable {
    private int area;

    public Country(int area) {
        this.area = area;
    }

    @Override
    public int size() {
        return area;
    }
}
