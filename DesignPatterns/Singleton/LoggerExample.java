package DesignPatterns.Singleton;
public class LoggerExample{
    public static void main(String[] args) throws InterruptedException{
        Thread threadOne = new Thread() {
            public void run(){
                Logger logger = Logger.getLogger();
                logger.log("Logs from thread one.");
            }
        };
        Thread threadTwo = new Thread() {
            public void run() {
                Logger logger = Logger.getLogger();
                logger.log("Logs from thread two.");
            }
        };
        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
    }
}