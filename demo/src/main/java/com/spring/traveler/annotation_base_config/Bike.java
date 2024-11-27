package com.spring.traveler.annotation_base_config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// If use @Component without arg, 
// the name of the bean will be the same as the class, but the 1st letter is lowercase. e.g. class Car -> car
// IF use @Component with arg, the arg will be the bean's name
@Component("bike")
@Primary
public class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}
