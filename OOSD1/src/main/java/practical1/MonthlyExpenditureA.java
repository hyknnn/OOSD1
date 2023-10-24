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
public class MonthlyExpenditureA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String currency = "X";
        
        System.out.println("What is your currency? (£,$ etc)");
        currency = input.next();
        
        final double ACCOMODATION = 600.00;
        double foodExpenses;
        double leisureExpenses;
        double clothesExpenses;
        double totalSpent;
        
        System.out.println("Input food expenses");
        foodExpenses = input.nextDouble();
        
        System.out.println("Input leisure expenses");
        leisureExpenses = input.nextDouble();
        
        System.out.println("Input clothes expenses");
        clothesExpenses = input.nextDouble();
        
        totalSpent = foodExpenses + clothesExpenses + leisureExpenses + ACCOMODATION;
        
        System.out.println("Your total expenses are " + currency+totalSpent);
        
                
    }
    
}
