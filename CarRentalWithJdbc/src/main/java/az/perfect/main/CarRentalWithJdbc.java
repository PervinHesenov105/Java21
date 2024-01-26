/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package az.perfect.main;

import az.perfect.config.Context;
import az.perfect.entity.Car;
import az.perfect.entity.Category;
import az.perfect.entity.Customers;

/**
 *
 * @author Perfect
 */
public class CarRentalWithJdbc {

    public static void main(String[] args) {


        
        System.out.println( Context.instanceCarDao().getAllCar());
    }
}
