package org.example.model;

import org.example.enums.Language;
import org.example.enums.PilotType;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.*;

public class Flight {
    private String id;
    private List<Pilot> pilots;
    private List<FlightAttendant> flightAttendants;
    private List<Passenger> passengers;
    private int numberOfPassengers;
    private Language language;

    public Flight(String id, List<Pilot> pilots, List<FlightAttendant> flightAttendants, int numberOfPassengers, Language language) {
        this.id = id;
        this.pilots = pilots;
        this.flightAttendants = flightAttendants;
        this.passengers = new ArrayList<>();
        this.numberOfPassengers = numberOfPassengers;
        this.language = language;
    }

    public boolean isReadyToTakeOff() {
        boolean pilotsAreReady = pilots.stream()
                .anyMatch(pilot -> pilot.hasCompass);
        boolean flightAttendantsAreReady = flightAttendants.stream()
                .anyMatch(flightAttendant -> flightAttendant.getLanguages().contains(language));
        boolean numberOfPassengersAreReady = numberOfPassengers < 220;
        return pilotsAreReady && flightAttendantsAreReady && numberOfPassengersAreReady;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }

    public List<FlightAttendant> getFlightAttendants() {
        return flightAttendants;
    }

    public void setFlightAttendants(List<FlightAttendant> flightAttendants) {
        this.flightAttendants = flightAttendants;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", pilots=" + pilots +
                ", flightAttendants=" + flightAttendants +
                ", numberOfPassengers=" + numberOfPassengers +
                ", language=" + language +
                '}';
    }
}