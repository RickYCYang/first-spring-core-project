package com.spring.traveler.java_base_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
  public static void main(String[] args) {
    // Vehicle vehicle = new Bike();

    // Traveler traveler = new Traveler(vehicle);
    // traveler.startJourney();

    // Creating Sping IOC Container
    // Read the configuration class
    // Create and manage the Spring beans
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    // Retrieve Spring Beans from Spring IOC Container
    Car car = applicationContext.getBean(Car.class);
    car.move();

    Bike bike = applicationContext.getBean(Bike.class);
    bike.move();

    Traveler traveler1 = applicationContext.getBean(Traveler.class);
    traveler1.startJourney();
  }
}
