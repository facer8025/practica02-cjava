package com.cjava.cineplaneta.s8_cjava_cineplaneta_respaldo.service;

import com.cjava.cineplaneta.s8_cjava_cineplaneta_respaldo.entity.Socio;
import com.cjava.cineplaneta.s8_cjava_cineplaneta_respaldo.repository.ISocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocioService implements ISocioService {

  @Autowired
  private ISocioRepository socioRepository;

  @Override
  public List<Socio> findAll() {
    return this.socioRepository.findAll();
  }

  @Override
  public Socio save(Socio socio) {
    return this.socioRepository.save(socio);
  }
}
