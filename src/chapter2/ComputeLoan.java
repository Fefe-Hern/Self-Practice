/*
    Page 58, Chapter 2.16 = Software Development Process
Requirements Specification
System Analysis
System Design

Implementation
Testing
Deployment
Maintenance
*/
package chapter2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fefe
 */
public class ComputeLoan {
    public static void main(String[] args) {
        
        // Create a Scanner
        Scanner input = new Scanner(System.in);
    
        // Enter annual interest rate in percentage
        double annualInterestRate = Double.parseDouble(
                JOptionPane.showInputDialog("Enter annual interest rate, e.g., 7.25%: "));
    
        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
    
        // Enter number of years
        int numberOfYears = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number of years as an integer:"));
        
        // Enter loan amount
        double loanAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter loan amount: "));
        
        // Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        
        // Display results
        String monthlyPaymentString = "The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0 + "\n";
        String totalPaymentString = "The total payment is $" + (int)(totalPayment * 100) / 100.0;
        JOptionPane.showMessageDialog(null, monthlyPaymentString + totalPaymentString);
    }
}
