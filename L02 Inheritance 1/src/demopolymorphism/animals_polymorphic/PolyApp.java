package demopolymorphism.animals_polymorphic;

import java.util.ArrayList;

public class PolyApp {
    void main() {
        IO.println("POLYMORPHISM");
        IO.println();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat(500));
        animals.add(new Dog(1000));
        animals.add(new Donkey(3000));
        animals.add(new Snake(2000));
        // animals.add(new Animal(0));

        for (Animal animal : animals) {
            animal.makeSound();
        }
        IO.println();


        IO.println("Prices:");
        for (Animal animal : animals) {
            IO.println(animal.getClass().getSimpleName() + " kr. " + animal.getPrice());
        }
        IO.println();

        int totalPrice = 0;
        for (Animal animal : animals) {
            totalPrice += animal.getPrice();
        }
        IO.println("Total price: " + totalPrice);
    }
}

class Animal {
    private int price;

    public Animal(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void makeSound() {
        IO.println("Animal: ???");
    }

//    public abstract void makeSound();
}

class Cat extends Animal {
    public Cat(int price) {
        super(price);
    }

    @Override
    public void makeSound() {
        IO.println("Cat: Meow");
    }
}

class Dog extends Animal {
    public Dog(int price) {
        super(price);
    }

    @Override
    public void makeSound() {
        IO.println("Dog: woof");
    }
}

class Donkey extends Animal {
    public Donkey(int price) {
        super(price);
    }

    @Override
    public void makeSound() {
        IO.println("Donkey: hee-haw");
    }
}

class Snake extends Animal {
    public Snake(int price) {
        super(price);
    }

    @Override
    public void makeSound() {
        IO.println("Snake: hiss");
    }
}
