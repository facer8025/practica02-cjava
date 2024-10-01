package com.cjava.cineplaneta.consumidor.services;

import com.cjava.cineplaneta.consumidor.models.Socio;
import com.cjava.cineplaneta.consumidor.wsclient.ISocioFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocioService implements ISocioService {

  @Autowired
  private ISocioFeignClient socioFeign;

  @Override
  public List<Socio> findAll() {
    return this.socioFeign.findAll();
  }

}
