package com.spring.boot.aixm;

import java.util.*;

public class AIXMMessage {

    private List<AIXMFeature> features = new ArrayList<>();

    public void addFeature(AIXMFeature feature) {
        features.add(feature);
    }

    public List<AIXMFeature> getFeatures() {
        return features;
    }

    public void setFeatures(List<AIXMFeature> features) {
        this.features = features;
    }
}