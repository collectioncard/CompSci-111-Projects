/*
* Project #6B
* Source Code File: Shape.java
* Programmer: Thomas Wessel
* Due: 12/6/18
* Description: This is a java program that displays
* shapes based on the coordinates provided by project6.java
*/


package project6fx;
import javafx.scene.canvas.GraphicsContext;

  public abstract class Shape {
   
    
     
    

    //declare global variables
    private int x, y;
    private final int X_MAX_SIZE = 800, Y_MAX_SIZE = 600;
    
    //no argument constructor
    Shape(){
        x = 0;
        y = 0;
    }
    
    //constructor that changes both x and y
    Shape(int newX, int newY){
        setX(newX);
        setY(newY);
    
    
}
    
    
    //getX
    public int getX(){
        return(x);
    }
    
    //getY
    public int getY(){
        return(y);
    }
    
    //setX
    private void setX(int newX){
       if(newX <= X_MAX_SIZE){
         x = newX;  
       }
       else{}
    }
    
    //setY
    private void setY(int newY){
        if(newY <= Y_MAX_SIZE){
            y = newY;
        }    
        else{}
            
    }
    
    //method headers from the specification
    public abstract void display();
    public abstract double getArea();
    
    //Phase three
    public abstract void display(GraphicsContext g);

}




//This is finished according to phase one