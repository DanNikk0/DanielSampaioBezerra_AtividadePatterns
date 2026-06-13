public class Main {
    public static void main(String[] args) {
        LegacyLogger legacyLogger = new LegacyLogger();
        Logger logger = new LegacyLoggerAdapter(legacyLogger);
        Application application = new Application(logger);
        application.run();
    }
}