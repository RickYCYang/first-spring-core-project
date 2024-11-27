package com.spring.traveler.annotation_base_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveler {
  private Vehicle vehicle;

  // If there are multiple beans inherit or implement the same
  // class or interface, the spring container doesn't know which beans it should
  // use firstly, hence, the @Qualifier should be added before the DI to
  // specify the required bean explicitly
  // @Autowired
  // public Traveler(@Qualifier("car") Vehicle vehicle) {
  // this.vehicle = vehicle;
  // }

  // a bean with @Primary has the highest priority,
  // hence, even there are multiple beans inherit or implement the same
  // class or interface, the spring container knows which beans it should
  // use firstly.
  @Autowired
  public Traveler(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public void startJourney() {
    this.vehicle.move();
  }
}
