package com.example.movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
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

    @GetMapping("/{cat}")
    public ResponseEntity<Optional<List<Food>>> getFoodByCat(@PathVariable String cat){
        return new ResponseEntity<Optional<List<Food>>>(foodService.foodByCategory(cat), HttpStatus.OK);
    }
   // @GetMapping("/{storeId}")
    //public ResponseEntity<Optional<Food>> getSingleFood(@PathVariable String storeId){
      //  return new ResponseEntity<Optional<Food>>(foodService.singleFood(storeId), HttpStatus.OK);
    //}



    @PostMapping
    public ResponseEntity<Food> createFood(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Food>(foodService.createFood(payload.get("storeId"), payload.get("name"), payload.get("price"), payload.get("img"), payload.get("cat")), HttpStatus.CREATED);
    }
}
