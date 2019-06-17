package root.chapter02.event;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
    void turnOnNotify();
    void turnOffNotify();
}
