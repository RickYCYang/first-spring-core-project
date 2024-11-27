package com.spring.traveler.java_base_config;

public class Car implements Vehicle {
  @Override
  public void move() {
    System.out.println("Car is moving");
  }
}
