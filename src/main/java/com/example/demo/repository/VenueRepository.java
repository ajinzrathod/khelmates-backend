    package com.example.demo.repository;

    import com.example.demo.entities.Venue;
    import org.springframework.data.mongodb.repository.MongoRepository;
    import org.springframework.stereotype.Repository;

    @Repository
    public interface VenueRepository extends MongoRepository<Venue, String> {}
