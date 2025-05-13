package com.kraeskurs25.eksamenseksempelr;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepository {

    private final JdbcTemplate jdbcTemplate;
    private Logger logger = LoggerFactory.getLogger(CarRepository.class);
    public CarRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    RowMapper<Car> carRowMapper = (resultSet, RowNum) -> new Car(
            resultSet.getString("car_brand"),
            resultSet.getString("car_model"),
            resultSet.getString("registation_plate")
    );

    //create
    public void createCar(Car car){
        String sql = "insert into car (car_brand, car_model, registation_plate) values (?,?,?)";

        jdbcTemplate.update(sql, carRowMapper, car.getCarBrand(), car.getCarBrand(), car.getCarModel(), car.getCarModel());
        logger.info("Bil lagd! CarRepository");
    }
    //update
    //delete

    public void deleteCar(String regPlate){
        String sql = "delte car where car_plate=?";
        jdbcTemplate.update(sql,regPlate);
        logger.warn("bil slettet regPlate{}", regPlate);
    }
    //read
    public List<Car> getAllCars() {
        String sql = "select * from car";
        logger.warn("alle biler ble hentet");
        return jdbcTemplate.query(sql, carRowMapper);

    }

}
