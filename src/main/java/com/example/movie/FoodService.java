package com.example.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {
    //Business Logic
    //Uses interface to talk to Database and gets a list of food
    @Autowired
    private FoodRepository foodRepository;
    public List<Food> allFood(){
        return foodRepository.findAll();
    }

    public Optional<Food> singleFood(String storeId){
        return foodRepository.findFoodBystoreId(storeId);
    }
}
