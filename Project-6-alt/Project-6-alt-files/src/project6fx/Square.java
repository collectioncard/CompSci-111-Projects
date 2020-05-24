/*
* Project #6B
* Source Code File: Square.java
* Programmer: Thomas Wessel
* Due: 12/6/18
* Description: This is a java program that displays
* shapes based on the coordinates provided by project6.java
*/

package project6fx;


public class Square extends Rectangle {

    Square(){
        super();
    }
    
    Square(int newX, int newY, int newHeight, int newWidth){
        super(newX, newY, newHeight, newHeight);
    }
    
    public void setHeight(int newHeight){
        super.setHeight(newHeight);
        super.setWidth(newHeight);
    }
    
    public void setWidth(int newWidth){
        super.setHeight(newWidth);
        super.setWidth(newWidth);
    }
    
    
    
    public void display(){
       
        double area = getArea();

        System.out.println("Square: " + " (" + getX() + ", " + getY() + ")" + " , Width: "
                + width + " , Height: " + height + " , area: " + area);
    }
}
