package com.car.api.car_api.car;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CarContext {
    
    private static List<Car> cars = new ArrayList<>();
    private static int carCount = 3;

    static {
        cars.add(new Car(1, 
        "Chevrolet",
         "Bolt",
        new Date(),
         "Battery electric subcompact hatchback jointly developed with GM Korea. Also called the Opel Ampera-e for the European market up to 2020."));
    
         cars.add(new Car(2, 
        "Chevrolet",
         "Cruze",
        new Date(),
         "Hatchback version of the Cruze, currently marketed in Latin America. Previously the Cruze has been sold globally, including in Europe, North America and Asia-Pacific markets."));
        
         cars.add(new Car(3, 
         "Chevrolet",
          "Menlo",
         new Date(),
          "Battery electric compact crossover-styled hatchback/station wagon developed by SAIC-GM for the Chinese market."));

    }

    public static List<Car> getAllCars() {
        return cars;
    }

    public static Car addCar(Car car) {
        
        if (car.getId() == null) {
            car.setId(++carCount);
        }

        if (car.getIntroductionYear() == null) {
            car.setIntroductionYear(new Date());
        }

        cars.add(car);

        return car;
    }

    public static void deleteCar(int id) {

        for (Car car : cars) {
            
            if (car.getId() == id) {
                cars.remove(car);
            }

        }

    }

}
