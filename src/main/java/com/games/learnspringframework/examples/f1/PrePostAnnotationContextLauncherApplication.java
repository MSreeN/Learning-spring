package com.games.learnspringframework.examples.f1;

import org.springframework.stereotype.Component;

@Component
class SomeClass{
  private SomeDependency someDependency;
  public SomeClass(SomeDependency someDependency){
    System.out.println("From the SomeClass constructor");
    this.someDependency = someDependency;
  }

  
}

@Component
class SomeDependency{

}


public class PrePostAnnotationContextLauncherApplication {
  public static void main(String[] args) {
    
  }
}
