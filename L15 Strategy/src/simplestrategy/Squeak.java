package simplestrategy;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        IO.println("Squeak");
    }
}
