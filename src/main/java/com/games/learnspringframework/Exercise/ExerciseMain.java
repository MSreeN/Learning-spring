package com.games.learnspringframework.Exercise;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ExerciseMain {
  public static void main(String[] args) {
    try(var applicationContext = new AnnotationConfigApplicationContext(ExerciseMain.class)){
      System.out.println(applicationContext.getBean(BusinessCalculationsService.class).findMax());
    }
  }
}
