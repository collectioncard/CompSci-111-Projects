/*
* Project #1
* Source Code File: CircleAreaPerimeter.java
* Programmer: Thomas Wessel
* Due: 9/6/18
* Description: This is a java program that displays
* the area and perimeter of a circle with a radius of 5.5
* and a value of 3.14159 for pi.
*/
package CircleAreaPerimeter;


public class CircleAreaPerimeter {
    
    public static void main(String[] args){
        
        //declare variables
        double radius, perimeter, area, pi;
        
        //define static variables
        radius = 5.5;
        pi = 3.14159;
        
        //define variables with mathematic function
        perimeter = 2 * radius * pi;
        area = radius * radius * pi;
        
        //print results of calculations 
        System.out.println("The perimeter and area of a circle with a radius of " 
               + radius + " is " + perimeter + " and " + area + " respectively.");
        
      //End  
    }
}
