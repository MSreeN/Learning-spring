package com.games.learnspringframework.Exercise;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{


} 

@Component
@Lazy
class ClassB{

  private ClassA classA;
  ClassB(ClassA classA){
    this.classA = classA;
    System.out.println("from classB constructor "+ classA);
  }

}

@ComponentScan
public class ExerciseMain {
  public static void main(String[] args) {
    try(var applicationContext = new AnnotationConfigApplicationContext(ExerciseMain.class)){
      // System.out.println("output " + applicationContext.getBean(BusinessCalculationsService.class).findMax());

      System.out.println("-------------------");
      // applicationContext.getBean(ClassB.class);
    }
  }
}
