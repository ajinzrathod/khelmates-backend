package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
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
