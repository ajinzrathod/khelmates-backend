package com.example.demo.controller;

import com.example.demo.entities.Venue;
import com.example.demo.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/venue")
public class VenueController {
  private final VenueService venueService;

  public VenueController(VenueService venueService) {
    this.venueService = venueService;
  }

  @GetMapping({"/", ""})
  public String health() {
    return "OK";
  }

  @GetMapping({"/fetch-all", "/fetch-all/"})
  public List<Venue> fetchAll() {
    return venueService.fetchAllVenues();
  }

  @PostMapping({"/add", "/add/"})
  public Venue add(@RequestBody Venue venue) {
    return venueService.addVenue(venue);
  }

  @PutMapping({"/update", "/update/"})
  public Venue update(@RequestBody Venue venue) {
    return venueService.updateVenue(venue);
  }

  @DeleteMapping({"/delete/{id}", "/delete/{id}"})
  public void delete(@PathVariable String id) {
    venueService.deleteVenue(id);
  }

  @DeleteMapping({"/delete-all", "/delete-all/"})
  public void deleteAll() {
    venueService.deleteAllVenues();
  }
}
