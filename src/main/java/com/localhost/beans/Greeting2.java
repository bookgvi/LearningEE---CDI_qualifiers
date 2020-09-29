package com.localhost.beans;

import javax.enterprise.context.RequestScoped;

@RequestScoped
@GreetingPRogr2(value = "Greeting2")
public class Greeting2 implements IGreeting {
  private String name = "Greeting2";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
