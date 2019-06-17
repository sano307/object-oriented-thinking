package root.chapter02.display;

import root.chapter02.event.Observer;
import root.chapter02.event.Subject;

public class CurrentConditionDisplay implements Display, Observer {

    private Subject weather;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Subject weather) {
        this.weather = weather;
        turnOnNotify();
    }

    @Override
    public void show() {
        System.out.printf(
                "Current conditions: %fF degrees and %f%% humidity.\n",
                temperature,
                humidity);
    }

    @Override
    public void update(float temperature,
                       float humidity,
                       float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
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
