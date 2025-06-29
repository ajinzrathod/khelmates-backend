package com.ajinz.venue_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
@ComponentScan(basePackages = {"com.ajinz.venue_service", "com.ajinz.common.config"})
@EnableCaching
public class VenueServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VenueServiceApplication.class, args);
    }

//  --spring.profiles.active=prod
    // Cache Implementation
    // Replica for read
    // Elastic Search

    // Read Preference:
    //
    //	primary → read from Primary only
    //	secondary → read from Secondary only
    //	primaryPreferred → read from Primary if available, else Secondary
    //	secondaryPreferred → read from Secondary if possible (best for scaling reads)

}
