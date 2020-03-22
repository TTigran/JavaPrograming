package am.javaprogram.transportpark.company;

import am.javaprogram.transportpark.transportparkvehicles.Bus;
import am.javaprogram.transportpark.transportparkvehicles.MicroBus;
import am.javaprogram.transportpark.transportparkvehicles.Taxi;

import java.util.ArrayList;
import java.util.List;

public class TransportPark {
    private List<Taxi> taxis;
    private List<Bus> buses;
    private List<MicroBus> microBuses;

    public TransportPark() {
        this.taxis = new ArrayList<>();
        this.buses = new ArrayList<>();
        this.microBuses =new ArrayList<>();
    }

    public List<Taxi> getTaxis() {
        return taxis;
    }

    public void setTaxis(List<Taxi> taxis) {
        this.taxis = taxis;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    public List<MicroBus> getMicroBuses() {
        return microBuses;
    }

    public void setMicroBuses(List<MicroBus> microBuses) {
        this.microBuses = microBuses;
    }
}
