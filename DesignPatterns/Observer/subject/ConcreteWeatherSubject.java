package DesignPatterns.Observer.subject;

import java.util.ArrayList;

import DesignPatterns.Observer.observer.WeatherObserver;

public class ConcreteWeatherSubject implements WeatherSubject{
    private ArrayList<WeatherObserver> observers;
    private int temperature;
    private int humidity;
    private int pressure;

    public ConcreteWeatherSubject(){
        observers = new ArrayList<WeatherObserver>();
    }

    @Override
    public void registerObserver(WeatherObserver weatherObserver) {
        observers.add(weatherObserver);
    }

    @Override
    public void unregisterObserver(WeatherObserver weatherObserver) {
        observers.remove(weatherObserver);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver weatherObserver : observers) {
            weatherObserver.update(temperature, humidity, pressure);
        }
    }
    
    public void updateMeasurements(int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
