/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical1;

//import scanner to read keyboard inputs
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class CelciusToFahrenheit {
    
    private static final DecimalFormat df = new DecimalFormat("0.00");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare variables
        double celcius;
        double fahrenheit;
        
        //take user input
        Scanner input = new Scanner(System.in);
        System.out.println("Input your temperature");
        celcius = input.nextDouble();
        
        //calculate coversion 
        fahrenheit = (9.0 / 5) * celcius + 32;
        
        //display converted temperature
        System.out.println(celcius + "°C is " + df.format(fahrenheit) + "°F");
    }
    
}
