package DesignPatterns.Facade.facadeClasses;

import DesignPatterns.Facade.homeTheatreSubsystem.Amplifier;
import DesignPatterns.Facade.homeTheatreSubsystem.CDPlayer;
import DesignPatterns.Facade.homeTheatreSubsystem.DVDPlayer;
import DesignPatterns.Facade.homeTheatreSubsystem.PopcornPopper;
import DesignPatterns.Facade.homeTheatreSubsystem.Projector;
import DesignPatterns.Facade.homeTheatreSubsystem.Screen;
import DesignPatterns.Facade.homeTheatreSubsystem.TheatreLights;
import DesignPatterns.Facade.homeTheatreSubsystem.Tuner;

public class HomeTheatreFacade {
    private Amplifier amplifier;
    private CDPlayer cdPlayer;
    private DVDPlayer dvdPlayer;
    private PopcornPopper popcornPopper;
    private Projector projector;
    private Screen screen;
    private TheatreLights theatreLights;
    private Tuner tuner;

    public HomeTheatreFacade(Amplifier amplifier, CDPlayer cdPlayer, DVDPlayer dvdPlayer, PopcornPopper popcornPopper,
            Projector projector, Screen screen, TheatreLights theatreLights, Tuner tuner) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.theatreLights = theatreLights;
        this.tuner = tuner;
    }

    public void watchMovie(){
        System.out.println("Get ready to watch a movie..."); 
        popcornPopper.on();
        popcornPopper.pop();
        theatreLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play("Shaw shank Redemption");
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down..."); 
        popcornPopper.off();
        theatreLights.on();
        screen.up();
        projector.off();
        theatreLights.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
