package am.javaprogram.airline.service;

import am.javaprogram.airline.airvehicles.Airplane;
import am.javaprogram.airline.airvehicles.base.AirTransport;
import am.javaprogram.airline.company.Airline;
import am.javaprogram.airline.datagenerator.DataGenerator;

import java.util.ArrayList;
import java.util.List;

public class AirlineServiceImpl implements AirlineService {

    private Airline airline;

    public AirlineServiceImpl(DataGenerator generator) {
        airline = generator.getAirline();
    }

    @Override
    public int overallSeats() {
        int allSeats =
                getSeats(airline.getAirplanes()) +
                getSeats(airline.getHelicopters()) +
                getSeats(airline.getQuadCopters());
        return allSeats;
    }

    @Override
    public double overallCapacity() {
        double allCapacity =
                getCapacity(airline.getAirplanes()) +
                getCapacity(airline.getHelicopters()) +
                getCapacity(airline.getQuadCopters());
        return allCapacity;
    }

    @Override
    public List<Airplane> getAirplaneByParameters(double capacity, int seats) {
        List<Airplane> resultList = new ArrayList<>();
        List<Airplane> airplanes = airline.getAirplanes();
        for (Airplane airplane : airplanes) {
            if (airplane.getSeats() > seats && airplane.getCapacity()>capacity) {
                resultList.add(airplane);
            }
        }
        return resultList;
    }

    public void printFilteredAirplane(List<? extends AirTransport> list) {
        for (AirTransport items : list) {
            System.out.println(items.getSeats());
        }
    }

    private int getSeats(List<? extends AirTransport> list) {
        int result = 0;
        for (AirTransport item : list) {
            if (item != null) {
                result += item.getSeats();
            }
        }
        return result;
    }

    private double getCapacity(List<? extends AirTransport> list) {
        double result = 0;
        for (AirTransport item : list) {
            if (item != null) {
                result += item.getCapacity();
            }
        }
        return result;
    }
}
