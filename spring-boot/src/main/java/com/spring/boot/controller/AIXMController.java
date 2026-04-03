package com.spring.boot.controller;

import com.spring.boot.aixm.AIXMFeature;
import com.spring.boot.aixm.AIXMService;
import com.spring.boot.aixm.AIXMMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aixm")
public class AIXMController {

    private final AIXMService service;

    public AIXMController(AIXMService service) {
        this.service = service;
    }

    // 1. GET ALL FEATURES
    @GetMapping
    public List<AIXMFeature> getAllFeatures() {
        return service.getAll(); 
    }

    // 2. GET SINGLE FEATURE BY ID
    @GetMapping("/{id}")
    public ResponseEntity<AIXMFeature> getFeature(@PathVariable String id) {
        AIXMFeature feature = service.findById(id);
        return feature != null ? ResponseEntity.ok(feature) : ResponseEntity.notFound().build();
    }

    // 3. CREATE NEW FEATURE
    @PostMapping
    public AIXMFeature createFeature(@RequestBody AIXMFeature newFeature) {
        return service.save(newFeature);
    }

    // 4. UPDATE EXISTING FEATURE
    @PutMapping("/{id}")
    public ResponseEntity<AIXMFeature> updateFeature(@PathVariable String id, @RequestBody AIXMFeature updatedData) {
        AIXMFeature existing = service.findById(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }
        
        // Update fields
        existing.setType(updatedData.getType());
        existing.setHref(updatedData.getHref());
        
        service.save(existing);
        return ResponseEntity.ok(existing);
    }

    @PostMapping("/process")
    public String processAixm() {
        AIXMMessage message = new AIXMMessage();

        // --- Airports ---
        AIXMFeature airport1 = new AIXMFeature("APT-001", "Airport");
        AIXMFeature airport2 = new AIXMFeature("APT-002", "Airport");

        // --- Runways ---
        AIXMFeature runway1 = new AIXMFeature("RWY-001", "Runway");
        runway1.setHref("#APT-001");

        AIXMFeature runway2 = new AIXMFeature("RWY-002", "Runway");
        runway2.setHref("#APT-002");

        // --- Taxiway (Forward Reference) ---
        AIXMFeature taxiway = new AIXMFeature("TWY-001", "Taxiway");
        taxiway.setHref("#APT-003");

        AIXMFeature airport3 = new AIXMFeature("APT-003", "Airport");

        // --- Broken reference ---
        AIXMFeature broken = new AIXMFeature("RWY-999", "Runway");
        broken.setHref("#UNKNOWN");

        // --- Circular reference ---
        AIXMFeature circularA = new AIXMFeature("CIRC-A", "Airspace");
        AIXMFeature circularB = new AIXMFeature("CIRC-B", "Airspace");
        circularA.setHref("#CIRC-B");
        circularB.setHref("#CIRC-A");

        // --- Add features ---
        message.addFeature(runway1);
        message.addFeature(airport1);
        message.addFeature(runway2);
        message.addFeature(airport2);
        message.addFeature(taxiway);
        message.addFeature(airport3);
        message.addFeature(broken);
        message.addFeature(circularA);
        message.addFeature(circularB);

        // --- Process ---
        service.process(message);

        return "AIXM Message processed successfully. Check console for logs.";
    }
}