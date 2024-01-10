package com.example.movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "drinks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drink {
    @Id
    private ObjectId id;
    private String drinkName;
    private String drinkType;
    private String price;
    private String abv;
    private String imageLink;

    public Drink(String drinkName, String drinkType, String price, String abv, String imageLink) {
        this.drinkName = drinkName;
        this.drinkType = drinkType;
        this.price = price;
        this.abv = abv;
        this.imageLink = imageLink;
    }
}
