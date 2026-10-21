package misguided_weatherstation_book.displays;

public class StatisticsDisplay implements DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;
        if (temp > maxTemp) maxTemp = temp;
        if (temp < minTemp) minTemp = temp;
        this.display();
    }

    @Override
    public void display() {
        IO.println("*** Statistics ***");
        IO.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp
        );
    }
}
