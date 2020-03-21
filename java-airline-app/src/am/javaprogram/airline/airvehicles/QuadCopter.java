package am.javaprogram.airline.airvehicles;

import am.javaprogram.airline.airvehicles.base.AirTransport;

public class QuadCopter extends AirTransport {

    private static final String TYPE = "QuadCopter: ";

    public QuadCopter(int serialNumber, int seats, double capacity, double flightRange) {
        super(TYPE,serialNumber, seats, capacity, flightRange);
    }

    @Override
    public String getSerialNumber() {
        return TYPE + serialNumber;
    }
}
