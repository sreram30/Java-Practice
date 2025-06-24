public class logger {
    private static Logger instance = new Logger();
    private Logger() {
        System.out.println("Logger instance created");
    }
    public static Logger getInstance() {
        return instance;
    }
    public void log(String message) {
        System.out.println("Log: " + message);
    }
    public class Main {
        public static void main(String[] args) {
            Logger logger1 = Logger.getInstance();
            Logger logger2 = Logger.getInstance();
            logger1.log("First log message");
            logger2.log("Second log message");
            if (logger1 == logger2) {
                System.out.println("Same instance used");
            } else {
                System.out.println("Different instances");
            }
        }
    }
}

