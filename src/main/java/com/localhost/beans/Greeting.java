package com.localhost.beans;

import javax.enterprise.context.RequestScoped;

@RequestScoped
@Greetings(value = "Greeting")
public class Greeting implements IGreeting {
  private String name = "Greeting";

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}



