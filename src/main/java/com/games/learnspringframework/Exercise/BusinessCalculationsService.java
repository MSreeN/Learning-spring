package com.games.learnspringframework.Exercise;

import java.util.Arrays;


import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationsService {
  private DataService dataService;

  BusinessCalculationsService(DataService dataService){
    this.dataService  = dataService;
  }

  public int findMax(){
    return Arrays.stream(dataService.retrieveData()).max().orElse(0);
  }
}
