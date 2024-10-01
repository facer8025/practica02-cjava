package com.cjava.cineplaneta.consumidor.wsclient;

import com.cjava.cineplaneta.consumidor.models.Socio;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "man-socios")
public interface ISocioFeignClient {

  @GetMapping("/socios")
  public List<Socio> findAll();

}
