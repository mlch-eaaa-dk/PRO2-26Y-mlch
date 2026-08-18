package demopolymorphism.sound_polymorphic;

import java.util.ArrayList;

public class PolyApp {
    void main() {
        IO.println("POLYMORPHISM");
        IO.println();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Donkey());
        animals.add(new Snake());

        for (Animal animal : animals) {
            animal.makeSound(); // makeSound() method is polymorphic
        }
    }
}

class Animal {
    public void makeSound() {
        IO.println("Animal: ???");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        IO.println("Cat: Meow");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        IO.println("Dog: woof");
    }
}

class Donkey extends Animal {
    @Override
    public void makeSound() {
        IO.println("Donkey: hee-haw");
    }
}

class Snake extends Animal {
    @Override
    public void makeSound() {
        IO.println("Snake: hiss");
    }
}
