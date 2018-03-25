package com.crystal.resourcemanager.exception;

/**
 * Created by xpchi on 2018/3/24.
 */

public class DeviceResourceLoadExceprion extends Exception {

    public DeviceResourceLoadExceprion() {
    }

    public DeviceResourceLoadExceprion(String message) {
        super(message);
    }

    public DeviceResourceLoadExceprion(String message, Throwable cause) {
        super(message, cause);
    }
}
