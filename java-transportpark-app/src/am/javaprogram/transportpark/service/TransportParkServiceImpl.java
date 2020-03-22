package am.javaprogram.transportpark.service;

import am.javaprogram.transportpark.company.TransportPark;
import am.javaprogram.transportpark.datagenerator.DataGenerator;
import am.javaprogram.transportpark.service.compare.FuelConsumptionSorter;
import am.javaprogram.transportpark.transportparkvehicles.Bus;
import am.javaprogram.transportpark.transportparkvehicles.base.Transport;

import java.util.ArrayList;
import java.util.List;


public class TransportParkServiceImpl implements TransportParkService {
    private TransportPark transportPark;

    public TransportParkServiceImpl(DataGenerator generator) {
        this.transportPark =  generator.getTransportPark();
    }

    @Override
    public int calculateValue() {
        int allValue =
                getValue(transportPark.getTaxis()) +
                        getValue(transportPark.getBuses()) +
                        getValue(transportPark.getMicroBuses());
        return allValue;
    }

    @Override
    public void sort() {
        List<Bus> buses = transportPark.getBuses();
        buses.sort(new FuelConsumptionSorter());
    }

    @Override
    public List<Bus> getBusByParameters(int value,double fuelConsumption) {
        List<Bus> resultList = new ArrayList<>();
        List<Bus> buses = transportPark.getBuses();
        for (Bus airplane : buses) {
            if (airplane.getValue() > value && airplane.getFuelConsumption() > fuelConsumption) {
                resultList.add(airplane);
            }
        }
        return resultList;
    }

    public void printFilteredAirplane(List<? extends Transport> list) {
        for (Transport items : list) {
            System.out.println(items.toString());
        }
    }

    private int getValue(List<? extends Transport> list) {
        int result = 0;
        for (Transport item : list) {
            if (item != null) {
                result += item.getValue();
            }
        }
        return result;
    }

}
