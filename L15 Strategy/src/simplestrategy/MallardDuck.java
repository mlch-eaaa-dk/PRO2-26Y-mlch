package simplestrategy;

public class MallardDuck {
    private QuackBehavior quackBehavior;

    public MallardDuck() {
        quackBehavior = new Quack();
    }

    public void display() {
        IO.println("I'm a real Mallard duck");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void quack() {
        quackBehavior.quack();
    }
}
