package com.techiq.ecommercebackend.ecommercebackend.api.model;

public class DataChange <T> {

    private ChangeType changeType;
    private T Data;

    public DataChange() {
    }

    public DataChange(ChangeType changeType, T data) {
        this.changeType = changeType;
        Data = data;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    public ChangeType getChangeType() {
        return changeType;
    }

    public enum ChangeType {
        INSERT,
        UPDATE,
        DELETE
    }
}
