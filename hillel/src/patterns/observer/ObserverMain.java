package patterns.observer;

/**
 * Created by APavlov on 05.11.2015.
 */
public class ObserverMain {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
        WeatherDisplay current = new WeatherDisplay();
        WeatherStatistic statistic = new WeatherStatistic();
        WeatherForecast forecast = new WeatherForecast();

        station.register(current);
        station.register(statistic);
        station.register(forecast);

        station.setPressure(20);
        station.setHumidity(50);
        station.setTemperature(10);

        station.measurementChanged();

        current.display();
        statistic.display();
        forecast.display();

        station.setPressure(15);
        station.setHumidity(45);
        station.setTemperature(25);

        //station.removeObserver(current);
        station.measurementChanged();

        current.display();
        statistic.display();
        forecast.display();
    }
}
