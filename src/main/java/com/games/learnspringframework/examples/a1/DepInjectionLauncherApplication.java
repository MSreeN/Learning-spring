package com.games.learnspringframework.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.games.learnspringframework.game.App03GamingSpringBeans;
import com.games.learnspringframework.game.GameRunner;

@Component
class YourBusinessClass{

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
