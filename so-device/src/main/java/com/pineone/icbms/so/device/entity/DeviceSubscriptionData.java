package com.pineone.icbms.so.device.entity;

public class DeviceSubscriptionData {
    //
    private String      _uri;
    private String _notificationUri;

    public DeviceSubscriptionData() {
    }

    public DeviceSubscriptionData(String _uri, String _notificationUri) {
        this._uri = _uri;
        this._notificationUri = _notificationUri;
    }

    public String get_uri() {
        return _uri;
    }

    public void set_uri(String _uri) {
        this._uri = _uri;
    }

    public String get_notificationUri() {
        return _notificationUri;
    }

    public void set_notificationUri(String _notificationUri) {
        this._notificationUri = _notificationUri;
    }

    @Override
    public String toString() {
        return "DeviceSubscriptionData{" +
                "_uri='" + _uri + '\'' +
                ", _notificationUri='" + _notificationUri + '\'' +
                '}';
    }
}
