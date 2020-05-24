/*
* Project #3
* Source Code File: GradeBook.java
* Programmer: Thomas Wessel
* Due: 10/18/18
* Description: This is a java program that allows users to enter a percentage and
* get an immediate grade and enters that grade into a gradebook. After entering (-1),
  the program calculates the number of each grade letter, average class score, and average grade.
*/

package GradeBook;


import java.util.Scanner;

public class GradeBook {
    
    public static void main(String args[]){
        
        //make that scanner yo!
        Scanner input = new Scanner(System.in);
        
        
        //declare variables and initialize them with a value of zero or null depending on the datatype
        int totalA = 0, totalB = 0, totalC = 0, totalD = 0, totalF = 0, totalScoreIn = 0;
        double averageScore = 0, grade = 0, totalScore = 0;
        String averageGrade = null;
        //Wow, that is a lot of variables
        
        
        //start sentinal loop (-1 escape)
        
        while(grade >= 0) {
            
            System.out.print("\nPlease enter percentage; -1 will run report: ");
            grade = input.nextDouble();
            
            if (grade >= 90 && grade <= 100){
                
                totalA ++;
                totalScoreIn ++;
                totalScore = totalScore + grade; 
                System.out.println( grade + "% is an A" );
      
            }
            
            else if (grade >= 80 && grade < 90){
                
                totalB ++;
                totalScoreIn ++;
                totalScore = totalScore + grade;
                System.out.println( grade + "% is a B" );
                
            }
            
            else if (grade >= 70 && grade < 80){
                
                totalC ++;
                totalScoreIn ++;
                totalScore = totalScore + grade;
                System.out.println( grade + "% is a c" );
                
            }
            
            else if (grade >= 60 && grade <70){
                
                totalD ++;
                totalScoreIn ++;
                totalScore = totalScore + grade;
                System.out.println( grade + "% is a D" );
                
            }
            
            else if (grade >= 0 && grade <60){
                
                totalF ++;
                totalScoreIn ++;
                totalScore = totalScore + grade;
                System.out.println( grade + "% is an F" );
            }
            
            else if( grade > 100){
                System.out.println("That is not a valid grade... Please try again!");
            }
            
            else{
                /* 
                I was going to put a terrible joke here, but I couldnt think of one
                */
            }            
            
            
            
            
            
        }
        
        
        //calculate average score
        
        averageScore = (totalScore) / totalScoreIn;
        
        
        //determine average grade based on average score
        
        if (averageScore >= 90 && averageScore <= 100){
            averageGrade = "A";
        }
        
        else if (averageScore >= 80 && averageScore < 90){
            averageGrade = "B";
        }
        
        else if (averageScore >= 70 && averageScore < 80){
            averageGrade = "C";
        }
        
        else if (averageScore >= 60 && averageScore <70){
            averageGrade = "D";
        }
        
        else if (averageScore >= 0 && averageScore <60){
            averageGrade = "F";
        }

        //print out required information
        System.out.println("\n \n \nGrade Report \n-----------------------" );
        System.out.println("Total number of A's: " + totalA);
        System.out.println("Total number of B's: " + totalB);
        System.out.println("Total number of C's: " + totalC);
        System.out.println("Total number of D's: " + totalD);
        System.out.println("Total number of F's: " + totalF);
        System.out.println("Total number of scores input: " + totalScoreIn);
        System.out.println("Average class score: " + averageScore);
        System.out.println("Average class grade: " + averageGrade);
        
        
        
        
        
        
        
    }
    
    
}
