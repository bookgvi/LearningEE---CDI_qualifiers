package com.localhost.beans;

import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface GreetingPRogr2 {
  String value() default "QQQ";
  static final class Literal extends AnnotationLiteral<GreetingPRogr2> implements GreetingPRogr2 {
    private final String value;
    public static GreetingPRogr2.Literal INSTANCE = GreetingPRogr2.Literal.of("QQQ");

    public static Literal of(String value) {
      return new Literal(value);
    }

    private Literal(String value) {
      this.value = value;
    }

    public String value() {
      return value;
    }
  }
}
