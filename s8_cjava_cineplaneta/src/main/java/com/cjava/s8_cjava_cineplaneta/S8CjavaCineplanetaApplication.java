package com.cjava.s8_cjava_cineplaneta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class S8CjavaCineplanetaApplication {

  public static void main(String[] args) {
    SpringApplication.run(S8CjavaCineplanetaApplication.class, args);
  }

}
