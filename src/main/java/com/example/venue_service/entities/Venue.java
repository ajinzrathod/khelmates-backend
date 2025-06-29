package com.example.venue_service.entities;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document(collection = "venues")
public class Venue {

  @Id private String id;

  private String location;
  private String sport;
  private Float rating;
  private Integer playerCount;
  private Integer price;
  private String description;
  private String image;
  private LocalDateTime dateTime;

  @CreatedDate private LocalDateTime createdAt;

  @LastModifiedDate private LocalDateTime updatedAt;

  public Venue() {}

  public Venue(
      String id,
      String location,
      String sport,
      Float rating,
      Integer playerCount,
      Integer price,
      String description,
      String image,
      LocalDateTime dateTime,
      LocalDateTime createdAt,
      LocalDateTime updatedAt) {
    this.id = id;
    this.location = location;
    this.sport = sport;
    this.rating = rating;
    this.playerCount = playerCount;
    this.price = price;
    this.description = description;
    this.image = image;
    this.dateTime = dateTime;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public String getId() {
    return id;
  }

  public String getLocation() {
    return location;
  }

  public String getSport() {
    return sport;
  }

  public Float getRating() {
    return rating;
  }

  public Integer getPlayerCount() {
    return playerCount;
  }

  public Integer getPrice() {
    return price;
  }

  public String getDescription() {
    return description;
  }

  public String getImage() {
    return image;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public void setSport(String sport) {
    this.sport = sport;
  }

  public void setRating(Float rating) {
    this.rating = rating;
  }

  public void setPlayerCount(Integer playerCount) {
    this.playerCount = playerCount;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    var that = (Venue) obj;
    return Objects.equals(this.id, that.id)
        && Objects.equals(this.location, that.location)
        && Objects.equals(this.sport, that.sport)
        && Objects.equals(this.rating, that.rating)
        && Objects.equals(this.playerCount, that.playerCount)
        && Objects.equals(this.price, that.price)
        && Objects.equals(this.description, that.description)
        && Objects.equals(this.image, that.image)
        && Objects.equals(this.dateTime, that.dateTime)
        && Objects.equals(this.createdAt, that.createdAt)
        && Objects.equals(this.updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        location,
        sport,
        rating,
        playerCount,
        price,
        description,
        image,
        dateTime,
        createdAt,
        updatedAt);
  }

  @Override
  public String toString() {
    return "Venue["
        + "id="
        + id
        + ", "
        + "location="
        + location
        + ", "
        + "sport="
        + sport
        + ", "
        + "rating="
        + rating
        + ", "
        + "playerCount="
        + playerCount
        + ", "
        + "price="
        + price
        + ", "
        + "description="
        + description
        + ", "
        + "image="
        + image
        + ", "
        + "dateTime="
        + dateTime
        + ", "
        + "createdAt="
        + createdAt
        + ", "
        + "updatedAt="
        + updatedAt
        + ']';
  }
}
