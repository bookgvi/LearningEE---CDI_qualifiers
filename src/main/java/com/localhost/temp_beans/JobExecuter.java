package com.localhost.temp_beans;

import javax.enterprise.inject.Typed;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface JobExecuter {
  String value() default "parallel";
  public final class Literal extends AnnotationLiteral<JobExecuter> implements JobExecuter {
    public static Literal INSTANCE = of("parallel");
    final String value;
    public static Literal of(String kindOfJob) {
      return new Literal(kindOfJob);
    }
    private Literal(String kindOfJob) {
      this.value = kindOfJob;
    }
    public String value() {
      return this.value;
    }
  }
}
