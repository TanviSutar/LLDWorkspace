package DesignPatterns.Facade;

import DesignPatterns.Facade.facadeClasses.HomeTheatreFacade;
import DesignPatterns.Facade.homeTheatreSubsystem.Amplifier;
import DesignPatterns.Facade.homeTheatreSubsystem.CDPlayer;
import DesignPatterns.Facade.homeTheatreSubsystem.DVDPlayer;
import DesignPatterns.Facade.homeTheatreSubsystem.PopcornPopper;
import DesignPatterns.Facade.homeTheatreSubsystem.Projector;
import DesignPatterns.Facade.homeTheatreSubsystem.TheatreLights;
import DesignPatterns.Facade.homeTheatreSubsystem.Tuner;
import DesignPatterns.Facade.homeTheatreSubsystem.Screen;

public class FacadeDemo {
    public static void main(String args[]){
        HomeTheatreFacade homeTheatre = new HomeTheatreFacade(new Amplifier(), 
                                                            new CDPlayer(), 
                                                            new DVDPlayer(), 
                                                            new PopcornPopper(), 
                                                            new Projector(), 
                                                            new Screen(), 
                                                            new TheatreLights(), 
                                                            new Tuner());

        homeTheatre.watchMovie();
        homeTheatre.endMovie();
    }
}
