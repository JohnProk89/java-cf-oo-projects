package ch14utilitiesfactories.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Singleton design pattern implementation on a Logger
 */
public class Logger {
    private static Logger LOGGER = null;

    private Logger() {}

    public static Logger getLogger() {
        if (LOGGER == null) {
            LOGGER = new Logger();
        }
        return LOGGER;
    }

    /**
     * Logs messages in the standard output
     * @param message to be logged
     */
    public void logMessage(String message) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.err.println("[" + LocalDateTime.now().format(formatter) + "] " + message);
    }
}
