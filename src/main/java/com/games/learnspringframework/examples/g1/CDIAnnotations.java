package com.games.learnspringframework.examples.g1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;
//Instead of component we can use Named
@Named
class Sample{
  // @Autowired
  //Instead of autowired we can use inject annotation
  @Inject
  private Needed needed;
}

@Named
class Needed{

}


@ComponentScan
public class CDIAnnotations {
  public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(CDIAnnotations.class)){
      for(String bean: context.getBeanDefinitionNames()){
        System.out.println(bean);
      }
    }
  }
}
