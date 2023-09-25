package org.example.models;

import org.example.utils.Compass;

import java.util.Date;

public class Pilot extends Employee {
    private Compass compass;

    public Pilot(String name, String mobile, Date birthDate, double salary) {
        super(name, mobile, birthDate, salary);
    }

    public void receiveCompass(Compass compass) {
        this.compass = compass;
    }

    @Override
    public boolean isReady() {
        return compass != null;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "compass=" + compass +
                '}';
    }
}