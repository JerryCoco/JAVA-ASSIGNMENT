/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emolument;

/**
 *
 * @author user
 */

public class Emolument {
    // Encapsulated data fields
    private double basic_salary;
    private double tax_relief;

    // Constructor to initialize basic_salary and tax_relief
    public Emolument(double basic_salary, double tax_relief) {
        this.basic_salary = basic_salary;
        this.tax_relief = tax_relief;
    }

    // Method to get the basic salary
    public double getBasicSalary() {
        return basic_salary;
    }

    // Method to get the tax relief
    public double getTaxRelief() {
        return tax_relief;
    }

    // Method to compute SSNIT contribution (3.5% of Basic Salary)
    public double SSNIT() {
        return 0.035 * basic_salary;
    }

    // Method to compute Taxable Income
    public double taxableIncome() {
        return basic_salary - (tax_relief + SSNIT());
    }

    // Main method for testing
    public static void main(String[] args) {
        Emolument emolument = new Emolument(5000.00, 200.00);
        
        System.out.println("Basic Salary: " + emolument.getBasicSalary());
        System.out.println("Tax Relief: " + emolument.getTaxRelief());
        System.out.println("SSNIT Contribution: " + emolument.SSNIT());
        System.out.println("Taxable Income: " + emolument.taxableIncome());
    }
}

