package am.javaprogram.transportpark.transportparkvehicles;

import am.javaprogram.transportpark.transportparkvehicles.base.Transport;

public class Taxi  extends Transport {
    public static final String TYPE ="Bus";

    public Taxi(int serialNumber, double fuelConsumption,int value) {
        super(TYPE,serialNumber,fuelConsumption,value);
    }
}
