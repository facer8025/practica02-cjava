package com.cjava.s8_cjava_cineplaneta.services;

import com.cjava.s8_cjava_cineplaneta.Exceptions.CineplanetaException;
import com.cjava.s8_cjava_cineplaneta.models.Estado;
import com.cjava.s8_cjava_cineplaneta.models.Socio;
import com.cjava.s8_cjava_cineplaneta.repositories.ISocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocioService implements ISocioService {

  @Autowired
  private ISocioRepository repository;

  @Override
  public List<Socio> findAll() {
    return this.repository.findAll();
  }

  @Override
  public Socio findById(String dni) {
    return this.repository.findById(dni)
        .orElseThrow(() -> new CineplanetaException("Socio no encontrado", HttpStatus.NOT_FOUND));
  }

  @Override
  public Socio save(Socio socio) {
    return this.repository.save(socio);
  }

  @Override
  public Socio update(String dni, Socio socio) {
    Socio socioDb = this.repository.findById(dni)
        .orElseThrow(() -> new CineplanetaException("Socio no encontrado", HttpStatus.NOT_FOUND));
    socioDb.setNombre(socio.getNombre());
    socioDb.setApellido_paterno(socio.getApellido_paterno());
    socioDb.setApellido_materno(socio.getApellido_materno());
    socioDb.setCorreo(socio.getCorreo());
    socioDb.setTelefono(socio.getTelefono());
    socioDb.setEstado(socio.getEstado());
    socioDb.setTipoMembresia(socio.getTipoMembresia());

    return this.repository.save(socioDb);
  }

  @Override
  public void delete(String dni) {
    this.repository.deleteById(dni);
  }

  @Override
  public Socio updateEstado(String dni, String estado) {
    Socio socioDb = this.repository.findById(dni)
        .orElseThrow(() -> new CineplanetaException("Socio no encontrado", HttpStatus.NOT_FOUND));

    socioDb.setEstado(Estado.valueOf(estado));
    return this.repository.save(socioDb);
  }
}
