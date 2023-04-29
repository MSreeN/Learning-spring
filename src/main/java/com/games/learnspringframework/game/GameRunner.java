package com.games.learnspringframework.game;

public class GameRunner {
  
  GamingConsole gamingConsole;

  public GameRunner(GamingConsole marioGame){
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
