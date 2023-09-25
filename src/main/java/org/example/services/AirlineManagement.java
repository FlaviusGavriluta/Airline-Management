package org.example.services;

import org.example.enums.Language;
import org.example.models.*;
import org.example.utils.Compass;

import java.util.Date;
import java.util.List;

public class AirlineManagement {

    public Flight prepareFlight() {
        Captain captain = new Captain("Tom", "0123123098", new Date(1973, 5, 16), 3500);
        CoPilot coPilot = new CoPilot("John", "0123123099", new Date(1983, 12, 10), 2500);

        captain.receiveCompass(new Compass("Samsung1"));
        coPilot.receiveCompass(new Compass("Samsung2"));

        FlightAttendant fa1 = new FlightAttendant("Alice", "12343123412", new Date(1986, 4, 7), 2000, List.of(Language.ENGLISH, Language.RUSSIAN));
        FlightAttendant fa2 = new FlightAttendant("Dennice", "12343123413", new Date(1990, 2, 17), 1500, List.of(Language.SPANISH, Language.RUSSIAN));
        FlightAttendant fa3 = new FlightAttendant("Anne", "12343123414", new Date(1976, 8, 27), 1800, List.of(Language.GERMAN, Language.RUSSIAN));

        List<Passenger> passengers = PassengerFactory.createRandomPassengers();

        return new Flight("RO123",
                Language.RUSSIAN,
                captain, coPilot,
                List.of(fa1, fa2, fa3),
                passengers
        );
    }

    public boolean isReadyToTakeOff() {
        return prepareFlight().isReadyToTakeOff();
    }
}