package com.example.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    @Autowired
    private ResRepository resRepository;

    public List<Reservation> allReservations(){return resRepository.findAll();}



    public Long deleteReservation(String partyName){
        return resRepository.deleteReservationBypartyName(partyName);
    }


    public Reservation createReservation(String partyName, String email, String phone, String size, String date, String time, String requests){
        Reservation reservation = resRepository.insert(new Reservation(partyName, email, phone, size, date, time,requests));

        return reservation;
    }
}
