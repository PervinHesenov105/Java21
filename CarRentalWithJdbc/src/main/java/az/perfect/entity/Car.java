/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.entity;

/**
 *
 * @author Perfect
 */
public class Car {

    private int car_id;
    private String brand;
    private String model;
    private int year;
    private int dailyPrice;
    private Category category;
    private Customers customer;

    public Car() {
    }

    public Car(int car_id) {
        this.car_id = car_id;
    }

    public Car(int car_id, String brand, String model, int year, int dailyPrice, Category category, Customers customer) {
        this.car_id = car_id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.dailyPrice = dailyPrice;
        this.category = category;
        this.customer = customer;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(int dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Car{" + "car_id=" + car_id + ", brand=" + brand + ", model=" + model + ", year=" + year + ", dailyPrice=" + dailyPrice + ", category=" + category + ", customer=" + customer + '}';
    }

}
