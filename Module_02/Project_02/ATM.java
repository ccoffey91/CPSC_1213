import java.util.Scanner;  // Required for the Scanner object.

/**
*  ATM.java prompts the user to enter a value in whole dollars,
*  makes the appropriate calculations, and then displays the
*  applicable combination of twenties, tens, fives, and ones.
*  In addition, the input value should not exceed 500 dollars.
*
*  @author Robert Goodson
*  @version January 20, 2018
*/
public class ATM
{
   /**
   *  @param args Command Line Arguments (Not Used)
   */
   public static void main(String[] args)
   {
      // Variable declarations and assignments.
      int userInput = 0;
      int firstRemain = 0, secondRemain = 0, thirdRemain = 0;
      int twenties = 0, tens = 0, fives = 0, ones = 0;
      
      // Required for the Scanner object.
      Scanner keyboard = new Scanner(System.in);
      
      // Prompt the user to enter a dollar amount.
      System.out.print("Enter the amount: ");
      userInput = keyboard.nextInt();
      
      /* 
      *  A decision structure that performs the following tasks:
      *     a) Calculates the remainder(s) via the modulus operator;
      *     b) Utilizes the remainder(s) to calculate the number of
      *        bills for each denomation; and
      *     c) Sends the results to standard output for display
      *        via the appropriate format.
      *     d) In addition, if the standard input is greater than
      *        500, an error message will appear.
      */
      if (userInput <= 500)
      {
         firstRemain = userInput % 20;
         twenties = (userInput - firstRemain) / 20;
         
         secondRemain = firstRemain % 10;
         tens = (firstRemain - secondRemain) / 10;
         
         thirdRemain = secondRemain % 5;
         fives = (secondRemain - thirdRemain) / 5;
         
         ones = thirdRemain;
         
         System.out.print("Bills by denomination:\n\t"
                        + "$20: " + twenties + "\n\t"
                        + "$10: " + tens + "\n\t"
                        + "$5: " + fives + "\n\t"
                        + "$1: " + ones + "\n");
                        
         System.out.print("$" + userInput + " = (" + twenties + " * $20) + ("
                     + tens + " * $10) + (" + fives + " * $5) + (" + ones
                     + " * $1)");
      }
      else
      {
         System.out.print("Limit of $500 exceeded!");
      }
   }
}