package org.practise.java.model;

public class ResultContainer {
    private boolean error;
    private String msg;
    private Country[] data;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Country[] getData() {
        return data;
    }

    public void setData(Country[] data) {
        this.data = data;
    }
}
