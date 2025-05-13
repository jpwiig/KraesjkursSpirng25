package com.kraeskurs25.eksamenseksempelr;

public class Car {
    private String carBrand;
    private String carModel;
    private String regPlate;
    public Car(String carBrand, String carModel, String regPlate) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.regPlate = regPlate;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setRegPlate(String regPlate) {
        this.regPlate = regPlate;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getRegPlate() {
        return regPlate;
    }
}
