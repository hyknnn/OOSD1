/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical0;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author tony
 */
public class SquareNumberCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input 
        Scanner input = new Scanner(System.in);
        //declare all variables
        double a;
        double b;
        double c;
        
        //prompt the user to input a number 
        System.out.println("Input a number");
        a = input.nextDouble();
        
        //prompt the user to input a value to raise the number to
        System.out.println("What power would you like to raise this number to?");
        b = input.nextDouble();
        
        //calculate the inputs
        c = Math.pow(a, b);
        
        //print the result
        System.out.println(a + " raised to the power of " + b + " is " + c);
        
        
        
    }
    
}
