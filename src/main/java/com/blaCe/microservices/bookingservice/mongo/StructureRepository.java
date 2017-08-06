package com.blaCe.microservices.bookingservice.mongo;

import com.blaCe.microservices.bookingservice.products.Structure;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StructureRepository extends MongoRepository<Structure, String> {
}
