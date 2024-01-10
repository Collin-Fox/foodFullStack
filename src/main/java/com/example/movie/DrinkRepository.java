package com.example.movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends MongoRepository<Drink, ObjectId>{
}
