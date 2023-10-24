/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical1;

import java.lang.Math;

/**
 *
 * @author tony
 */
public class Population {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declare variables
        double population;
        double seconds;
        double births;
        double deaths;
        double immigrants;
        double change;
        
        //assign variables
        seconds = 31536000;
        population = 312032486;
        
        //calculate births, deaths and immigrations total
        births = Math.ceil(seconds / 7);
        deaths = Math.ceil(seconds / 13);
        immigrants = Math.ceil(seconds / 45);
        change = births - deaths + immigrants;
        
        //display changes for each year
        population = population + change;
        System.out.printf("\n The population for year 1 is %.0f", population);
        population = population + change;
        System.out.printf("\n The population for year 2 is %.0f", population);
        population = population + change;
        System.out.printf("\n The population for year 3 is %.0f",population);
        population = population + change;
        System.out.printf("\n The population for year 4 is %.0f", population);
        population = population + change;
        System.out.printf("\n The population for year 5 is %.0f", population);
        
        
        
        
        
        
        
        
    }
    
}
