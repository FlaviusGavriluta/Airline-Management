package org.example.model;

import org.example.enums.Language;
import org.example.enums.PilotType;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Airline {
    private List<Flight> flights;

    public Airline() {
        this.flights = Arrays.asList(
                new Flight("RO12",
                        List.of(
                                new Pilot("John", "002345", new Date(1973, 03, 16), 3500, PilotType.CAPTAIN),
                                new Pilot("Tom", "002346", new Date(1983, 12, 16), 2500, PilotType.CO_PILOT)
                        ),
                        List.of(
                                new FlightAttendant("Alice", "021344", new Date(1987, 12, 4), 1700, List.of(Language.ENGLISH, Language.SPANISH)),
                                new FlightAttendant("Anne", "021345", new Date(1990, 2, 4), 1500, List.of(Language.ENGLISH, Language.RUSSIAN)),
                                new FlightAttendant("Denice", "021346", new Date(1977, 8, 4), 1900, List.of(Language.GERMAN, Language.ENGLISH))
                        ),
                        219,
                        Language.ENGLISH
                )
        );
        givesCompassToPilot(flights.get(0).getPilots().get(0));
        givesCompassToPilot(flights.get(0).getPilots().get(1));
    }

    public List<String> takeOff() {
        return flights.stream()
                .map(flight -> flight.isReadyToTakeOff() ? "The Airplane " + flight.getId() + " departured." : "The Airline " + flight.getId() + "is not ready.")
                .collect(Collectors.toList());
    }

    public void givesCompassToPilot(Pilot pilot) {
        pilot.receiveCompass();
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "flights=" + flights +
                '}';
    }
}
