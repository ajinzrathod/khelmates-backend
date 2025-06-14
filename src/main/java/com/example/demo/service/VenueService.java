package com.example.demo.service;

import com.example.demo.entities.Venue;
import com.example.demo.repository.VenueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueService {
  private final VenueRepository venueRepository;

  public VenueService(VenueRepository venueRepository) {
    this.venueRepository = venueRepository;
  }

  public Venue addVenue(Venue venue) {
    return venueRepository.insert(venue);
  }

  public Venue updateVenue(Venue venue) {
    Venue existing =
        venueRepository
            .findById(venue.getId())
            .orElseThrow(() -> new RuntimeException("Venue not found with id: " + venue.getId()));

    // Now update the fields you want to change:
    existing.setLocation(venue.getLocation());
    existing.setSport(venue.getSport());
    existing.setRating(venue.getRating());
    existing.setPlayerCount(venue.getPlayerCount());
    existing.setPrice(venue.getPrice());
    existing.setDescription(venue.getDescription());
    existing.setImage(venue.getImage());
    existing.setDateTime(venue.getDateTime());

    return venueRepository.save(existing);
  }

  public void deleteVenue(String id) {
    venueRepository.deleteById(id);
  }

  public void deleteAllVenues() {
    venueRepository.deleteAll();
  }

  public List<Venue> fetchAllVenues() {
    return venueRepository.findAll();
  }
}
