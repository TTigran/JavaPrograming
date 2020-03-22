package am.javaprogram.transportpark.transportparkvehicles.base;

public class Transport {
    protected String type;
    protected int serialNumber;
    protected double fuelConsumption;
    protected int price;

    public Transport(String type,int serialNumber, double fuelConsumption, int price) {
        this.serialNumber = serialNumber;
        this.fuelConsumption = fuelConsumption;
        this.type =type;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
