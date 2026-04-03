package com.spring.boot;

import com.spring.boot.aixm.AIXMFeature;
import com.spring.boot.aixm.AIXMMessage;
import com.spring.boot.aixm.AIXMService;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    CommandLineRunner run(AIXMService service) {
        return args -> {

            AIXMMessage message = new AIXMMessage();

            // --- Airports ---
            AIXMFeature airport1 = new AIXMFeature("APT-001", "Airport");
            AIXMFeature airport2 = new AIXMFeature("APT-002", "Airport");

            // --- Runways (linked to airports) ---
            AIXMFeature runway1 = new AIXMFeature("RWY-001", "Runway");
            runway1.setHref("#APT-001"); // valid link

            AIXMFeature runway2 = new AIXMFeature("RWY-002", "Runway");
            runway2.setHref("#APT-002"); // valid link

            // --- Taxiway (forward reference case) ---
            AIXMFeature taxiway = new AIXMFeature("TWY-001", "Taxiway");
            taxiway.setHref("#APT-003"); // refers to airport not yet added

            // --- Airport added AFTER reference (forward reference test) ---
            AIXMFeature airport3 = new AIXMFeature("APT-003", "Airport");

            // --- Broken reference ---
            AIXMFeature broken = new AIXMFeature("RWY-999", "Runway");
            broken.setHref("#UNKNOWN"); // should trigger error handling

            // --- Circular reference ---
            AIXMFeature circularA = new AIXMFeature("CIRC-A", "Airspace");
            AIXMFeature circularB = new AIXMFeature("CIRC-B", "Airspace");

            circularA.setHref("#CIRC-B");
            circularB.setHref("#CIRC-A");

            // --- Add everything (intentionally unordered) ---
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
        };
    }
}