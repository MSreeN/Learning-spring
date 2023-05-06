package com.games.learnspringframework.examples.f1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
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
  ///PostConstruct will call the method right after bean is initialized, means as soon as the dependencies are autowired spring would call the method which is annotated with the @PostConstruct.
  //This method will be invoked before any other bean make use of this bean
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
