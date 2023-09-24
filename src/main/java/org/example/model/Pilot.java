package org.example.model;

import org.example.enums.PilotType;

import java.util.Date;

public class Pilot extends Employee {
    public boolean hasCompass;
    private PilotType pilotType;

    public Pilot(String name, String mobile, Date birthDate, double salary, PilotType pilotType) {
        super(name, mobile, birthDate, salary);
        this.pilotType = pilotType;
        this.hasCompass = false;
    }

    public void receiveCompass() {
        hasCompass = true;
    }

    @Override
    public boolean isReady() {
        return hasCompass;
    }

    public PilotType getPilotType() {
        return pilotType;
    }

    public void setPilotType(PilotType pilotType) {
        this.pilotType = pilotType;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "pilotType=" + pilotType +
                '}';
    }
}