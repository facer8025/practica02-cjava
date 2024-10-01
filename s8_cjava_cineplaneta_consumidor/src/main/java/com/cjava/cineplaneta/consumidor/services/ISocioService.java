package com.cjava.cineplaneta.consumidor.services;

import com.cjava.cineplaneta.consumidor.models.Socio;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ISocioService {

  List<Socio> findAll();

}
