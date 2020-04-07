package com.microsoft.windowsazure.messaging.notificationhubs;

/**
 * Wraps a record of a device, for use resolving future requests to broadcast notifications.
 */
public class Installation {
    private String pushChannel;

    /**
     * Fetches the unique code that will be used to identify this device.
     * @return A unique code that will be used to identify this device.
     */
    public String getPushChannel() {
        return pushChannel;
    }

    /**
     * Sets the unique code that will be used to identify the device originating this {@link Installation}.
     * @param pushChannel A unique code that identifies this device. Should be generated by your
     *                    operating system, or the library that is being used to centralize polling
     *                    for new notifications.
     */
    public void setPushChannel(String pushChannel) {
        this.pushChannel = pushChannel;
    }
}