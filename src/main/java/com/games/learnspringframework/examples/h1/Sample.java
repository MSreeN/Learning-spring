package com.games.learnspringframework.examples.h1;

import org.springframework.stereotype.Component;

@Component("name")
public class Sample {
  int a;
  int b;
  Sample(int a, int b){
    this.a = a;
    this.b = b;
  }
  

  public String toString(){
    return a + " " +b;
  }
}
