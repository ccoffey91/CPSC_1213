import java.util.Scanner;  // Required for the Scanner object.

/**
*  FormulaCalculator.java prompts the user to enter a value
*  for x, y, and z, utilizes the given formula, and makes the
*  appropriate calculations. In addition, if the product of
*  x, y, and z is zero, the result is zero.
*
*  @author Robert Goodson
*  @version January 21, 2018
*/
public class FormulaCalculator
{
   /**
   *  @param args Command Line Arguments (Not Used)
   */
   public static void main(String[] args)
   {
      // Variable declarations and assignments.
      double x = 0, y = 0, z = 0;
      double result = 0;
      
      // Required for the Scanner object.
      Scanner keyboard = new Scanner(System.in);
      
      // Display the applicable formula for this exercise.
      System.out.println("result = (2x - 7.4)(4y + 9.3)(6z - 11.2) / xyz");
      
      // Prompt the user to enter a value for x, y, and z.
      System.out.print("\tEnter x: ");
      x = keyboard.nextDouble();
      
      System.out.print("\tEnter y: ");
      y = keyboard.nextDouble();
      
      System.out.print("\tEnter z: ");
      z = keyboard.nextDouble();
      
      /*
      *  A decision structure that performs the following tasks:
      *     a) If the product of x, y, and z is zero, the result is zero.
      *     b) Otherwise, the applicable formula is used, and the
      *        result is displayed.
      *
      *     NOTE: The applicable formula for this exercise is:
      *
      *           result = (2x - 7.4)(4y + 9.3)(6z - 11.2) / xyz
      */
      if (x == 0 || y == 0 || z == 0)
      {
         System.out.println("result = " + result);
      }
      else
      {
         result = (2 * x) - 7.4;
         result = ((4 * y) + 9.3) * result;
         result = ((6 * z) - 11.2) * result;
         result = result / (x * y * z);
         
         System.out.println("result = " + result);
      }
   }
}