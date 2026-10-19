package bookstrategy.quackbehaviors;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        IO.println("<< Silence >>");
    }
}
