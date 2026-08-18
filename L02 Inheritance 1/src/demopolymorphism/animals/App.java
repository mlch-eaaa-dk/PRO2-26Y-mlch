package demopolymorphism.animals;

public class App {
    void main() {
        Cat cat = new Cat(500);
        Dog dog = new Dog(1000);
        Donkey donkey = new Donkey(3000);
        Snake snake = new Snake(2000);

        cat.makeSound();
        dog.makeSound();
        donkey.makeSound();
        snake.makeSound();
        IO.println();

        IO.println("Prices:");
        IO.println(cat.getClass().getSimpleName() + " kr. " + cat.getPrice());
        IO.println(dog.getClass().getSimpleName() + " kr. " + dog.getPrice());
        IO.println(donkey.getClass().getSimpleName() + " kr. " + donkey.getPrice());
        IO.println(snake.getClass().getSimpleName() + " kr. " + snake.getPrice());
        IO.println();

        int totalPrice = cat.getPrice() + dog.getPrice() + donkey.getPrice() + snake.getPrice();
        IO.println("Total price: " + totalPrice);
    }
}

class Cat {
    private int price;

    public Cat(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void makeSound() {
        IO.println("Cat: Meow");
    }
}

class Dog {
    private int price;

    public Dog(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void makeSound() {
        IO.println("Dog: woof");
    }
}

class Donkey {
    private int price;

    public Donkey(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void makeSound() {
        IO.println("Donkey: hee-haw");
    }
}

class Snake {
    private int price;

    public Snake(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void makeSound() {
        IO.println("Snake: hiss");
    }
}
