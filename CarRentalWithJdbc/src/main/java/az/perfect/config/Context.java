/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.config;

import az.perfect.dao.impl.CarDaoImpl;
import az.perfect.dao.inter.CarDaoInter;

/**
 *
 * @author Perfect
 */
public class Context {
    
    
    public static CarDaoInter instanceCarDao(){
        return new CarDaoImpl();
    }
    
   
}
