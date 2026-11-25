import java.util.ArrayList;
import java.util.List;

public class OrderSubject {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyAll(String status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}
