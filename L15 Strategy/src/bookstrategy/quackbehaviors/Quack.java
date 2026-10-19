package bookstrategy.quackbehaviors;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		IO.println("Quack");
	}
}
