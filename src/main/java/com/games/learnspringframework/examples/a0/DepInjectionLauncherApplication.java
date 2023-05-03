package com.games.learnspringframework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
  public static void main(String[] args) {

    
  try(var annotation = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){
    // GameRunner gameRunner = new GameRunner(annotation.getBean(GamingConsole.class));
    // gameRunner.run();
    System.out.println(annotation.getBeanDefinitionNames());
    
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
