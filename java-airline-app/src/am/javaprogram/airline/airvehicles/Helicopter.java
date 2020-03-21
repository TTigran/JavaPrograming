package am.javaprogram.airline.airvehicles;

import am.javaprogram.airline.airvehicles.base.AirTransport;

public class Helicopter extends AirTransport {

    private static final String TYPE = "Helicopter: ";

    public Helicopter(int serialNumber, int seats, double capacity, double flightRange) {
        super(TYPE,serialNumber, seats, capacity, flightRange);
    }

    @Override
    public String getSerialNumber() {
        return TYPE + serialNumber;
    }
}
