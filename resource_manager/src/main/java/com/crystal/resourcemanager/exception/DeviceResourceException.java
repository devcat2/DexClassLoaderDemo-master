package com.crystal.resourcemanager.exception;

/**
 * Created by xpchi on 2018/3/25.
 */

public class DeviceResourceException extends DeviceResourceLoadExceprion{

    public DeviceResourceException() {
    }

    public DeviceResourceException(String message) {
        super(message);
    }

    public DeviceResourceException(String message, Throwable cause) {
        super(message, cause);
    }
}
