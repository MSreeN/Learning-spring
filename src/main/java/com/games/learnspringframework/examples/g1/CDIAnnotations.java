package com.games.learnspringframework.examples.g1;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.inject.Named;

@Named
class Sample{
  @Autowired
  private Needed needed;
}


class Needed{

}


public class CDIAnnotations {
  public static void main(String[] args) {
    
  }
}
