package am.javaprogram.classes.carlist.servicess;

import am.javaprogram.classes.carlist.models.Car;
import am.javaprogram.classes.carlist.CarGenerator;

public class CarService {
    private Car[] carData = new Car[10];

    public CarService() {
        CarGenerator generator = new CarGenerator();
        for (int i = 0; i < carData.length; i++) {
            carData[i] = generator.generateCar();
        }
    }

    public void printData(Car[] array) {
        for (Car car : array) {
            if (car != null) {
                System.out.println(car.toString());
            }
        }
    }

    public Car[] getByFromYearIssue(int year, int price) {
        int countFoundData = 0;
        Car[] foundData = new Car[carData.length];
        for (Car car : carData) {
            if (car.getYearOfIssue().getYear() == year && car.getPrice() > price) {
                foundData[countFoundData++] = car;
            }
        }
        return foundData;
    }

    public Car[] getByBrand(String brand) {
        int countFoundData = 0;
        Car[] foundData = new Car[carData.length];
        for (Car car : carData) {
            if (car.getBrand().equals(brand)) {
                foundData[countFoundData++] = car;
            }
        }
        return foundData;
    }

    public Car[] getByModelAndOperatedYear(String model, int operatedYear) {
        int countFoundData = 0;
        Car[] foundData = new Car[carData.length];
        for (Car car : carData) {
            if (car.getModel().equals(model) && car.getOperatedYear() > operatedYear) {
                foundData[countFoundData++] = car;
            }
        }
        return foundData;
    }
}
