import java.util.ArrayList;   // Required for the ArrayList.
import java.util.Scanner;     // Required for the Scanner.

/**
*  TemperatureInfo.java functions as the main driver for TemperatureInfo.java
*  and Temperatures.java.
*
*  @author Robert Goodson - CPSC 1213: Introduction to Computer Science I
*  @version February 21, 2018
*/
public class TemperatureInfo
{
   /**
   *  The main method should prompt the user to enter a series of
   *  temperatures, then it should prompt the user to enter a
   *  char value for a switch statement, and finally, it should
   *  print out the applicable information.
   *
   *  @param args Command Line Arguments (Not Used)
   */
   public static void main(String[] args)
   {
      // Creates a new Scanner object and ArrayList.
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      
      /*
      *  The do while loop reads in temperature values, one per line, and
      *  adds each to tempsList until the user presses enter with no value
      *  to indicate that there are no more temperatures to be input.
      */
      String tempInput = "";
      do
      {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals(""))
         {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      
      // Creates a new ArrayList object named temps.
      Temperatures temps = new Temperatures(tempsList);
      
      /*
      *  The do while loop contains a switch statement that
      *  creates a menu with the following user choices:
      *     [L]ow temp: Prints the low temperature
      *     [H]igh temp: Prints the high temperature
      *     [P]rint: Prints the Temperatures object temps
      *     [E]nd: Ends the program 
      */
      char choice = 'E';
      do
      {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, "
                        + "[P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice)
         {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
               
            case 'P':
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
               
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }
}