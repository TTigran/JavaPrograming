package am.javaprogram.airline.service;

import am.javaprogram.airline.airvehicles.Airplane;
import am.javaprogram.airline.airvehicles.base.AirTransport;
import am.javaprogram.airline.company.Airline;

import java.util.List;

public interface AirlineService {

    int overallSeats();

    double overallCapacity();

    List<Airplane> getAirplaneByParameters( double capacity, int seats);
}
