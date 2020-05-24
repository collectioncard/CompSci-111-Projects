/*
* Project #4
* Source Code File: PictureViewer.java
* Programmer: Thomas Wessel
* Due: 11/01/18
* Description: This is a java program that allows users to choose a image number and 
* either show it or either show a random image from a webserver.
*/

package ToSpecification;

import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class PictureViewer {
    
    //global scanner
    static Scanner input = new Scanner(System.in);
    
    //Global Variables
    final static int MIN_NUMBER = 1;
    final static int MAX_NUMBER = 8;
    static int image_number = 1;
    
    //Main 
    public static void main(String args[]){
    
            showMenu();
   
    }
    
    //forward
    public static int forward(int current_number){
         
        if(current_number < MAX_NUMBER){
            current_number ++;
        }
        else{
            current_number = MIN_NUMBER;
            
            }
         
        return current_number;
     }
     
    //backward
    public static int backward(int current_number){
       
        if(current_number == MIN_NUMBER){
             current_number = MIN_NUMBER;
         }
        else{
             current_number --;
         }
        return current_number;
     }
     
    //forward overload 
    public static void forward(){
         
        if(image_number + 1 <= MAX_NUMBER){
            image_number ++;
          }
         else{
            image_number = MIN_NUMBER;
          }
        }
          
    //backward overload
    public static void backward(){
              
        if(image_number - 1 <= MIN_NUMBER){
            image_number = MIN_NUMBER;
         }
        else{
            image_number --;
         }      
       }
    
    //createFileName
    public static void createFileName(){
        
        String concat = "picture" + image_number +".jpg";
        
        showWindow(concat);  
       }

     //createRandomName
     public static void createRandomName(){
         
         int randNumber = (int)(Math.random() * 8 + 1);
         String concat = "picture" + randNumber +".jpg";
         showWindow(concat); 
       }
     
     //The long one, aka: showMenu
     public static void showMenu(){
        int selection = 0;
    while(true){
        System.out.println("\n\n====================");
        System.out.print("(1) Forward\n(2) Forward (Overload) \n(3) Backward \n(4)"
            + " Backward (Overload) \n(5) Create Filename \n(6) Create Random File Name"
            + "\n(7) Exit \nCurrent image number: " + image_number +"\n===================="
                    + "\nChoose an option: ");
    
        selection = input.nextInt();
    
        switch(selection){
        
            case 1:
             image_number = forward(image_number);
             break;
         
            case 2:
             forward();
             break;
           
            case 3:
             image_number = backward(image_number);
             break;
            
            case 4:
             backward();
             break;
            
            case 5:
             createFileName();
             break;
            
            case 6:
             createRandomName();
             break;
            
            case 7:
             System.exit(0);
             break;
        }
        }
     }

     //start of pre-existing code
     public static void showWindow(String filename) {
        JPanel myPanel = new JPanel();
        JFrame pictureFrame = new JFrame();
        pictureFrame.setTitle(filename);
        pictureFrame.setSize(800, 600);
        pictureFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myPanel.add(load_picture(filename));
        pictureFrame.add(myPanel);
        pictureFrame.setVisible(true);
      }
     public static JLabel load_picture(String imagefile) {
        JLabel templabel = null;
        String startURL = "";
        if(!imagefile.startsWith("http"))
            startURL = "http://riveira.x10host.com/CMPSCI111L/images/";
        URL myURL = null;
        try {
            myURL = new URL(startURL + imagefile);
            BufferedImage myPicture = ImageIO.read(myURL);
            templabel = new JLabel(new ImageIcon(myPicture));
        }
        catch(Exception e) {
            System.out.println("Error caught " + e.toString());
        }
        return templabel;
    } 
}
