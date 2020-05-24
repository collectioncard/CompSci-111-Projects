/*
* Project #6B
* Source Code File: Rectangle.java
* Programmer: Thomas Wessel
* Due: 12/6/18
* Description: This is a java program that displays
* shapes based on the coordinates provided by project6.java
*/

package project6fx;

import javafx.scene.canvas.GraphicsContext;


public class Rectangle extends Shape {

    public void display(GraphicsContext g){
    g.strokeRect(getX(), getY(), width, height);
   }
    //Global Variables
    public int width, height;
    

    Rectangle() {
        super();
        setWidth(1);
        setHeight(1);

    }

    Rectangle(int newX, int newY, int newWidth, int newHeight) {
        super(newX, newY);
        setWidth(newWidth);
        setHeight(newHeight);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int newWidth) {
        if (newWidth > 0) {
            width = newWidth;
        } else {
        }
    }

    public void setHeight(int newHeight) {
        if (newHeight > 0) {
            height = newHeight;
        }
    }

    public double getArea() {
        double area = width * height;
        return area;
    }

    public void display() {
       /* int x = getX();
        int y = getY();*/
        double area = getArea();

        System.out.println("Rectangle: " + " (" + getX() + ", " + getY() + ")" + " , Width: "
                + width + " , Height: " + height + " , area: " + area);
    }

}

//I think this is done...
