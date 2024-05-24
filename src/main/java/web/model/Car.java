package web.model;

import org.springframework.stereotype.Component;


public class Car {
    private String model;
    private String transmission;
    private int year;

    public Car() {
    }

    public Car(String model, String transmission, int year) {
        this.model = model;
        this.transmission = transmission;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "web.model='" + model + '\'' +
                ", transmission='" + transmission + '\'' +
                ", year=" + year +
                '}';
    }
}
