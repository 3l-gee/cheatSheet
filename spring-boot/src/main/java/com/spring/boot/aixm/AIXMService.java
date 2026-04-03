package com.spring.boot.aixm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

@Service
public class AIXMService {

    private final Map<String, AIXMFeature> storage = new ConcurrentHashMap<>();

    public AIXMFeature save(AIXMFeature feature) {
        storage.put(feature.getGmlId(), feature);
        return feature;
    }

    public List<AIXMFeature> getAll() {
        return new ArrayList<>(storage.values());
    }

    public AIXMFeature findById(String id) {
        return storage.get(id);
    }

    public void process(AIXMMessage message) {
        for (AIXMFeature feature : message.getFeatures()) {
            storage.put(feature.getGmlId(), feature);
        }
    }

    private String mapToDatabaseId(String gmlId) {
        return "DB-" + gmlId;
    }
}
