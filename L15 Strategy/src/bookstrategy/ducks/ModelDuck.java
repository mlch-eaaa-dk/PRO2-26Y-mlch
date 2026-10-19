package bookstrategy.ducks;

import bookstrategy.flybehaviors.FlyNoWay;
import bookstrategy.quackbehaviors.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        IO.println("I'm a model duck");
    }
}
