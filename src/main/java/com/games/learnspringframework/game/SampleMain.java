package com.games.learnspringframework.game;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class SampleMain {
  public static void main(String[] args) {
    try(var annotation = new AnnotationConfigApplicationContext(SampleB.class)){
      System.out.println(annotation.getBean("method"));
    }

  }
}
