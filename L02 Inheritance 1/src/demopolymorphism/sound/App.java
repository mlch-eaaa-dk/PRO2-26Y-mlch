package demopolymorphism.sound;

public class App {
    void main() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Donkey donkey = new Donkey();
        Snake snake = new Snake();

        cat.makeSound();
        dog.makeSound();
        donkey.makeSound();
        snake.makeSound();
    }
}

class Cat {
    public void makeSound() {
        IO.println("Cat: Meow");
    }
}

class Dog {
    public void makeSound() {
        IO.println("Dog: woof");
    }
}

class Donkey {
    public void makeSound() {
        IO.println("Donkey: hee-haw");
    }
}

class Snake {
    public void makeSound() {
        IO.println("Snake: hiss");
    }
}
