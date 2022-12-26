package DesignPatterns.Singleton;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Logger{
    private volatile static Logger logger;
    private Logger(){}
    public static Logger getLogger(){
        if(logger == null){
            synchronized(Logger.class){
                if(logger == null){
                    System.out.println("Logger instantiated");
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
    public void log(String message){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime current_time = LocalDateTime.now();
        System.out.println(formatter.format(current_time)+": "+ message);
    }
}