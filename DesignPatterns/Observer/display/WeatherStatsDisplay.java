package DesignPatterns.Observer.display;

import DesignPatterns.Observer.observer.WeatherObserver;

public class WeatherStatsDisplay implements Display, WeatherObserver{
    private int temperature;
    private int humidity;
    private int pressure;

    @Override
    public void display() {
        System.out.println("Stats diplay: ");
        System.out.print("Temperature: " + temperature + " ");
        System.out.print("Humidity: " + humidity + " ");
        System.out.print("Pressure: " + pressure + "\n");
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
