package DesignPatterns.Observer.display;

import DesignPatterns.Observer.observer.WeatherObserver;
import DesignPatterns.Observer.subject.WeatherSubject;

public class WeatherForecast implements Display, WeatherObserver{
    private int temperature;
    private int humidity;
    private int pressure;
    private WeatherSubject subject;

    public WeatherForecast(WeatherSubject weatherSubject){
        this.subject = weatherSubject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast diplay: ");
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
