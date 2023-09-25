package org.example.models;

import org.example.enums.Language;
import org.example.utils.ConsoleLogger;

import java.util.List;

public class Flight {
    private final String uniqueID;
    private int numberOfPassengers;
    private Language language;
    private Captain captain;
    private CoPilot coPilot;
    private List<FlightAttendant> attendants;
    private List<Passenger> passengers;
    private ConsoleLogger logger = new ConsoleLogger();

    public Flight(String uniqueID, Language language, Captain captain, CoPilot coPilot, List<FlightAttendant> attendants, List<Passenger> passengers) {
        this.uniqueID = uniqueID;
        this.language = language;
        this.captain = captain;
        this.coPilot = coPilot;
        this.attendants = attendants;
        this.passengers = passengers;
        this.numberOfPassengers = passengers.size();
    }

    public boolean isReadyToTakeOff() {
        boolean isReady = true;

        if (!captain.isReady()) {
            logger.logError("The captain is not ready. Missing compass");
            isReady = false;
        }
        if (!coPilot.isReady()) {
            logger.logError("The copilot is not ready. Missing compass");
            isReady = false;
        }
        if (numberOfPassengers >= 220) {
            logger.logError("There are too many passengers. Flight is overbooked.");
            isReady = false;
        }
        boolean hasANotReadyAttendant = attendants.stream()
                .anyMatch(attendant -> !attendant.isReady(language));

        if (hasANotReadyAttendant) {
            logger.logError("Some flight attendants does not speak the language of the flight");
            isReady = true;
        }

        if (isReady)
            logger.logInfo("The flight is ready to take off.");
        else logger.logInfo("The flight is not ready to take off.");

        return isReady;
    }

    public String getUniqueID() {
        return uniqueID;
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

    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public CoPilot getCoPilot() {
        return coPilot;
    }

    public void setCoPilot(CoPilot coPilot) {
        this.coPilot = coPilot;
    }

    public List<FlightAttendant> getAttendants() {
        return attendants;
    }

    public void setAttendants(List<FlightAttendant> attendants) {
        this.attendants = attendants;
    }

    public ConsoleLogger getLogger() {
        return logger;
    }

    public void setLogger(ConsoleLogger logger) {
        this.logger = logger;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "uniqueID='" + uniqueID + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", language=" + language +
                ", captain=" + captain +
                ", coPilot=" + coPilot +
                ", attendants=" + attendants +
                ", passengers=" + passengers +
                '}';
    }
}