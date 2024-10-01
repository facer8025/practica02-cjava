package com.cjava.cineplaneta.consumidor.controllers;

import com.cjava.cineplaneta.consumidor.models.Socio;
import com.cjava.cineplaneta.consumidor.services.ISocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/socios/")
public class SocioController {

  @Autowired
  private ISocioService service;

  @Autowired
  private CircuitBreakerFactory cbfactory;

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("")
  public List<Socio> getSocios() {
    return cbfactory.create("cbPrueba1")
        .run(() -> this.service.findAll(), e -> metodoAlternativo(e));
  }

  private List<Socio> metodoAlternativo(Throwable e) {
    String url = "http://man-socios-respaldo/socios/";
    return this.restTemplate.getForObject(url, List.class);
  }

}
