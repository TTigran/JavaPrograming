package am.javaprogram.transportpark.transportparkvehicles;

import am.javaprogram.transportpark.transportparkvehicles.base.Transport;

public class Bus extends Transport {
    public static final String TYPE ="Bus";

    public Bus(int serialNumber, double fuelConsumption,int value) {
        super(TYPE,serialNumber,fuelConsumption,value);
    }
}
