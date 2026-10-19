package bookstrategy.ducks;

import bookstrategy.flybehaviors.FlyNoWay;
import bookstrategy.quackbehaviors.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        IO.println("I'm a rubber duck");
    }
}
