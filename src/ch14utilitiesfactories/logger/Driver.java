package ch14utilitiesfactories.logger;

public class Driver {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.logMessage("Haha");
    }
}
