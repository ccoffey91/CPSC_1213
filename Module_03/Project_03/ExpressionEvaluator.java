import java.util.Scanner;        // Required for the Scanner object.
import java.text.DecimalFormat;  // Required for Decimal Format.

/**
*  ExpressionEvaluator.java utilizes the following expression to
*  calculate, format, and save the user's input:
*
*              (3x^5 - 2x^3)^2 / (|16x^7|)^1/2 + 1
*
*  Afterwards, the result should be printed and formatted as
*  specified.
*
*  Module 03 - Project 01
*  @author Robert Goodson - CPSC 1213: Introduction to Computer
*                                      Science I
*  @version January 31, 2018
*/
public class ExpressionEvaluator
{
   /**
   *  Calculates, formats, and saves data from the user's input.
   *  @param args Command Line Args (Not Used)
   */
   public static void main(String[] args)
   {
      double xValue = 0, numerator = 0, denominator = 0;
      double firstNumCalc = 0, secondNumCalc = 0, thirdNumCalc = 0;
      double firstDenomCalc = 0, secondDenomCalc = 0;
      double result = 0;
      
      /*
      *  Scanner object for reading the user's input from the
      *  keyboard.
      */
      Scanner keyboard = new Scanner(System.in);
      
      // Prompt the user for the value of x.
      System.out.print("Enter a value for x: ");
      xValue = keyboard.nextDouble();
      
      // Calculate the numerator.
      firstNumCalc = 3 * Math.pow(xValue, 5);
      secondNumCalc = 2 * Math.pow(xValue, 3);
      thirdNumCalc = firstNumCalc - secondNumCalc;
      numerator = Math.pow(thirdNumCalc, 2);
      
      // Calculate the denominator.
      firstDenomCalc = 16 * Math.pow(xValue, 7);
      secondDenomCalc = Math.sqrt(Math.abs(firstDenomCalc));
      denominator = secondDenomCalc + 1;
      
      /* 
      *  Calculate and print the result by dividing the numerator
      *  by the denominator.
      */
      result = numerator / denominator;
      
      System.out.println("Result: " + result);
      
      // Utilize the wrapper class.
      String secResult = Double.toString(result);
      
      // Format and print the results as specified.
      int index = secResult.indexOf('.');
      String lengthOfLeft = secResult.substring(0, index);
      String lengthOfRight = secResult.substring(index + 1, secResult.length());
      
      System.out.println("# digits to left of decimal point: "
                       + lengthOfLeft.length());
      System.out.println("# digits to right of decimal point: "
                       + lengthOfRight.length());
      
      // Format the original result.
      DecimalFormat fmt = new DecimalFormat("#,##0.0####");
      
      System.out.println("Formatted Result: " + fmt.format(result));
   }
}