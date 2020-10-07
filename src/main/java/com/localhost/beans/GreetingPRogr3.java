package com.localhost.beans;

import javax.enterprise.inject.Vetoed;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Vetoed - uncomment for learning!!!
@Qualifier
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GreetingPRogr3 {
  public static class Literal extends AnnotationLiteral<GreetingPRogr3> implements GreetingPRogr3 {
    private static final long serialVersionUID = 1L;
    public static final GreetingPRogr3.Literal INSTANCE = new GreetingPRogr3.Literal();
  }
}
