/**
*  NumberOperations.java will hold an integer value and
*  provide methods to perform various operations on that
*  value.
*
*  Activity 05
*  @author Robert Goodson - CPSC 1213: Introduction to Computer
*                                      Science I
*  @version February 14, 2018
*/
public class NumberOperations
{
   private int number;
   
   /**
   *  The NumberOperations constructor takes an int parameter
   *  called numberIn.
   *
   *  @param numberIn User input with numbers.
   */
   public NumberOperations(int numberIn)
   {
      number = numberIn;
   }
   
   /**
   *  The getValue method takes no parameters; returns an int value.
   *
   *  @return number
   */
   public int getValue()
   {
      return number;
   }
   
   /**
   *  The oddsUnder method takes no parameters; returns a String.
   *
   *  @return output
   */
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number)
      {
         if (i % 2 != 0)
         {
            output += i + "\t";
         }
         i++;
      }
      
      return output;
   }
   
   /**
   *  The powersTwoUnder method takes no parameters; returns a String.
   *
   *  @return output
   */
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      
      while (powers < number)
      {
         output += powers + "\t";
         powers = powers * 2;
      }
      
      return output;
   }
   
   /**
   *  The isGreater method takes an int parameter called
   *  compareNumber; returns an int.
   *
   *  @param compareNumber Compare numbers.
   *  @return 0
   */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber)
      {
         return 1;
      }
      else if (number < compareNumber)
      {
         return -1;
      }
      else
      {
         return 0;
      }
   }
   
   /**
   *  The toString method takes no parameters; returns a String.
   *
   *  @return number
   */
   public String toString()
   {      
      return number + "";
   }
}