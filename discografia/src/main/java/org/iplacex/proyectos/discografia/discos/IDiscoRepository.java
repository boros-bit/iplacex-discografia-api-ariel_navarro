package org.iplacex.proyectos.discografia.discos;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IDiscoRepository extends MongoRepository<Disco, String> {
    
}
