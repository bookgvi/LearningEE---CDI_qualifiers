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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

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
    System.out.printf("Refletion IGreeting: %s%n", (Object) Greeting.class.getDeclaredAnnotations());
    Field[] fields = Greeting.class.getDeclaredFields();
    Method[] methods = Greeting.class.getDeclaredMethods();
    for (Field field: fields) {
      System.out.printf("Field name: %ss%n", field.getName());
      System.out.printf("Field type: %ss%n", field.getType().getName());
    }
    for (Method method: methods) {
      System.out.printf("Method name: %ss%n", method.getName());
      System.out.printf("Method type: %ss%n", method.getReturnType().getName());
    }
    resp.getWriter().write(String.valueOf(greeting.getName()) + "\n");
    resp.getWriter().write(String.valueOf(greeting2.getName()) + "\n");
    resp.getWriter().write(String.valueOf(greeting3.getName()) + "\n");
    resp.getWriter().write(String.valueOf(greeting3_pr.getName()) + "\n");
  }
}
