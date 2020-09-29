package com.localhost.beans;

import javax.enterprise.context.RequestScoped;

@RequestScoped
@GreetingPRogr3
public class Greeting3 implements IGreeting {
  private String name = "Greeting3";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
