package com.example.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrinkService {
    @Autowired
    private DrinkRepository drinkRepository;

    public List<Drink> allDrinks(){
        return drinkRepository.findAll();
    }

    public Drink createDrink (String drinkName, String drinkType, String price, String abv, String imageLink){
        Drink drink = drinkRepository.insert(new Drink(drinkName,drinkType,price,abv, imageLink));

        return drink;
    }
}
