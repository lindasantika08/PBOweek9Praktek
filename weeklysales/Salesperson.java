/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weeklysales;

/**
 *
 * @author LINDA
 */
public class Salesperson implements Comparable{
    private String firstName, lastName;
    private int totalSales;
    
    public Salesperson (String first, String last, int sales){
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    
    public String toString(){
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    
    public boolean equals (Object other){
        return (lastName.equals(((Salesperson)other).getLastName()) && firstName.equals(((Salesperson)other).getFirstName()));
    }
    
    public int compareTo(Object other) {
        // Menggantikan variabel result dengan perbandingan total penjualan
        int thisSales = this.totalSales;
        int otherSales = ((Salesperson) other).totalSales;

        if (thisSales < otherSales) {
            return -1; // Penjualan saat ini lebih kecil
        } else if (thisSales > otherSales) {
            return 1; // Penjualan saat ini lebih besar
        } else {
            // Jika total penjualan sama, bandingkan berdasarkan nama
            int lastNameComparison = this.lastName.compareTo(((Salesperson) other).lastName);
            if (lastNameComparison != 0) {
                return lastNameComparison;
            } else {
                return this.firstName.compareTo(((Salesperson) other).firstName);
            }
        }
    }

    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getSales(){
        return totalSales;
    }
}
