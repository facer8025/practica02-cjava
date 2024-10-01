package com.cjava.s8_cjava_cineplaneta.services;

import com.cjava.s8_cjava_cineplaneta.models.Socio;

import java.util.List;
import java.util.Optional;

public interface ISocioService {
  List<Socio> findAll();
  Socio findById(String dni);
  Socio save(Socio socio);
  Socio update(String dni, Socio socio);
  void delete(String dni);

  Socio updateEstado(String dni, String estado);
}
