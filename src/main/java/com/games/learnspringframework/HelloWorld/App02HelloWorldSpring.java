package com.games.learnspringframework.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.games.learnspringframework.HelloWorldConfiguration;

public class App02HelloWorldSpring {
  public static void main(String[] args) {

    //1. Launch a spring context
    try(var annotation = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
      for(String s : annotation.getBeanDefinitionNames()){
        System.out.println(s);
      }
    }

    //2. configure the things that we want spring to manage -
    //HelloWorldConfiguration - @Configuration
    //name - @Bean

    //3. Retrieving Beans managed by Spring
    // System.out.println(annotation.getBean("method"));

  }
}
