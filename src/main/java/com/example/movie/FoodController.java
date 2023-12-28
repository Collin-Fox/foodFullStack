package com.example.movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//Getting request from user and giving response
@RestController
@RequestMapping("/api/v1/food")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @GetMapping
    public ResponseEntity<List<Food>> allFood(){
        return new ResponseEntity<List<Food>>(foodService.allFood(), HttpStatus.OK);
    }
    @GetMapping("/{storeId}")
    public ResponseEntity<Optional<Food>> getSingleFood(@PathVariable String storeId){
        return new ResponseEntity<Optional<Food>>(foodService.singleFood(storeId), HttpStatus.OK);
    }
}
