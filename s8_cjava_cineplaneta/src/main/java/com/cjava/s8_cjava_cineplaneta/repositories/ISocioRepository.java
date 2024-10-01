package com.cjava.s8_cjava_cineplaneta.repositories;

import com.cjava.s8_cjava_cineplaneta.models.Socio;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ISocioRepository extends MongoRepository<Socio, String> {
}
