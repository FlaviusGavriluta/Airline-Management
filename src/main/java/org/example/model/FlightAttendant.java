package org.example.model;

import org.example.enums.Language;

import java.util.Date;
import java.util.List;

public class FlightAttendant extends Employee {
    private List<Language> languages;

    public FlightAttendant(String name, String mobile, Date birthDate, double salary, List<Language> languages) {
        super(name, mobile, birthDate, salary);
        this.languages = languages;
    }

    @Override
    public boolean isReady() {
        return false;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "FlightAttendant{" +
                "languages=" + languages +
                '}';
    }
}