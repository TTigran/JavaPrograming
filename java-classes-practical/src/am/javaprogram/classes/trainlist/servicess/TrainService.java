package am.javaprogram.classes.trainlist.servicess;

import am.javaprogram.classes.trainlist.TrainGenerator;
import am.javaprogram.classes.trainlist.models.Train;

public class TrainService {
    private Train[] trainData = new Train[10];

    public TrainService() {
        TrainGenerator generator = new TrainGenerator();
        for (int i = 0; i < trainData.length; i++) {
            trainData[i] = generator.generateBook();
        }
    }

    public void printData(Train[] array) {
        for (Train train : array) {
            if (train != null) {
                System.out.println(train.toString());
            }
        }
    }

    public Train[] getByDestination(String destination) {
        int countFoundData = 0;
        Train[] foundData = new Train[trainData.length];
        for (Train train : trainData) {
            if (train.getDestination().equals(destination)) {
                foundData[countFoundData++] = train;
            }
        }
        return foundData;
    }

    public Train[] getByDestinationAndAfterDepartureTime(String destination, String departureTime) {
        int countFoundData = 0;
        Train[] foundData = new Train[trainData.length];
        for (Train train : trainData) {
            if (train.getDestination().equals(destination)) {
                foundData[countFoundData++] = train;
            }
        }
        return foundData;
    }

    public Train[] getByDestinationAndNumberSeats(String destination,int seats) {
        int countFoundData = 0;
        Train[] foundData = new Train[trainData.length];
        for (Train train : trainData) {
            if (train.getSeats() > seats && train.getDestination().equals(destination)) {
                foundData[countFoundData++] = train;
            }
        }
        return foundData;
    }
}
