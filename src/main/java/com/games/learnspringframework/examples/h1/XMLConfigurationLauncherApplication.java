package com.games.learnspringframework.examples.h1;


import org.springframework.context.support.ClassPathXmlApplicationContext;



public class XMLConfigurationLauncherApplication {
  public static void main(String[] args) {
    try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
      for(String bean: context.getBeanDefinitionNames()){
        System.out.println(bean);
      }
      System.out.println(context.getBean("name"));
    }
  }
}
