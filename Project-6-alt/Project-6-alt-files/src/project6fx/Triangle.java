/*
* Project #6B
* Source Code File: Triangle.java
* Programmer: Thomas Wessel
* Due: 12/6/18
* Description: This is a java program that displays
* shapes based on the coordinates provided by project6.java
*/

package project6fx;

import javafx.scene.canvas.GraphicsContext;


public class Triangle extends Shape {

   public void display(GraphicsContext g){
       
   

     g.strokePolygon(new double[]{getX(), getX() + getBase(), getX() + (getBase() / 2)}, new double[]{getY(),getY() ,getY() + getHeight()},3);
    
    
   }
   
   private int base, height;
    
     Triangle(){
        super();
        setBase(1);
        setHeight(1);
    }
    
     Triangle(int newX, int newY, int newHeight, int newBase){
        super(newX,newY);
        setHeight(newHeight);
        setBase(newBase);
       
    
    }
    
    public int getHeight(){
        return height;
    }
    
    public int getBase(){
        return base;
    }
    
    private void setHeight(int newHeight){
        if (newHeight > 0){
            height = newHeight;
        }
        else{
        }
    }
    
    private void setBase(int newBase){
        if (newBase > 0){
            base = newBase;
        }
        else{}
    }
    
    
     public double getArea(){
        double area = .5 * base * height;
        return area;
    }
    
    
    public void display(){
        int x = getX();
        int y = getY();
        double area = getArea();
        
        System.out.println("Triangle: " + " (" + x + ", " + y + ")" + " , height: "
        + height + " , base: " + base + ", area: " + area);
    }
    
    
    
}
