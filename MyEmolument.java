
import emolument.Emolument;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

public class MyEmolument extends Emolument {
    // Encapsulated data fields (inherited from Emolument)
    private double basic_salary;
    private double tax_relief;

    // Non-arg constructor that creates a default emolument
    public MyEmolument() {
        super(0, 0); // Calling the parent constructor with default values (0, 0)
        this.basic_salary = 0;
        this.tax_relief = 0;
    }

    // Constructor that creates MyEmolument with specified basic salary and tax relief
    public MyEmolument(double basic_salary, double tax_relief) {
        super(basic_salary, tax_relief); // Calling the parent constructor with specified values
        this.basic_salary = basic_salary;
        this.tax_relief = tax_relief;
    }

    // Method to compute the income tax
    public double incomeTax() {
        double taxableIncome = taxableIncome(); // Use the inherited taxableIncome method

        double tax = 0;
        
        // First 500.00 at 5%
        if (taxableIncome > 0) {
            double firstBracket = Math.min(taxableIncome, 500);
            tax += firstBracket * 0.05;
            taxableIncome -= firstBracket;
        }
        
        // Next 500.00 at 12.5%
        if (taxableIncome > 0) {
            double secondBracket = Math.min(taxableIncome, 500);
            tax += secondBracket * 0.125;
            taxableIncome -= secondBracket;
        }

        // Remaining income at 17.5%
        if (taxableIncome > 0) {
            tax += taxableIncome * 0.175;
        }

        return tax;
    }

    // Method to compute total deductions (SSNIT contribution + Income tax)
    public double totalDeduction() {
        return SSNIT() + incomeTax();
    }

    // Method to compute net salary (Basic salary - total deductions)
    public double netSalary() {
        return basic_salary - totalDeduction();
    }

    // Getters and setters (optional) if needed for basic_salary and tax_relief
    public double getBasicSalary() {
        return basic_salary;
    }

    public double getTaxRelief() {
        return tax_relief;
    }

    // Main method for testing
    public static void main(String[] args) {
        MyEmolument myEmolument = new MyEmolument(5000.00, 200.00);

        System.out.println("Basic Salary: " + myEmolument.getBasicSalary());
        System.out.println("Tax Relief: " + myEmolument.getTaxRelief());
        System.out.println("SSNIT Contribution: " + myEmolument.SSNIT());
        System.out.println("Taxable Income: " + myEmolument.taxableIncome());
        System.out.println("Income Tax: " + myEmolument.incomeTax());
        System.out.println("Total Deduction: " + myEmolument.totalDeduction());
        System.out.println("Net Salary: " + myEmolument.netSalary());
    }
}
