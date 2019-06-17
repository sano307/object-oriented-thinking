package root.chapter02;

import root.chapter02.display.CurrentConditionDisplay;
import root.chapter02.display.StatisticsDisplay;
import root.chapter02.model.Weather;

public class ObserverPattern {
    public static void main(String[] args) {

        Weather weather = new Weather();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weather);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weather);
        weather.setMeasurements(80, 65, 30.4f);
        weather.setMeasurements(70, 65, 30.4f);
        weather.setMeasurements(60, 65, 30.4f);

        currentConditionDisplay.turnOffNotify();
        weather.setMeasurements(50, 65, 30.4f);

        statisticsDisplay.turnOffNotify();
        weather.setMeasurements(40, 65, 30.4f);
    }
}
