package root.chapter02.display;

import root.chapter02.event.Observer;
import root.chapter02.event.Subject;

public class StatisticsDisplay implements Display, Observer {

    private Subject weather;
    private float averageTemperature = 0.0F;
    private float averageHumidity = 0.0F;

    public StatisticsDisplay(Subject weather) {
        this.weather = weather;
        turnOnNotify();
    }

    @Override
    public void show() {
        System.out.printf(
                "Average conditions: %fF degrees and %f%% humidity.\n",
                averageTemperature,
                averageHumidity);
    }

    @Override
    public void update(float temperature,
                       float humidity,
                       float pressure) {
        averageTemperature += temperature;
        averageTemperature = averageTemperature / 2;
        averageHumidity += humidity;
        averageHumidity = averageHumidity / 2;
        show();
    }

    @Override
    public void turnOnNotify() {
        weather.register(this);
    }

    @Override
    public void turnOffNotify() {
        weather.remove(this);
    }
}
