import java.util.Scanner;        // Required for the Scanner object.
import java.util.Random;         // Required for the Random class.
import java.text.DecimalFormat;  // Required for Decimal Format.

/**
*  SpaceTicket.java accepts coded space ticket information as
*  input that includes the ticket price, category, time, date,
*  and seat, followed by the description of the travel.
*  Afterwards, the applicable data will be outputted and formatted
*  accordingly.
*  
*  NOTE: For formatting instructions, refer to the applicable
*        documentation for this exercise.
*
*  Module 03 - Project 02
*  @author Robert Goodson - CPSC 1213: Introduction to Computer
*                                      Science I
*  @version February 1, 2018
*/
public class SpaceTicket
{
   static final double STUDENT_DISCOUNT = .25;
   static final double CHILD_DISCOUNT = .35;
   
   /**
   *  Calculates, formats, and saves data from the user's input.
   *  @param args Command Line Args (Not Used)
   */
   public static void main(String[] args)
   {
      String ticketCode = "", ticketTrim = "", ticketChar = "";
      String ticketPrice = "";
      int ticketLength = 0, prizeNumber = 0;
      char c = 'c', s = 's';
      double cost = 0, priceOff = 0;
      
      /*
      *  Scanner object for reading the user's input from the
      *  keyboard.
      */
      Scanner keyboard = new Scanner(System.in);
      
      // Prompt the user for the ticket's information.
      System.out.print("Enter ticket code: " + ticketCode);
      ticketCode = keyboard.nextLine();
      
      // Utilize the trim method.
      ticketTrim = ticketCode.trim();
      
      // Utilize the length method.
      ticketLength = ticketTrim.length();
      
      /**
      *  Utilize ticketLength as the basis for our decision
      *  structure. If the length is less than 25 characters
      *  then an error message will appear. Otherwise, the
      *  program will process the remaining code to the
      *  program's specifications.
      */
      if (ticketLength < 25)
      {
         System.out.print("\n*** Invalid ticket code ***\n"
                        + "Ticket code must have at least 25 characters");
      }
      else
      {
         // Code utilized for Space Ticket.
         String spaceX = ticketTrim;
         int index = spaceX.indexOf('S');
         String ticketIndex = spaceX.substring(index, spaceX.length());
         
         // Code utilized for Date.
         String date = ticketTrim;
         String month = date.substring(13, 15);
         String day = date.substring(15, 17);
         String year = date.substring(17, 21);
         
         // Code utilized for Time.
         String time = ticketTrim;
         String hour = time.substring(9, 11);
         String minute = time.substring(11, 13);
         
         // Code utilized for Seat.
         String seat = ticketTrim;
         String seatAssignment = seat.substring(21, 24);
         
         // Code utilized for Category.
         ticketChar = ticketTrim;
         char myChar = ticketChar.charAt(8);
         
         // Code utilized for Price.
         ticketPrice = ticketTrim;
         String price = ticketPrice.substring(0, 6);
         double finalPrice = Double.parseDouble(price);
         
         // Format the price of the ticket.
         DecimalFormat fmt = new DecimalFormat("$#,##0.00");
         
         // Code utilized for Cost.
         if (myChar == c)
         {
            priceOff = (finalPrice * CHILD_DISCOUNT);
            cost = (finalPrice - priceOff);
         }
         else if (myChar == s)
         {
            priceOff = (finalPrice * STUDENT_DISCOUNT);
            cost = (finalPrice - priceOff);
         }
         else
         {
            cost = finalPrice;
         }
         
         // Code utilized for Prize Number.
         Random generator = new Random();
         prizeNumber = generator.nextInt(1000000);
         
         // Print out the results of our computations.
         System.out.print("\nSpace Ticket: " + ticketIndex
                        + "\nDate: " + month + "/" + day + "/" + year
                        + "   Time: " + hour + ":" + minute + "   Seat: "
                        + seatAssignment
                        + "\nPrice: " + fmt.format(finalPrice)
                        + "   Category: " + myChar
                        + "   Cost: " + fmt.format(cost)
                        + "\nPrize Number: " + prizeNumber);
      }
   }
}