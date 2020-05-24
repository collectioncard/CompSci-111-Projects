/*
* Project #2
* Source Code File: SumOfDigits.java
* Programmer: Thomas Wessel
* Due: 9/27/18
* Description: This is a java program that displays the sum of the individual
* digits that make up a larger number.
*/

package SumOfDigits;

import java.util.Scanner;


public class SumOfDigits {
    public static void main(String Args[]){
        
       Scanner keyboard = new Scanner(System.in);
        
       //declare variables
        int initialNum, ones, initialNumDivTen, tens, hundreds, sumOfDigits;
        
        //get initial number
        System.out.print("Enter an integer between 0 and 1000: ");
        initialNum = keyboard.nextInt();
        
        //determine first digit in entered number
        ones = initialNum %10;
               
        //divide initialNum by 10
        initialNumDivTen = initialNum / 10;
            
        //determine second digit in entered number
        tens = initialNumDivTen % 10;
        
        //get third number
        hundreds = initialNum / 100;
        
        //add digits together
        sumOfDigits = ones + tens + hundreds;
        
        //print the sum of digits
        System.out.println("The sum of all digits in " + initialNum + " is: " + sumOfDigits +".");












































        
        
    }
    
}
