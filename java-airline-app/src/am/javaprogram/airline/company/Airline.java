package am.javaprogram.airline.company;

import am.javaprogram.airline.airvehicles.Airplane;
import am.javaprogram.airline.airvehicles.Helicopter;
import am.javaprogram.airline.airvehicles.QuadCopter;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private List<Airplane> airplanes;
    private List<Helicopter> helicopters;
    private List<QuadCopter> quadCopters;

    public Airline() {
        this.airplanes   = new ArrayList<Airplane>();
        this.helicopters = new ArrayList<Helicopter>();
        this.quadCopters = new ArrayList<QuadCopter>();
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public List<Helicopter> getHelicopters() {
        return helicopters;
    }

    public void setHelicopters(List<Helicopter> helicopters) {
        this.helicopters = helicopters;
    }

    public List<QuadCopter> getQuadCopters() {
        return quadCopters;
    }

    public void setQuadCopters(List<QuadCopter> quadCopters) {
        this.quadCopters = quadCopters;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "airplanes=" + airplanes +
                ", helicopters=" + helicopters +
                ", quadCopters=" + quadCopters +
                '}';
    }


}
