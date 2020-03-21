package am.javaprogram.airline;

import am.javaprogram.airline.airvehicles.Airplane;
import am.javaprogram.airline.company.Airline;
import am.javaprogram.airline.datagenerator.DataGenerator;
import am.javaprogram.airline.service.AirlineServiceImpl;

import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        DataGenerator dataGenerator =new DataGenerator();
        AirlineServiceImpl airlineService = new AirlineServiceImpl(dataGenerator);

        System.out.println("This airline support " + airlineService.overallSeats() + " seats");
        System.out.println("This airline support " + airlineService.overallCapacity() + " capacity");

        List<Airplane> airplaneByParameters = airlineService.getAirplaneByParameters(5, 160);
        airlineService.printFilteredAirplane(airplaneByParameters);
    }
}
