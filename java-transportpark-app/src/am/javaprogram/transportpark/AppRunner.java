package am.javaprogram.transportpark;

import am.javaprogram.transportpark.datagenerator.DataGenerator;
import am.javaprogram.transportpark.service.TransportParkServiceImpl;
import am.javaprogram.transportpark.transportparkvehicles.Bus;

import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        DataGenerator dataGenerator = new DataGenerator();
        TransportParkServiceImpl transportParkService = new TransportParkServiceImpl(dataGenerator);

        System.out.println("This TransportPar support " + transportParkService.calculateValue() + " $");
        transportParkService.sort();

        List<Bus> airplaneByParameters = transportParkService.getBusByParameters(3000, 160);
        transportParkService.printFilteredAirplane(airplaneByParameters);
    }
}
