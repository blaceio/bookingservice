package io.blace.microservices.bookingservice.http;

import io.blace.microservices.bookingservice.mongo.StructureRepository;
import io.blace.microservices.bookingservice.products.Structure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookingController {

    @Autowired
    private StructureRepository structureRepository;

    @PostMapping("/bookvanilla")
    public ResponseEntity<?> bookTrade(@RequestBody Structure structure) {
        structureRepository.save(structure);
        return new ResponseEntity("Vanilla Booked.", new HttpHeaders(), HttpStatus.OK);
    }
}
