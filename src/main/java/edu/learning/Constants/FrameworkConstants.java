package edu.learning.Constants;

public final class FrameworkConstants {

    private FrameworkConstants() {
    }

    private static final String URL = "https://demoqa.com/";
    private static final String USER_DIR = System.getProperty("user.dir");
    private static final String RESOURCE_PATH = "/src/main/resources";
    private static final String CONFIG_PATH = USER_DIR + RESOURCE_PATH + "/ConfigProps/qa.properties";

    private static final int explicitWait = 20;

    public static String getURL() {
        return URL;
    }

    public static String getConfigPath() {
        return CONFIG_PATH;
    }
    public static int getExplicitWait() {
        return explicitWait;
    }

}
