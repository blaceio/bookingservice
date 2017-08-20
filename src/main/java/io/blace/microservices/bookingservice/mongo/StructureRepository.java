package io.blace.microservices.bookingservice.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.blace.microservices.bookingservice.products.Structure;

public interface StructureRepository extends MongoRepository<Structure, String> {
}
