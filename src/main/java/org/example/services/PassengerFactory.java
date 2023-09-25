package org.example.services;

import org.example.models.Passenger;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PassengerFactory {
    public static List<Passenger> createRandomPassengers() {
        Random random = new Random();
        int numberOfPassengers = 100 + random.nextInt(151);

        return IntStream.range(1, numberOfPassengers)
                .mapToObj(i -> new Passenger("Passenger" + i))
                .collect(Collectors.toList());
    }
}