package ch14.logger;

import java.time.LocalDateTime;

public class Logger {
    private static final Logger LOGGER = new Logger();

    private Logger() {}

    public static Logger getLogger() { return LOGGER; }

    public void logMessage(String message) {
        System.err.println(message + ": " + LocalDateTime.now());
    }
}
