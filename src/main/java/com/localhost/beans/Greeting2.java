package com.localhost.beans;

import javax.enterprise.context.RequestScoped;

@RequestScoped
@Greetings(value = "masha")
public class Greeting2 implements IGreeting {
  private String name = "Masha";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
