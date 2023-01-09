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
        Display currentDisplay = new CurrentWeatherDisplay();
        Display weatherForecastDisplay = new WeatherForecast();
        Display weatherStatsDisplay = new WeatherStatsDisplay();
        weatherSubject.registerObserver((WeatherObserver)currentDisplay);
        weatherSubject.registerObserver((WeatherObserver)weatherForecastDisplay);
        weatherSubject.registerObserver((WeatherObserver)weatherStatsDisplay);
        ((ConcreteWeatherSubject) weatherSubject).updateMeasurements(34,12,10);
    }
}
