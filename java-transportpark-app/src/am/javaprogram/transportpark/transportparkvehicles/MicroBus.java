package am.javaprogram.transportpark.transportparkvehicles;

import am.javaprogram.transportpark.transportparkvehicles.base.Transport;

public class MicroBus extends Transport {
    public static final String TYPE = "MicroBus";

    public MicroBus(int serialNumber, double fuelConsumption,int value) {
        super(TYPE, serialNumber, fuelConsumption,  value);
    }

}
