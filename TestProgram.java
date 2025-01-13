/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emolument;

/**
 *
 * @author user
 */
public class TestProgram {
    
}
import javax.swing.JOptionPane;

public class TestProgram {
    public static void main(String[] args) {
        // Accept user input for basic salary and tax relief
        String basicSalaryInput = JOptionPane.showInputDialog("Enter Basic Salary:");
        String taxReliefInput = JOptionPane.showInputDialog("Enter Tax Relief:");

        // Convert the user input to double values
        double basicSalary = Double.parseDouble(basicSalaryInput);
        double taxRelief = Double.parseDouble(taxReliefInput);

        // Create a MyEmolument object named Staff_Salary with the input values
        MyEmolument staffSalary = new MyEmolument(basicSalary, taxRelief);

        // Prepare the result string for displaying the information
        String result = "Staff Salary Details:\n";
        result += "Basic Salary: " + staffSalary.getBasicSalary() + "\n";
        result += "Tax Relief: " + staffSalary.getTaxRelief() + "\n";
        result += "SSNIT Contribution: " + staffSalary.SSNIT() + "\n";
        result += "Taxable Income: " + staffSalary.taxableIncome() + "\n";
        result += "Income Tax: " + staffSalary.incomeTax() + "\n";
        result += "Total Deduction: " + staffSalary.totalDeduction() + "\n";
        result += "Net Salary: " + staffSalary.netSalary();

        // Display the result in a message dialog
        JOptionPane.showMessageDialog(null, result);
    }
}
