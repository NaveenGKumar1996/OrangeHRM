package edu.learning.utils;

import edu.learning.Constants.FrameworkConstants;
import edu.learning.Enums.ConfigEnum;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class PropUtils {

    private static final Properties props = new Properties();

    //If HashTable don't suit you well, and you need to retrieve a lot then prefer HashMap
    private static final Map<String, String> map = new HashMap<>();

    private PropUtils() {

    }

    static {
        try {
            FileInputStream fis = new FileInputStream(FrameworkConstants.getConfigPath());
            props.load(fis);

            for (Map.Entry<Object, Object> entry : props.entrySet()) {
                map.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
            }

            // props.entrySet().forEach(entry -> map.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static String getValue(ConfigEnum key) {
        try {
            if (Objects.isNull(key) || Objects.isNull(map.get(key))) {
                throw new Exception("Property name" + key + "is not found, Please check ConfigProps");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return map.get(key.name().toLowerCase());
    }
}
