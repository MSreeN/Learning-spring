package com.games.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.games.learnspringframework.game.GameRunner;


public class App03GamingSpringBeans {
  public static void main(String[] args) {
    
  try(var annotation = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
    // GameRunner gameRunner = new GameRunner(annotation.getBean(GamingConsole.class));
    // gameRunner.run();

    annotation.getBean(GameRunner.class).run();
  }
  }
}
