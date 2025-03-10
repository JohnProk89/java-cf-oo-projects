package ch14utilitiesfactories.logger;

public class LoggerDriver {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.logMessage("Haha");
    }
}
