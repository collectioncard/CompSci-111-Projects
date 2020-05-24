/*
* Project #2
* Source Code File: AverageAcceleration.java
* Programmer: Thomas Wessel
* Due: 9/27/18
* Description: This is a java program that calculates
* the average acceleration of an object given the final v, initial v, and time
* elapsed with the equation ( finalVelocity - initVelocity ) / seconds
*/

package AverageAcceleration;

import java.util.Scanner;


public class AverageAcceleration {
   
    public static void main(String args[]){
        
        //Declare variables
        double initVelocity, finalVelocity, seconds, averageA;
       
        //init scanner
        Scanner keyboard = new Scanner(System.in);
       
        //Get Data
        System.out.print("Enter v0, v1, and T: ");
        initVelocity = keyboard.nextDouble();
        finalVelocity = keyboard.nextDouble();
        seconds = keyboard.nextDouble();
              
        //calculate the average acceleration
        averageA = ( finalVelocity - initVelocity ) / seconds;
        
        
        //output the calculation 
        System.out.println("The average acceleration of the object is " + averageA);
         
    }
    
}
