package com.games.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.games.learnspringframework.game.GameRunner;
import com.games.learnspringframework.game.GamingConsole;
import com.games.learnspringframework.game.PackMan;

@Configuration
public class GamingConfiguration {
  
  @Bean
  public GamingConsole game(){
    var game = new PackMan();
    return game;
  }

  @Bean
  public GameRunner gameRunner(GamingConsole game){
    return new GameRunner(game);
  }

}
