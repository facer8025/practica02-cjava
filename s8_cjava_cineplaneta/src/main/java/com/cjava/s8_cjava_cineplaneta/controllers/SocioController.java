package com.cjava.s8_cjava_cineplaneta.controllers;

import com.cjava.s8_cjava_cineplaneta.Exceptions.CineplanetaException;
import com.cjava.s8_cjava_cineplaneta.models.Socio;
import com.cjava.s8_cjava_cineplaneta.services.ISocioService;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/socios/")
public class SocioController {

  @Autowired
  private ISocioService service;

  @GetMapping("")
  public ResponseEntity<List<Socio>> listadoSocios() {
    return ResponseEntity.ok(this.service.findAll());
  }

  @GetMapping("{dni}")
  public ResponseEntity<Socio> findById(@PathVariable String  dni) {
    return ResponseEntity.ok(this.service.findById(dni));
  }

  @PostMapping("")
  public ResponseEntity<Socio> save(@RequestBody Socio socio) {
    return ResponseEntity.ok(this.service.save(socio));
  }

  @PutMapping("{dni}")
  public ResponseEntity<Socio> update(@PathVariable String dni, @RequestBody Socio socio) {
    return ResponseEntity.ok(this.service.update(dni, socio));
  }

  @DeleteMapping("{dni}")
  public void delete(@PathVariable String dni) {
    this.service.delete(dni);
  }

  @PatchMapping("/{dni}/{estado}")
  public ResponseEntity<Socio> updateEstado(@PathVariable String dni, @PathVariable String estado) {
    return ResponseEntity.ok(this.service.updateEstado(dni, estado));
  }
}
