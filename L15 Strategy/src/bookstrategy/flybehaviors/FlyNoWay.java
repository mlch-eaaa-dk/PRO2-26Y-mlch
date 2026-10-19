package bookstrategy.flybehaviors;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        IO.println("I can't fly");
    }
}
