package bookstrategy;

import bookstrategy.ducks.*;
import bookstrategy.flybehaviors.FlyRocketPowered;

public class MiniDuckSimulator {
	void main() {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.swim();
		mallard.performQuack();
		mallard.performFly();
		IO.println();

		Duck model = new ModelDuck();
		model.display();
		model.swim();
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		IO.println();

		Duck redhead = new RedheadDuck();
		redhead.display();
		redhead.performFly();
		redhead.performQuack();
		IO.println();

		Duck rubber = new RubberDuck();
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
		IO.println();

		Duck decoy = new DecoyDuck();
		decoy.display();
		decoy.performFly();
		decoy.performQuack();
		IO.println();
	}
}
