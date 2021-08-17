package com.car.api.car_api.car;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarContext context;
    
    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return context.getAllCars();
    }
    
    @PostMapping("/car")
    public void addCar(@RequestBody Car car, HttpServletResponse response) {
        context.addCar(car);
        response.setStatus(HttpServletResponse.SC_CREATED);
        response.setHeader("Message", "Resource Created");
    }

    @DeleteMapping("/car/{id}")
    public void deleteCar(@PathVariable int id, HttpServletResponse response) {
        context.deleteCar(id);
        response.setStatus(HttpServletResponse.SC_OK);
        response.setHeader("Message", "Resource Deleted");
    }

}
