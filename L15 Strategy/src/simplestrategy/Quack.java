package simplestrategy;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		IO.println("Quack");
	}
}
