/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical1;

//import scanner
import java.util.Scanner;

import java.lang.Math;

/**
 *
 * @author tony
 */
public class PaymentCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner input
        Scanner input = new Scanner(System.in);
        
        //declare variables
        double interest;
        double years;
        double loan;
        double total;
        double monthly;
        double compound;
        
        //prompt user to input varibles
        System.out.println("Input the loan amount");
        loan = input.nextDouble();
        
        System.out.println("Input the yearly interest rate");
        interest = input.nextDouble() / 100 + 1;
        
        System.out.println("Input the loan term (Years)");
        years = input.nextDouble();
                    
        //calculate the values and add them together
        compound = Math.pow(interest, years);
        total = loan * compound;
        monthly = total / (years * 12);
                
        //display monthly and total payment
        System.out.printf("Your total payment is %.2f ", total);
        System.out.printf("Your monthly payment is %.2f ", monthly);
    }
    
}
