package com.cjava.cineplaneta.s8_cjava_cineplaneta_respaldo.controller;

import com.cjava.cineplaneta.s8_cjava_cineplaneta_respaldo.entity.Socio;
import com.cjava.cineplaneta.s8_cjava_cineplaneta_respaldo.service.ISocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/socios/")
public class SocioController {

  @Autowired
  private ISocioService iSocioService;

  @GetMapping("")
  public ResponseEntity<List<Socio>> listadoSocios() {
    return ResponseEntity.ok(this.iSocioService.findAll());
  }

  @PostMapping("")
  public ResponseEntity<Socio> save(@RequestBody Socio socio) {
    return ResponseEntity.ok(this.iSocioService.save(socio));
  }

}
