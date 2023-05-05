package com.games.learnspringframework.Exercise;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class ClassA{


} 

//if we don't mention lazy then it is called eagerly loading, which means the bean of classB will be loaded right after the application started and even before context was created.
//If it is lazy loading then bean of ClassB will only be created right before some one makes use of that bean.

@Component
@Lazy
@Scope(value = "prototype")
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
      //If it is lazy loading the bean of ClassB will be created after this line.
      //If it is not lazy loading then bean of ClassB will be created before this line is printed into console.
      System.out.println("-------------------");
      System.out.println(applicationContext.getBean(ClassB.class));
      System.out.println("-------------------");
      System.out.println(applicationContext.getBean(ClassB.class));
      System.out.println("-------------------");
      System.out.println(applicationContext.getBean(ClassB.class));
      System.out.println("-------------------");
      System.out.println(applicationContext.getBean(ClassB.class));
    }
  }
}
