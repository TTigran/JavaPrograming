package am.javaprogram.airline.service;

import am.javaprogram.airline.airvehicles.Airplane;
import am.javaprogram.airline.airvehicles.Helicopter;
import am.javaprogram.airline.airvehicles.QuadCopter;
import am.javaprogram.airline.airvehicles.base.AirTransport;
import am.javaprogram.airline.company.Airline;

import java.util.ArrayList;
import java.util.List;

public class AirlineServiceImpl implements AirlineService {

    public AirlineServiceImpl() { }

    @Override
    public int overallSeats(Airline airline) {
        int allSeats = getSeatsAirplanesOf(airline) + getSeatsHelicoptersOf(airline) + getSeatsQuadCoptersOf(airline);
        return allSeats;
     }

    @Override
    public double overallCapacity(Airline airline) {
        double allCapacity = getCapacityAirplanesOf(airline) + getCapacityHelicoptersOf(airline) + getCapacityQuadCoptersOf(airline);
        return allCapacity;
    }

    @Override
    public List<Airplane> getAirplaneByParameters(Airline airline , double capacity, int seats) {
        List<Airplane> resultList = new ArrayList<>();
        List<Airplane> airplanes = airline.getAirplanes();
        for (Airplane airplane : airplanes) {
            if(airplane.getSeats()>seats){
                resultList.add(airplane);
            }
        }
        return resultList;
    }

    public void printFilteredAirplane(List<? extends AirTransport> list){
        for (AirTransport items: list){
            System.out.println(items.getSeats());
        }
    }

    private int getSeatsAirplanesOf(Airline airline) {
        int result = 0;
        List<Airplane> airplanes = airline.getAirplanes();
        for (Airplane airplane : airplanes) {
            if (airplane != null) {
                result += airplane.getSeats();
            }
        }
        return result;
    }

    private int getSeatsHelicoptersOf(Airline airline) {
        int result = 0;
        List<Helicopter> helicopters = airline.getHelicopters();
        for (Helicopter helicopter : helicopters) {
            if (helicopter != null) {
                result += helicopter.getSeats();
            }
        }
        return result;
    }

    private int getSeatsQuadCoptersOf(Airline airline) {
        int result = 0;
        List<QuadCopter> quadCopters = airline.getQuadCopters();
        for (QuadCopter quadCopter : quadCopters) {
            if (quadCopter != null) {
                result += quadCopter.getSeats();
            }
        }
        return result;
    }

    private double getCapacityAirplanesOf(Airline airline) {
        double result = 0;
        List<Airplane> airplanes = airline.getAirplanes();
        for (Airplane airplane : airplanes) {
            if (airplane != null) {
                result += airplane.getCapacity();
            }
        }
        return result;
    }

    private double getCapacityHelicoptersOf(Airline airline) {
        double result = 0;
        List<Helicopter> helicopters = airline.getHelicopters();
        for (Helicopter helicopter : helicopters) {
            if (helicopter != null) {
                result += helicopter.getCapacity();
            }
        }
        return result;
    }

    private double getCapacityQuadCoptersOf(Airline airline) {
        double result = 0;
        List<QuadCopter> quadCopters = airline.getQuadCopters();
        for (QuadCopter quadCopter : quadCopters) {
            if (quadCopter != null) {
                result += quadCopter.getCapacity();
            }
        }
        return result;
    }

}
