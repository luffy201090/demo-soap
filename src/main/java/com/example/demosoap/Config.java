package com.example.demosoap;

import com.stamps.xml.namespace._2021._16.swsim.swsimv130.SwsimV130;
import com.stamps.xml.namespace._2021._16.swsim.swsimv130.SwsimV130Soap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  @Bean
  public SwsimV130Soap swsimV130Soap() {
    SwsimV130 swsimV130 = new SwsimV130();

    return swsimV130.getSwsimV130Soap();
  }
}
