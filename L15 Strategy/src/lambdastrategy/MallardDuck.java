package lambdastrategy;

public class MallardDuck {
    private QuackBehavior quackBehavior;

    public MallardDuck() {
        quackBehavior = () -> IO.println("Quack");
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
