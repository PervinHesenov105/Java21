/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.perfect.dao.inter;

import az.perfect.entity.Car;
import java.util.List;

/**
 *
 * @author Perfect
 */
public interface CarDaoInter {
    void insert(Car car);
    void update(Car car);
    void delete(int id);
    Car getCarById(int id);
    List<Car> getAllCar();
}
