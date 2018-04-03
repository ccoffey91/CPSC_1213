import java.util.Scanner;  // Required for the Scanner object.

/**
*  MessageConverter.java will read a message from the user and
*  then require the user to enter a number. Subsequently, the
*  message will be formatted to the specified option.
*  
*  Activity 03
*  @author Robert Goodson - CPSC 1213: Introduction to Computer
*                           Science I
*  @version January 27, 2018
*/
public class MessageConverter
{
   /**
   *  Formats user input.
   *  @param args Command Line Args (Not Used)
   */
   public static void main(String[] args)
   {
      /*
      *  message: String object for the user input.
      *  outputType: An int representing the type of
      *              output the user wants.
      *  result: String object for the converted message.
      */
      int outputType = 0;
      String message = "", result = "";
      
      /*
      *  Scanner object for reading the user input from the
      *  keyboard.
      */
      Scanner userInput = new Scanner(System.in);
      
      /*
      *  Request input from the user then get user input using
      *  the nextLine() method of the Scanner class.
      */
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      
      // Get the user's input for the output type.
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      
      /*
      *  Use the static parseInt method of the Integer class
      *  to convert the string to an int value. In addition,
      *  get userInput as a String.
      */   
      outputType = Integer.parseInt(userInput.nextLine());
      
      if (outputType == 0) // As is
      {
         result = message;
      }
      else if (outputType == 1)  // Trimmed
      {
         result = message.trim();
      }
      else if (outputType == 2)  // lower case
      {
         result = message.toLowerCase();
      }
      else if (outputType == 3)  // UPPER CASE
      {
         result = message.toUpperCase();
      }
      else if (outputType == 4)  // v_w_ls r_pl_c_d
      {
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      else if (outputType == 5)  // Without first and last character
      {
         result = message.substring(1, message.length() - 1);
      
      }
      else  // Invalid input
      {
         result = "Error: Invalid choice input.";
      }
      // After the entire if-else statement, print out the result.
      System.out.println("\n" + result);
   }
}