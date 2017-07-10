package com.example.ismael.infosaude.singletons;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Ismael on 24/03/2017.
 */

public class ConfigurationsProperties {
    private static final ConfigurationsProperties ourInstance = new ConfigurationsProperties();
    private static Properties mConfigurationProperty;
    private static String mBaseUrl;

    public static ConfigurationsProperties getInstance() {
        return ourInstance;
    }

    private ConfigurationsProperties() {
    }

    public static void init(Context context) {
        AssetsPropertyReader reader = new AssetsPropertyReader(context);
        mConfigurationProperty = reader.getProperties("configurations.properties");
        mBaseUrl = mConfigurationProperty.getProperty("base.url");

    }

    public static Properties getmConfigurationProperty() {
        return mConfigurationProperty;
    }

    public static void setmConfigurationProperty(Properties mConfigurationProperty) {
        ConfigurationsProperties.mConfigurationProperty = mConfigurationProperty;
    }

    public static String getmBaseUrl() {
        return mBaseUrl;
    }

    public static void setmBaseUrl(String mBaseUrl) {
        ConfigurationsProperties.mBaseUrl = mBaseUrl;
    }

    static class AssetsPropertyReader {

        private static final String sTag = AssetsPropertyReader.class.getName();

        private Context mContext;
        private Properties mProperties;

        public AssetsPropertyReader(Context context) {
            mContext = context;
            mProperties = new Properties();
        }

        public Properties getProperties(String FileName) {

            try {
                AssetManager assetManager = mContext.getAssets();
                InputStream inputStream = assetManager.open(FileName);
                mProperties.load(inputStream);

            } catch (IOException e) {
                Log.e(sTag, e.getMessage());
            }

            return mProperties;
        }
    }
}
