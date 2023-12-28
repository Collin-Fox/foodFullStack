package com.example.movie;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Talks to the database
@Repository
public interface FoodRepository extends MongoRepository<Food, ObjectId> {
    Optional<Food> findFoodBystoreId(String storeId);
}


