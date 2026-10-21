package misguided_weatherstation_book.displays;

public class CurrentConditionsDisplay implements DisplayElement {
    private float temperature;
    private float humidity;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }

    @Override
    public void display() {
        IO.println("*** Current conditions ***");
        IO.println(temperature + "F degrees and " + humidity + "% humidity");
    }
}
