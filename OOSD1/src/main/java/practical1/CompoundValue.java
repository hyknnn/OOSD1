/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical1;

import java.util.Scanner;

/**
 *
 * @author tony
 */
public class CompoundValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declare variables
        double monthlyInvestment;
        double interest;
        double monthlyInterest;
        double cumulative;
        double monthsCalculated;
        int monthsSaving;
   
        
        //input monthly investment, interest rate & savings term
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter monthly Investment amount:");
        monthlyInvestment = input.nextDouble();
        
        System.out.println("Input your annual interest rate:");
        interest = input.nextDouble();
        
        System.out.println("Input the amount of months you would like to save for:");
        monthsSaving = input.nextInt();
        
        //calculate monthly interest
        monthlyInterest = 1 + ((interest / 100) / 12.0);
        
        monthsCalculated = 0;
        
        cumulative = 0;
        
        //loop to calculate investment up to the month inputted
        while(true) {
            if (monthsCalculated == monthsSaving) {
                break;
            }
            
            cumulative = (cumulative + monthlyInvestment) * monthlyInterest;
            monthsCalculated = monthsCalculated + 1;
        }
        
        //print the account balance to 2 d.p
        System.out.printf("After the " + monthsSaving + "th month, the account balance is £%.2f", cumulative);
       
    }
    
}
