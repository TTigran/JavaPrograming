package am.javaprogram.transportpark.datagenerator;

import am.javaprogram.transportpark.company.TransportPark;
import am.javaprogram.transportpark.transportparkvehicles.Bus;
import am.javaprogram.transportpark.transportparkvehicles.MicroBus;
import am.javaprogram.transportpark.transportparkvehicles.Taxi;

import java.util.Random;

public class DataGenerator {
    private final int SIZE = 10;
    private TransportPark transportPark = new TransportPark();

    public DataGenerator() {
        for (int i = 0; i < SIZE; i++) {
            generateTaxi(
                    getRangeByMinMax(100000, 199999),
                    getRangeByMinMax(10, 20),
                    getRangeByMinMax(1000,9000));
            generateBus(
                    getRangeByMinMax(200000, 299999),
                    getRangeByMinMax(10, 20),
                    getRangeByMinMax(1000,9000));
            generateMicroBus(
                    getRangeByMinMax(300000, 399999),
                    getRangeByMinMax(10, 20),
                    getRangeByMinMax(1000,9000));
        }
    }
    private void generateTaxi(int serialNumber, double fuelConsumption,int price) {
        transportPark.getTaxis().add(new Taxi(serialNumber, fuelConsumption,price));
    }

    private void generateBus(int serialNumber,  double fuelConsumption,int price) {
        transportPark.getBuses().add(new Bus(serialNumber, fuelConsumption,price));
    }

    private void generateMicroBus(int serialNumber,  double fuelConsumption,int price) {
        transportPark.getMicroBuses().add(new MicroBus(serialNumber, fuelConsumption,price));
    }

    private int getRangeByMinMax(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public TransportPark getTransportPark() {
        return transportPark;
    }
}
