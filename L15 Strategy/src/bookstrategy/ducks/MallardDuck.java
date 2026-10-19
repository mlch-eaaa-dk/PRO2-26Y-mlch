package bookstrategy.ducks;

import bookstrategy.flybehaviors.FlyWithWings;
import bookstrategy.quackbehaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        IO.println("I'm a real Mallard duck");
    }
}
