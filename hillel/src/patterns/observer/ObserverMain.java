package patterns.observer;

/**
 * Created by APavlov on 05.11.2015.
 */
public class ObserverMain {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        station.setPressure(20);
        station.setHumidity(50);
        station.setTemperature(10);
        station.measurementChanged();

        station.setPressure(15);
        station.setHumidity(45);
        station.setTemperature(25);
        station.measurementChanged();
    }
}
