package bookstrategy.flybehaviors;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        IO.println("I'm flying with a rocket");
    }
}
