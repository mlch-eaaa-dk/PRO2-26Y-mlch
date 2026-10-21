package misguided_weatherstation_book.displays;

public class ForecastDisplay implements DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public void update(float temp, float humidity, float pressure) { // push
        lastPressure = currentPressure;
        currentPressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        IO.println("*** Forecast *** ");
        if (currentPressure > lastPressure) {
            IO.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            IO.println("More of the same");
        } else if (currentPressure < lastPressure) {
            IO.println("Watch out for cooler, rainy weather");
        }
    }
}
