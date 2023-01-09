package DesignPatterns.Observer.subject;

import DesignPatterns.Observer.observer.WeatherObserver;

public interface WeatherSubject {
    void registerObserver(WeatherObserver weatherObserver);
    void unregisterObserver(WeatherObserver weatherObserver);
    void notifyObservers();
}
