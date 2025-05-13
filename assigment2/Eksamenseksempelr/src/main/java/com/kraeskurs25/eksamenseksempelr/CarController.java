package com.kraeskurs25.eksamenseksempelr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/carController")
public class CarController {
    private final Logger logger = LoggerFactory.getLogger(CarController.class);
    @Autowired
    private CarRepository carRepository;

    //create
    @PostMapping("/create")
    public void create(@RequestBody Car car) {
        logger.info("car created! CarController");
        carRepository.createCar(car);
    }

    //read
    @GetMapping("/read")
    public List<Car> getAllCars() {
        logger.info("car read");
        return carRepository.getAllCars();

    }

    //delete
    @DeleteMapping("/delete")
    public void delete(@RequestBody Car car) {
        carRepository.deleteCar(car.getRegPlate());
        logger.info("Attempt to delete car. CarController");

    }

}
