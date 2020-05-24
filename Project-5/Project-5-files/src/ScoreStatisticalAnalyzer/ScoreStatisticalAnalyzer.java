/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ScoreStatisticalAnalyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ScoreStatisticalAnalyzer {

    //global variables
    static int arraySize;
    
    
    public static void main(String args[])throws FileNotFoundException{
        
        //file opener
        File inputfile = new File("numbers.txt");
        
        //scanner for file
        Scanner input = new Scanner(inputfile);
        
        //variables
        arraySize = input.nextInt(); 
        
        
        //create array
        double[] scores = new double[arraySize];
        
        
        //adds items to array until it reaches the arraySize
        for(int i = 0; i < scores.length; i++){
        //this is assigning stuff to the array
         scores[i] = input.nextDouble();
            
    }
        //make sure to sort the array
        sort(scores);
  
        //the code that outputs stuff
         java.io.File file = new java.io.File("output.txt");
        
        try (java.io.PrintWriter output = new java.io.PrintWriter(file);){
            output.println(arraySize);
            
            for(double number: scores){
            
                if (number > averageArray(scores))
                output.println(number);
                else{
                    output.println(number + "*");
                }
                    
            }
            
            
            output.println("The average of these scores is: " + averageArray(scores));
            
        output.close();
        } catch (Exception e){}
    }  
      
 //sort method - stolen from textbook
  public static void sort(double[] scores){
        
         for (int i = 0; i < scores.length - 1; i++){
            double currentMin = scores[i];
            int currentMinIndex = i;
            
            for (int j = i +1; j < scores.length; j++){
                if (currentMin > scores[j]){
                    currentMin = scores [j];
                    currentMinIndex = j;
                }
            }
            
            if (currentMinIndex !=i){
                scores[currentMinIndex] = scores[i];
                scores[i] = currentMin;
            }
        }
    }
    
 //average array method
  static double averageArray(double[] scores){
      
      double average, sum = 0;
      
       for(double i : scores){
         sum += i;
     }   
    
        average = sum / arraySize;
      
        return average;
  }
       
}
