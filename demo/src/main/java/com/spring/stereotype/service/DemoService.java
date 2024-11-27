package com.spring.stereotype.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
  public String hello() {
    return "hello service";
  }
}
