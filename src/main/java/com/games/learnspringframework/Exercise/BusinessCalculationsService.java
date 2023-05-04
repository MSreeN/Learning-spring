package com.games.learnspringframework.Exercise;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationsService {
  private DataService dataService;

  public int findMax(){
    return Arrays.stream(dataService.retrieveData()).max().orElse(0);
  }
}
