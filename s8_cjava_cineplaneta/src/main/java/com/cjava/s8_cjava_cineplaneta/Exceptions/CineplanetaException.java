package com.cjava.s8_cjava_cineplaneta.Exceptions;

import org.springframework.http.HttpStatus;

public class CineplanetaException extends RuntimeException {

  private final HttpStatus status;

  public CineplanetaException(String message, HttpStatus status) {
    super(message);
    this.status = status;
  }

  public HttpStatus getStatus() {
    return status;
  }

}
