package bookstrategy.ducks;

import bookstrategy.flybehaviors.FlyNoWay;
import bookstrategy.quackbehaviors.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        IO.println("I'm a duck Decoy");
    }
}
