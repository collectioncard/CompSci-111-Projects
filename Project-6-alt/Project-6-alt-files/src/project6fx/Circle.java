/*
* Project #6B
* Source Code File: Circle.java
* Programmer: Thomas Wessel
* Due: 12/6/18
* Description: This is a java program that displays
* shapes based on the coordinates provided by project6.java
*/

package project6fx;

import javafx.scene.canvas.GraphicsContext;

public class Circle extends Shape {
    
   public void display(GraphicsContext g){
    g.strokeOval(getX(), getY(), getRadius() * 2, getRadius() * 2); 
   }

    //Global Variables
    private int radius;
    
    //no argument constructor
    Circle(){
        super();
        radius = 1;
    }
    
    //Constructor with args
    Circle(int newX, int newY, int newRadius){
        super(newX, newY);
        setRadius(newRadius);
    }
    
    //getRadius Method
    public int getRadius(){
        return(radius);
    }
    
    //setRadius
    public void setRadius( int newRadius){
       
        if(newRadius > 0){
          radius = newRadius;  
        }
        
        else{
            
        }
        
    }
    
    //getArea
    
    public double getArea(){
        double area;
        final double pi = Math.PI;
        area = (radius * radius) * pi;
        return (area);
    }
    
    public void display(){
        int x = getX();
        int y = getY();
        double area = getArea();
        
        System.out.println("Circle: " + " (" + x + ", " + y + ")" + " , radius: "
        + radius + " , area: " + area);
    }
}


//Done According to specification