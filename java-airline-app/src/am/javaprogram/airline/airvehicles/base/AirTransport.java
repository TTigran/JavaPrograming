package am.javaprogram.airline.airvehicles.base;

public abstract class AirTransport {
    protected String type;
    protected int serialNumber;
    protected int seats;
    protected double capacity;
    protected double flightRange;

    public AirTransport(String type,int serialNumber, int seats, double capacity, double flightRange) {
        this.serialNumber = serialNumber;
        this.seats = seats;
        this.capacity = capacity;
        this.flightRange = flightRange;
        this.type =type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(double flightRange) {
        this.flightRange = flightRange;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract String getSerialNumber();
}
