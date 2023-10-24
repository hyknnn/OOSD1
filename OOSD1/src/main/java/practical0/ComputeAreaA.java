/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical0;

import java.util.Scanner;
/**
 *
 * @author tony
 */
public class ComputeAreaA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, area;
        
        System.out.println("Please input the radius of the circle");
        radius = input.nextDouble();
        
        area = radius * radius * 3.14159;
        System.out.println("The area of circle with the radius of " + radius + " is " + area + "cm^2");
    }
    
}
