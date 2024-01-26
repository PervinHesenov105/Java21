/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.entity;

/**
 *
 * @author Perfect
 */
public class Customers {

    private int customerNumber;
    private String firstName;
    private String lastName;
    private String contact;

    public Customers(int customerNumber, String firstName, String lastName, String contact) {
        this.customerNumber = customerNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
    }

    public Customers(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Customers() {
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Customers{" + "customerNumber=" + customerNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", contact=" + contact + '}';
    }
    
    
}
