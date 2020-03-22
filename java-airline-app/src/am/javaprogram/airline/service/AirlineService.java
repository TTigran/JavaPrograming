package am.javaprogram.airline.service;

import am.javaprogram.airline.airvehicles.Airplane;

import java.util.List;

public interface AirlineService {

    int overallSeats();

    double overallCapacity();

    List<Airplane> getAirplaneByParameters( double capacity, int seats);
}
