package com.games.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.games.learnspringframework.game.App03GamingSpringBeans;
import com.games.learnspringframework.game.GameRunner;

@Component
class YourBusinessClass{
  Dependency1 dependency1;

  //field dependency injection
  Dependency2 dependency2;

  public YourBusinessClass(Dependency2 dependency2){
    System.out.println("this is form constructor");
    this.dependency2 = dependency2;
  }

  // @Bean
  // public void sample(){
  //   System.out.println("this is bean from the your business class ");
  // }


  //Getter and Setter dependency injection
  @Autowired
  public Dependency1 dependency1Setter(Dependency1 dependency1) {
    System.out.println("this is dependency 1 setter method");
    return this.dependency1 = dependency1;
  }

  public String toString(){
    return "Using " + dependency1 + " and " + dependency2;
  }
}

@Component
class Dependency1{
  
}

@Component
class Dependency2{

}


@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
  public static void main(String[] args) {

    
  try(var annotation = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){
    // GameRunner gameRunner = new GameRunner(annotation.getBean(GamingConsole.class));
    // gameRunner.run();
    for(String beanName: annotation.getBeanDefinitionNames()){
      System.out.println(beanName);
    }

    System.out.println(annotation.getBean(YourBusinessClass.class));
    
  }
  }

  // @Bean
  // public GamingConsole gamingConsole(){
  //   return new PackMan();
  // }

  // @Bean
  // public GameRunner gameRunner(GamingConsole gamingConsole){
  //   return new GameRunner(gamingConsole);
  // }
}
