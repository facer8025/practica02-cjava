package com.cjava.cineplaneta.s8_cjava_cineplaneta_respaldo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class S8CjavaCineplanetaRespaldoApplication {

  public static void main(String[] args) {
    SpringApplication.run(S8CjavaCineplanetaRespaldoApplication.class, args);
  }

}
