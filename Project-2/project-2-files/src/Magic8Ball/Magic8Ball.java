/*
* Project #2
* Source Code File: Magic8Ball.java
* Programmer: Thomas Wessel
  Due: 9/27/18
* Description: This is a java program that prompts the user for a question, repeats it, and then 
* gives one of 20 random answers based upon a "random" number generator.
*/

package Magic8Ball;

import java.util.Scanner;


public class Magic8Ball {
    
    public static void main(String args[]){
        
    //declare variables
    String response, answer;
    int randomNumber;
    
    //set answer string to null
    answer = null;
    
    //start scanner
    Scanner keyboard = new Scanner(System.in);
        
    //ask person for a question that we will repeat
    System.out.print("What is your question? ");
    response = keyboard.nextLine();
    
    //repeat person's question
    System.out.println("Your question was: " + response);
    
    //generate a random integer from 0 to 19
    randomNumber = (int)(Math.random() * 20);

    //Using switch, respond something corresponding to number generated 
    switch (randomNumber) {
        
        case 0:
            answer = "It is certain";
            break;
        case 1:
            answer = "It is decidedly so";
            break;
        case 2:
            answer = "Without a doubt";
            break;
        case 3:
            answer = "Yes definitely";
            break;
        case 4:
            answer = "You may rely on it";
            break;
        case 5:
            answer = "As I see it, yes";
            break;
        case 6:
            answer = "Most likely";
            break;
        case 7:
            answer = "Outlook good";
            break;
        case 8:
            answer = "Yes";
            break;
        case 9:
            answer = "Signs point to yes";
            break;
        case 10:
            answer = "Reply hazy try again";
            break;
        case 11:
            answer = "Ask again later";
            break;
        case 12:
            answer = "Better not tell you now";
            break;
        case 13:
            answer = "Cannot predict now";
            break;
        case 14:
           answer = "Concentrate and ask again";
            break;
        case 15:
            answer = "Don't count on it";
            break;
        case 16:
            answer = "My reply is no";
            break;
        case 17:    
            answer = "My sources say no";
            break;
        case 18:        
            answer = "Outlook not so good";
            break;
        case 19:
            answer = "Very doubtful";
            break;
        
    }
    
    //print result
    System.out.println("My answer is: " + answer + ".");
    
    }
    
}
