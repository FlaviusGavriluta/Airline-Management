package org.example.models;

import org.example.enums.Language;
import org.example.utils.ConsoleLogger;

import java.util.Date;
import java.util.List;

public class FlightAttendant extends Employee {
    private List<Language> languages;
    private ConsoleLogger logger = new ConsoleLogger();

    public FlightAttendant(String name, String mobile, Date birthDate, double salary, List<Language> languages) {
        super(name, mobile, birthDate, salary);
        this.languages = languages;
    }

    public boolean isReady(Language language) {
        return languages.contains(language);
    }

    @Override
    public boolean isReady() {
        logger.logError("This method should not be called directly. Use isReady(Language language) instead.");
        return false;
    }
}