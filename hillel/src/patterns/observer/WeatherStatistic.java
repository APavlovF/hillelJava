package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by APavlov on 05.11.2015.
 */
public class WeatherStatistic {

    List<Integer> temperatures = new ArrayList<>();
    List<Integer> humidities = new ArrayList<>();
    List<Integer> pressures = new ArrayList<>();

    public void set(int temperature, int humidity, int pressure) {
        temperatures.add(temperature);
        humidities.add(humidity);
        pressures.add(pressure);
    }

    public void display() {
        System.out.println("Statistic: temperatures: " + temperatures +
                ", humidities: " + humidities +
                ", pressures: " + pressures);
    }

}
