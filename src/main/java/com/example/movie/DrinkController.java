package com.example.movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/drinks")
public class DrinkController {
    @Autowired
    private DrinkService drinkService;

    @GetMapping
    public ResponseEntity<List<Drink>> allDrinks(){
        return new ResponseEntity<List<Drink>>(drinkService.allDrinks(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Drink> createDrink(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Drink>(drinkService.createDrink(payload.get("drinkName"), payload.get("drinkType"), payload.get("price"), payload.get("abv"), payload.get("imageLink")), HttpStatus.CREATED);
    }
}
