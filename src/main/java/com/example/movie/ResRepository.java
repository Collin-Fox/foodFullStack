package com.example.movie;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResRepository extends MongoRepository<Reservation, ObjectId>{

    Long deleteReservationBypartyName(String partyName);
}
