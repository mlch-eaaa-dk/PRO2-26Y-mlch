package observer_weatherstation_simplified.displays;

public class ForecastDisplay implements Observer {
    private float currentPressure = 29.92f;

    @Override
    public void update(float temp, float humidity, float pressure) { // push
        float lastPressure = currentPressure;
        currentPressure = pressure;

        IO.println("*** Forecast *** ");
        if (currentPressure > lastPressure) {
            IO.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            IO.println("More of the same");
        } else if (currentPressure < lastPressure) {
            IO.println("Watch out for cooler, rainy weather");
        }
    }

//    @Override
//    public void update(WeatherData weatherData) { // pull
//        float lastPressure = currentPressure;
//        currentPressure = weatherData.getPressure();
//
//        IO.println("*** Forecast *** ");
//        if (currentPressure > lastPressure) {
//            IO.println("Improving weather on the way!");
//        } else if (currentPressure == lastPressure) {
//            IO.println("More of the same");
//        } else if (currentPressure < lastPressure) {
//            IO.println("Watch out for cooler, rainy weather");
//        }
//    }
}
