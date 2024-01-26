/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.dao.impl;

import az.perfect.config.AbstractDao;
import az.perfect.dao.inter.CarDaoInter;
import az.perfect.entity.Car;
import az.perfect.entity.Category;
import az.perfect.entity.Customers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Perfect
 */
public class CarDaoImpl extends AbstractDao implements CarDaoInter {

    @Override
    public void insert(Car car) {
        try ( Connection conn = connect()) {

            PreparedStatement st = conn.prepareStatement("insert into car(brand,model,year,dailyprice,category_id,customernumber)"
                    + "values (?,?,?,?,?,?)");
            st.setString(1, car.getBrand());
            st.setString(2, car.getModel());
            st.setInt(3, car.getYear());
            st.setInt(4, car.getDailyPrice());
            st.setInt(5, car.getCategory().getCategory_id());
            st.setInt(6, car.getCustomer().getCustomerNumber());

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void update(Car car) {
        try ( Connection conn = connect()) {

            PreparedStatement st = conn.prepareStatement("update car set brand=?,model=?,year=?,dailyprice=?,category_id=?,customernumber=? where car_id=?");

            st.setString(1, car.getBrand());
            st.setString(2, car.getModel());
            st.setInt(3, car.getYear());
            st.setInt(4, car.getDailyPrice());
            st.setInt(5, car.getCategory().getCategory_id());
            st.setInt(6, car.getCustomer().getCustomerNumber());
            st.setInt(7, car.getCar_id());

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {

        try ( Connection conn = connect()) {

            Statement st = conn.createStatement();
            st.execute("delete from car where car_id=" + id);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public Car getCarById(int id) {
        Car c = null;
        try ( Connection conn = connect()) {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from allinfo where car_id=" + id);

            while (rs.next()) {
                Category category = new Category(rs.getInt("category_id"), rs.getString("category_name"));
                Customers customer = new Customers(rs.getInt("customerNumber"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("contact"));
                c = new Car(rs.getInt("car_id"), rs.getString("brand"), rs.getString("model"), rs.getInt("year"), rs.getInt("dailyPrice"), category, customer);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return c;
    }

    @Override
    public List<Car> getAllCar() {
      List<Car> list = new ArrayList<>();
        try ( Connection conn = connect()) {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from allinfo ");

            while (rs.next()) {
                Category category = new Category(rs.getInt("category_id"), rs.getString("category_name"));
                Customers customer = new Customers(rs.getInt("customerNumber"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("contact"));
               Car c = new Car(rs.getInt("car_id"), rs.getString("brand"), rs.getString("model"), rs.getInt("year"), rs.getInt("dailyPrice"), category, customer);
            list.add(c);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
        
        
    }

}
