package am.javaprogram.transportpark.service;

import am.javaprogram.transportpark.transportparkvehicles.Bus;

import java.util.List;

public interface TransportParkService {
    int calculatePriceAllTransportPark();

    void sort();

    List<Bus> getBusByParameters(int value,double fuelConsumption);
}
