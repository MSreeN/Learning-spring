package com.games.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleB {
  @Autowired
  public SampleA sampleB;

  public SampleB(SampleA sampleA){
    System.out.println(sampleA);
  }

  @Bean
  @Qualifier("method")
  public SampleA sampleBMethod(SampleA sampleB){
    return this.sampleB = sampleB;
  }


  public String toString(){
    return "this is sampleB instance " + sampleB;
  }
}
