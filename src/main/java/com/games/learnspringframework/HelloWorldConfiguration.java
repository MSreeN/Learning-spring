package com.games.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address){}
record Address(String firstLine, String city){}

@Configuration
public class HelloWorldConfiguration {

  @Bean
  public String name(){
    return "sree";
  }

  @Bean
  public Address address(){
    return new Address("whitefield", "banglore");
  }

  @Bean
  public Person person(){
    return new Person("sree", 21, address());
  }

  @Bean("method")
  public Person person2MethodCall(){
    return person();
  }
}
