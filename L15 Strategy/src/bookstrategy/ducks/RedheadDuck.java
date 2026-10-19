package bookstrategy.ducks;

import bookstrategy.flybehaviors.FlyWithWings;
import bookstrategy.quackbehaviors.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        IO.println("I'm a real Red Headed duck");
    }
}
