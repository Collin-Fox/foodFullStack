package com.example.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {
    //Business Logic
    //Uses interface to talk to Database and gets a list of food
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    public List<Food> allFood(){
        return foodRepository.findAll();
    }

    public Optional<Food> singleFood(String storeId){
        return foodRepository.findFoodBystoreId(storeId);
    }

    public Food createFood(String storeId, String name, String price, String img){

        Food food = foodRepository.insert(new Food(storeId, name, price, img));

        return food;
    }



}
