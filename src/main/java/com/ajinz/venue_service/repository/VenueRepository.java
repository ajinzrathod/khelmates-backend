package com.ajinz.venue_service.repository;

import com.ajinz.venue_service.entities.Venue;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends MongoRepository<Venue, String> {
}
