package bookstrategy.flybehaviors;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        IO.println("I'm flying!!");
    }
}
