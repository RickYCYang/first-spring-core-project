package com.spring.traveler.java_base_config;

public class Traveler {
  private Vehicle vehicle;

  public Traveler(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public void startJourney() {
    this.vehicle.move();
  }
}
