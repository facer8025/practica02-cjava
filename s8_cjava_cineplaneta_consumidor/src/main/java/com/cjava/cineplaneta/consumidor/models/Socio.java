package com.cjava.cineplaneta.consumidor.models;

public class Socio {
  private String dni;
  private String nombre;
  private String apellido_paterno;
  private String apellido_materno;
  private String correo;
  private String telefono;
  private Estado estado;
  private TipoMembresia tipoMembresia;

  public Socio() {}

  public Socio(
      String dni,
      String nombre,
      String apellido_paterno,
      String apellido_materno,
      String correo,
      String telefono,
      Estado estado,
      TipoMembresia tipoMembresia
  ) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellido_paterno = apellido_paterno;
    this.apellido_materno = apellido_materno;
    this.correo = correo;
    this.telefono = telefono;
    this.estado = estado;
    this.tipoMembresia = tipoMembresia;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido_paterno() {
    return apellido_paterno;
  }

  public void setApellido_paterno(String apellido_paterno) {
    this.apellido_paterno = apellido_paterno;
  }

  public String getApellido_materno() {
    return apellido_materno;
  }

  public void setApellido_materno(String apellido_materno) {
    this.apellido_materno = apellido_materno;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public Estado getEstado() {
    return estado;
  }

  public void setEstado(Estado estado) {
    this.estado = estado;
  }

  public TipoMembresia getTipoMembresia() {
    return tipoMembresia;
  }

  public void setTipoMembresia(TipoMembresia tipoMembresia) {
    this.tipoMembresia = tipoMembresia;
  }
}
