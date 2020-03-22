package am.javaprogram.transportpark.transportparkvehicles.base;

public class Transport {
    protected String type;
    protected int serialNumber;
    protected double fuelConsumption;

    public Transport(String type,int serialNumber, double fuelConsumption) {
        this.serialNumber = serialNumber;
        this.fuelConsumption = fuelConsumption;
        this.type =type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
