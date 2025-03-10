package ch14utilitiesfactories.logger;

import java.time.LocalDateTime;

/**
 * Singleton design pattern implementation on a Logger
 */
public class Logger {
    private static final Logger LOGGER = new Logger();

    private Logger() {}

    public static Logger getLogger() { return LOGGER; }

    /**
     * Logs messages in the standard output
     * @param message to be logged
     */
    public void logMessage(String message) {
        System.err.println(message + ": " + LocalDateTime.now());
    }
}
