package com.games.learnspringframework.examples.f1;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Lazy
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

  //PreDestroy is used on a method and called before the instance or bean is in the process of being removed by the container.
  //This method can be typically use to release resources that it has bee holding
  @PreDestroy
  public void cleanUP(){
    System.out.println("------CleanUP method from the SomeDependency----");
  }
}

@Component
class SomeDependency{

  public void getSample() {
    System.out.println("------From getSample method called form SomeDependency---------");
  }
}

@ComponentScan
public class PrePostAnnotationContextLauncherApplication {
  public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class);){
      System.out.println("----------------------");
      System.out.println(context.getBean(SomeClass.class));
      System.out.println(context.getBean(SomeClass.class));
      System.out.println(context.getBean(SomeClass.class));
      System.out.println(context.getBean(SomeClass.class));

    }
  }
}
