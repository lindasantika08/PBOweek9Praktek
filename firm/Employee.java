/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firm;

/**
 *
 * @author LINDA
 */
public class Employee extends StaffMember {
    protected String SocialSecurityNumber;
    protected double payRate;

    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        SocialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    public String toString() {
        String result = super.toString();
        result += "\nSocial Security Number: " + SocialSecurityNumber;
        return result;
    }

    public double pay() {
        return payRate;
    }
}

