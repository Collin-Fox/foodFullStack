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
@RequestMapping("/api/v1/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public ResponseEntity<List<Reservation>> allReservations(){
        return new ResponseEntity<List<Reservation>>(reservationService.allReservations(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Reservation> createReservation(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Reservation>(reservationService.createReservation(payload.get("partyName"), payload.get("email"),
                payload.get("phone"), payload.get("size"), payload.get("date"),
                payload.get("time"), payload.get("requests")), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{partyName}")
    public Long deleteReservationByPartyName(@PathVariable String partyName){
        return reservationService.deleteReservation(partyName);
    }



}
