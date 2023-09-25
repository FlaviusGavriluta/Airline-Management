package org.example.utils;

public class Compass {
    private int id;
    private static int count = 0;
    private String brand;

    public Compass(String brand) {
        this.id = ++count;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Compass{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}