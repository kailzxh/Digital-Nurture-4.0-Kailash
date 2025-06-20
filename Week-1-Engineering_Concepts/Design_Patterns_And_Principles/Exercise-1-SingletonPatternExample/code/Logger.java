public class Logger {
    //private static instance
    private static Logger logger;
    //Private constructor - no external init
    private Logger() {
        System.out.println("Logger Initialized");
    }
    //access to the logger
    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger(); // Lazy initialization
        }
        return logger;
    }
}
