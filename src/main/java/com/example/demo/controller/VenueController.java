package com.example.demo.controller;

import com.ajinz.common.customannotation.access.ManagerRequired;
import com.example.demo.entities.Venue;
import com.example.demo.service.VenueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/venue")
public class VenueController {
    private final VenueService venueService;

    public VenueController(VenueService venueService) {
        this.venueService = venueService;
    }

    @GetMapping("/fetch-all")
    public List<Venue> fetchAll() {
        return venueService.fetchAllVenues();
    }

    @ManagerRequired
    @PostMapping({"/add", "/add/"})
    public Venue add(@RequestBody Venue venue) {
        return venueService.addVenue(venue);
    }

    @ManagerRequired
    @PutMapping({"/update", "/update/"})
    public Venue update(@RequestBody Venue venue) {
        return venueService.updateVenue(venue);
    }

    @ManagerRequired
    @DeleteMapping({"/delete/{id}", "/delete/{id}"})
    public void delete(@PathVariable String id) {
        venueService.deleteVenue(id);
    }

    @ManagerRequired
    @DeleteMapping({"/delete-all", "/delete-all/"})
    public void deleteAll() {
        venueService.deleteAllVenues();
    }
}
