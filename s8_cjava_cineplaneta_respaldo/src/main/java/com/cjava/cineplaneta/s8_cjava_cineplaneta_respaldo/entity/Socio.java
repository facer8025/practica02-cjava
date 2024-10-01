package com.cjava.cineplaneta.s8_cjava_cineplaneta_respaldo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "socios")
public class Socio {

  @Id
  private String dni;

  private String nombre;
  private String apellido_paterno;
  private String apellido_materno;
  private String correo;
  private String telefono;
  private Estado estado;
  private TipoMembresia tipoMembresia;
}
