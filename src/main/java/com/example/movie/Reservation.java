package com.example.movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reservations")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Reservation {
    @Id
    private ObjectId id;
    private String partyName;
    private String email;
    private String phone;
    private String size;
    private String date;
    private String time;
    private String requests;

    public Reservation(String partyName, String email, String phone, String size, String date, String time, String requests) {
        this.partyName = partyName;
        this.email = email;
        this.phone = phone;
        this.size = size;
        this.date = date;
        this.time = time;
        this.requests = requests;
    }
}
