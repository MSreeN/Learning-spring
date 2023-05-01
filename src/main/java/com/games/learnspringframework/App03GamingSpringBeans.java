package com.games.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.games.learnspringframework.game.GameRunner;

@Configuration
@ComponentScan
public class App03GamingSpringBeans {
  public static void main(String[] args) {

    
  try(var annotation = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)){
    // GameRunner gameRunner = new GameRunner(annotation.getBean(GamingConsole.class));
    // gameRunner.run();

    annotation.getBean(GameRunner.class).run();
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
