/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical0;

/**
 *
 * @author tony
 */
public class ComputeArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius;
        double area;
        
        final double PI=3.14159;
        
        radius = 40;
        
        area = radius * radius * PI;
        
        System.out.println("The area of the circle is " + area + "cm^2" );
    }
    
}
