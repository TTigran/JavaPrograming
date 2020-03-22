package am.javaprogram.transportpark.service.compare;

import am.javaprogram.transportpark.transportparkvehicles.base.Transport;

import java.util.Comparator;

public class FuelConsumptionSorter implements Comparator<Transport> {
    @Override
    public int compare(Transport o1, Transport o2) {
        Double d1 = o2.getFuelConsumption();
        Double d2 = o2.getFuelConsumption();
        return d1.compareTo(d2);
    }
}
