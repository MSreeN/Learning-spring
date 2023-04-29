package com.games.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
  public static void main(String[] args) {

    //1. Launch a spring context
    var annotation = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

    //2. configure the things that we want spring to manage -
    //HelloWorldConfiguration - @Configuration
    //name - @Bean

    //3. Retrieving Beans managed by Spring
    System.out.println(annotation.getBean("name"));
  }
}
