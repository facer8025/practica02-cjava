package com.cjava.cineplaneta.s8_cjava_cineplaneta_respaldo.service;

import com.cjava.cineplaneta.s8_cjava_cineplaneta_respaldo.entity.Socio;

import java.util.List;

public interface ISocioService {
  List<Socio> findAll();
  Socio save(Socio socio);
}
