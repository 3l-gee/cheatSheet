package com.spring.boot.aixm;


public class AIXMAttribute {

    protected String value;
    protected String nilReason;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNilReason() {
        return nilReason;
    }

    public void setNilReason(String nilReason) {
        this.nilReason = nilReason;
    }
}