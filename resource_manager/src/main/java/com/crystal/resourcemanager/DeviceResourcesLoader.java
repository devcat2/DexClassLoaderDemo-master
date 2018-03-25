package com.crystal.resourcemanager;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

import com.crystal.resourcemanager.exception.DeviceResourceLoadExceprion;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by xpchi on 2018/3/24.
 */

public class DeviceResourcesLoader {


    public static Resources loadResources(Context context, String path) throws DeviceResourceLoadExceprion {
       try {
           return getResources(context, path);
       } catch (Exception e) {
           throw new DeviceResourceLoadExceprion("Device resources load fail", e);
       }
    }



    private static Resources getResources(Context context, String apkPath) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        AssetManager assetManager = createAssetManager(apkPath);
        Resources resources = new Resources(assetManager,
                context.getResources().getDisplayMetrics(),
                context.getResources().getConfiguration());
        return resources;
    }

    private static AssetManager createAssetManager(String apkPath) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        AssetManager assetManager = AssetManager.class.newInstance();
        AssetManager.class.getDeclaredMethod("addAssetPath", String.class)
                .invoke(assetManager, apkPath);
        return assetManager;
    }
}
