package observer_weatherstation_simplified.displays;

public class StatisticsDisplay implements Observer {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings = 0;

    @Override
    public void update(float temp, float humidity, float pressure) { // push
        tempSum += temp;
        numReadings++;
        if (temp > maxTemp) maxTemp = temp;
        if (temp < minTemp) minTemp = temp;

        IO.println("*** Statistics ***");
        IO.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
            + "/" + maxTemp + "/" + minTemp
        );
    }

//    @Override
//    public void update(WeatherData weatherData) { // pull
//        float temp = weatherData.getTemperature();
//        tempSum += temp;
//        numReadings++;
//        if (temp > maxTemp) maxTemp = temp;
//        if (temp < minTemp) minTemp = temp;
//
//        IO.println("*** Statistics ***");
//        IO.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
//                + "/" + maxTemp + "/" + minTemp);
//    }
}
