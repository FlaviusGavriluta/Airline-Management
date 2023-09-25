package org.example.utils;

public class ConsoleLogger implements Logger {
    @Override
    public void logInfo(String message) {
        System.out.println(formatLogEntry("INFO", message));
    }

    @Override
    public void logError(String message) {
        System.out.println(formatLogEntry("ERROR", message));
    }

    private String formatLogEntry(String logType, String message) {
        return String.format("[%s] %s", logType, message);
    }
}