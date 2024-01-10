package com.example.movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "food")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    @Id
    private ObjectId id;
    private String storeId;
    private String name;
    private String price;
    private String img;
    private String cat;
    public Food(String storeId, String name, String price, String img, String cat) {
        this.storeId = storeId;
        this.name = name;
        this.price = price;
        this.img = img;
        this.cat = cat;
    }
}
