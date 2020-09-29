package com.localhost.beans;

import javax.enterprise.context.RequestScoped;

@RequestScoped
@Greetings(value = "vova")
public class Greeting implements IGreeting {
  private String name = "Vova";

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}



