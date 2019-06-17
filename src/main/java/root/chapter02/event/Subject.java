package root.chapter02.event;

public interface Subject {
    void register(Observer o);
    void remove(Observer o);
    void notifyObservers();
}
