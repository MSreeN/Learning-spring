package com.games.learnspringframework.examples.f1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

// @Lazy
@Component
class SomeClass{
  private SomeDependency someDependency;
  public SomeClass(SomeDependency someDependency){
    System.out.println("From the SomeClass constructor");
    this.someDependency = someDependency;
  }

  @PostConstruct
  public void initialize(){
    someDependency.getSample();
  }
}

@Component
class SomeDependency{

  public void getSample() {
    System.out.println("------From getSample method called form SomeClass---------");
  }

}

@ComponentScan
public class PrePostAnnotationContextLauncherApplication {
  public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class);){
      System.out.println("----------------------");
      context.getBean(SomeClass.class);
    }
    
  }
}
