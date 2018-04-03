import java.util.Scanner;

/**
*  AgeStatistics.java prompts the user for data,
*  performs various calculations, and returns the
*  information back to the user via std output.
*
*  @author Robert Goodson
*  @version January 19, 2018
*/
public class AgeStatistics
{
   /**
   *  @param args Command Line Arguments - Not Used
   */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      // Prompt the user for their name.
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      // Prompt the user for their age.
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      // Prompt the user for their gender.
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      // Convert and calculate the user's age.
      System.out.println("\tYour age in minutes is "
            + ageInYears * 525600 + " minutes.");
        
      System.out.println("\tYour age in centuries is "
            + (double) ageInYears / 100 + " centuries.");
            
      // Display the user's max heart rate.
      System.out.print("Your max heart rate is ");
      
      // Calculate female MHR.
      if (gender == 1)
      {
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else  // Calculate male MHR.
      {
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      System.out.println(maxHeartRate + " beats per minute.");
   }
}