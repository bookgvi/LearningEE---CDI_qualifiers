package com.localhost.controllers;

import com.localhost.beans.*;

import javax.enterprise.inject.spi.CDI;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

  @Inject @Greetings(value = "Greeting")
  IGreeting greeting;

  // Programmatically inject bean with qualifier with attribute
  private IGreeting greeting2 = CDI.current().select(IGreeting.class, GreetingPRogr2.Literal.of("Greeting2")).get();

  @Inject @GreetingPRogr3
  IGreeting greeting3;
//   Tha same as previous but programmatically
  private IGreeting greeting3_pr = CDI.current().select(IGreeting.class, GreetingPRogr3.Literal.INSTANCE).get();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.getWriter().write(String.valueOf(greeting.getName()) + "\n");
    resp.getWriter().write(String.valueOf(greeting2.getName()) + "\n");
    resp.getWriter().write(String.valueOf(greeting3.getName()) + "\n");
    resp.getWriter().write(String.valueOf(greeting3_pr.getName()) + "\n");
  }
}
