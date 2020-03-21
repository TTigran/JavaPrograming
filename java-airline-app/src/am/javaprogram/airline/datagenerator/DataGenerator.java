package am.javaprogram.airline.datagenerator;

import am.javaprogram.airline.airvehicles.Airplane;
import am.javaprogram.airline.airvehicles.Helicopter;
import am.javaprogram.airline.airvehicles.QuadCopter;
import am.javaprogram.airline.company.Airline;

import java.util.Random;

public class DataGenerator {
    private final int SIZE = 10;
    private Airline airline = new Airline();

    public DataGenerator() {
        for (int i = 0; i < SIZE; i++) {
            generateAirplane(
                    getRangeByMinMax(100000, 199999),
                    getRangeByMinMax(100, 200),
                    getRangeByMinMax(1, 10),
                    getRangeByMinMax(1000, 2000));
            generateHelicopter(
                    getRangeByMinMax(100000, 199999),
                    getRangeByMinMax(100, 200),
                    getRangeByMinMax(1, 10),
                    getRangeByMinMax(1000, 2000));
            generateQuadCopter(
                    getRangeByMinMax(100000, 199999),
                    getRangeByMinMax(100, 200),
                    getRangeByMinMax(1, 10),
                    getRangeByMinMax(1000, 2000));
        }
    }

    private void generateAirplane(int serialNumber, int seats, double capacity, double flightRange) {
        airline.getAirplanes().add(new Airplane(serialNumber, seats, capacity, flightRange));
    }

    private void generateHelicopter(int serialNumber, int seats, double capacity, double flightRange) {
        airline.getHelicopters().add(new Helicopter(serialNumber, seats, capacity, flightRange));
    }

    private void generateQuadCopter(int serialNumber, int seats, double capacity, double flightRange) {
        airline.getQuadCopters().add(new QuadCopter(serialNumber, seats, capacity, flightRange));
    }

    private int getRangeByMinMax(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public Airline getAirline() {
        return airline;
    }
}
