package DesignPatterns.Observer;

import DesignPatterns.Observer.display.CurrentWeatherDisplay;
import DesignPatterns.Observer.display.Display;
import DesignPatterns.Observer.display.WeatherForecast;
import DesignPatterns.Observer.display.WeatherStatsDisplay;
import DesignPatterns.Observer.observer.WeatherObserver;
import DesignPatterns.Observer.subject.ConcreteWeatherSubject;
import DesignPatterns.Observer.subject.WeatherSubject;

public class TestObserver {
    public static void main(String []args){
        WeatherSubject weatherSubject = new ConcreteWeatherSubject();

        System.out.println("Current display registered.");
        Display currentDisplay = new CurrentWeatherDisplay(weatherSubject);

        System.out.println("Weather Forecast display registered.");
        Display weatherForecastDisplay = new WeatherForecast(weatherSubject);

        System.out.println("WeatherStats registered.");
        Display weatherStatsDisplay = new WeatherStatsDisplay(weatherSubject);
        
        System.out.println("Measurements updated");
        ((ConcreteWeatherSubject) weatherSubject).updateMeasurements(34,12,10);

        System.out.println("Current display unregistered.");
        weatherSubject.unregisterObserver((WeatherObserver) currentDisplay);
        System.out.println("Measurements updated.");
        ((ConcreteWeatherSubject) weatherSubject).updateMeasurements(120, 130, 140);
    }
}
