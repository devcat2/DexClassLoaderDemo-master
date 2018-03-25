package com.crystal.resourcemanager;

import android.content.Context;
import android.content.res.Resources;

import com.crystal.resourcemanager.exception.DeviceResourceException;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by xpchi on 2018/3/25.
 */

public class DeviceResourceService {

    private static final String DEVICE_CONFIG_FILE_NAME = "keycodeandbroadcast_adapter.properties";

    public static DeviceConfiguration load(Context context, String path) throws DeviceResourceException {
        DeviceConfiguration deviceConfiguration = new DeviceConfiguration();
        try{
            Resources resources = DeviceResourcesLoader.loadResources(context, path);
            InputStream in = resources.getAssets().open(DEVICE_CONFIG_FILE_NAME);
            Properties properties = new Properties();
            properties.load(in);

            Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();
            Iterator<Map.Entry<Object, Object>> iterator = entrySet.iterator();
            while(iterator.hasNext()) {
                Map.Entry<Object, Object> entry = iterator.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
                String keyName = key.toString();
                Field field = deviceConfiguration.getClass().getDeclaredField(keyName);
                if (field != null) {
                    field.setAccessible(true);
                    field.set(deviceConfiguration, value.toString());
                }
            }
        }catch(Exception e) {
            throw new DeviceResourceException("load device resource exception", e);
        }
        return deviceConfiguration;
    }
}
