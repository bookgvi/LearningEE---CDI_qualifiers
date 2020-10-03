package com.localhost.controllers;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class Listener implements ServletContextListener {
  public void sessionCreated(HttpSessionEvent se) {
  }

  public void contextInitialized(ServletContextEvent sce) {
    ServletContext sc = sce.getServletContext();
    ServletRegistration sr = sc.addServlet("Hello2 Servlet", HelloServlet.class);
    sr.addMapping("/hello2");
  }
}
