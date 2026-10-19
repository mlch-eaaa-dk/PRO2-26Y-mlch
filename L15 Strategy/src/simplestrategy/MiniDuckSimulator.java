package simplestrategy;

public class MiniDuckSimulator {
	void main() {
		MallardDuck mallard = new MallardDuck();
		mallard.display();
		IO.println();

		mallard.quack();
		IO.println();

		mallard.setQuackBehavior(new Squeak());
		mallard.quack();
		IO.println();
	}
}
