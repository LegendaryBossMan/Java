/*(Find the Largest Number) The process of finding the largest value is used frequently in computer applications. For example, a program that determines the winner of a sales contest would input the number of units sold by each salesperson. The salesperson who sells the most units wins the contest. Write a Java application that inputs a series of 10 integers and determines and prints the largest integer. Your program should use at least the following three variables, and you should name the variables counter, number, and largest.

counter : A counter to count to 10 (i.e., to keep track of how many numbers have been input and to determine when all 10 numbers have been processed).
number : The integer most recently input by the user.
largest : The largest number found so far.
Call the program Largest. The output should read: ?Largest number is (whatever the largest number is that the user has selected). Use a System.out.printf() statement for this.
//Program uses class Scanner */
import java.util.Scanner;

public class Calculate
{
  public static void main(String[] args)
  {
//create Scanner to obtain input from the command window
    
    Scanner input = new Scanner(System.in);
   
//initialization phase
    
     int number;
     int number2;
     

       System.out.print("Enter Number.");
       number = input.nextInt();
       System.out.print("Enter second number.");
       number2 = input.nextInt();
       
        int result;
        int result1;
        int result2;
        int result3;
        result = number + number2;
        result1 = number - number2;
        result2 = number * number2;
        result3 = number / number2;
        
        System.out.printf("Sum is: %d%n", result);//display sum
        System.out.printf("Difference is: %d%n", result1);//display difference
        System.out.printf("Product is: %d%n", result2);//display product
        System.out.printf("Quotient is: %d%n", result3);//displays quotient
      
    }
}
//end ClassAverage

