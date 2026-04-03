package com.spring.boot.aixm;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AIXMFeature {

    private String gmlId;
    private String type;
    private String href;
    protected JAXBElement<AIXMAttribute> attribute;

    public AIXMFeature(String gmlId, String type) {
        this.gmlId = gmlId;
        this.type = type;
    }

    public String getGmlId() {
        return gmlId;
    }

    public void setGmlId(String gmlId) {
        this.gmlId = gmlId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public JAXBElement<AIXMAttribute> getAttribute() {
        return attribute;
    }

    public void setAttribute(JAXBElement<AIXMAttribute> attribute) {
        this.attribute = attribute;
    }   
}