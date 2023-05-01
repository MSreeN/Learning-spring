package com.games.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
  
  GamingConsole gamingConsole;

  public GameRunner(@Qualifier("MarioQualifier")GamingConsole marioGame){
    this.gamingConsole = marioGame;
  }

  public void run(){
    System.out.println("Running game");
    gamingConsole.down();
    gamingConsole.left();
    gamingConsole.right();
    gamingConsole.up();
  }
}
