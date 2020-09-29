package com.localhost.beans;

import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GreetingPRogr3 {
  public static class Literal extends AnnotationLiteral<GreetingPRogr3> implements GreetingPRogr3 {
    private static final long serialVersionUID = 1l;
    public static final Literal INSTANCE = new Literal();
  }
}
