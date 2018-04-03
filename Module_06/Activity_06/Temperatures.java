import java.util.ArrayList;   // Required for the ArrayList.

/**
*  Temperatures.java will hold a set of integer values
*  representing daily temperatures.
*
*  Activity 06
*  @author Robert Goodson - CPSC 1213: Introduction to Computer
*                                      Science I
*  @version February 21, 2018
*/
public class Temperatures
{
   private ArrayList<Integer> temperatures;
   
   /**
   *  Constructor for the Temperatures class.
   *
   *  @param temperaturesIn Passes in the ArrayList before
   *                        setting it to temperatures.
   */
   public Temperatures(ArrayList<Integer> temperaturesIn)
   {
      temperatures = temperaturesIn;
   }
   
   /**
   *  The getLowTemp method accepts no parameters and returns an
   *  integer value.
   *
   *  @return low Returns the lowest temperature.
   */
   public int getLowTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++)
      {
         if (temperatures.get(i) < low)
         {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   
   /**
   *  The getHighTemp method accepts no parameters and returns an
   *  integer value.
   *
   *  @return high Returns the highest temperature.
   */
   public int getHighTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      
      int high = temperatures.get(0);
      for (Integer temp : temperatures)
      {
         if (temp > high)
         {
            high = temp;
         }
      }
      return high;
   }
   
   /**
   *  The lowerMinimum method accepts an integer parameter and returns
   *  an integer value.
   *
   *  @param lowIn Passes the temperature value for lower minimum.
   *  @return lowIn Returns the temperature value for lower minimum.
   */
   public int lowerMinimum(int lowIn)
   {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
   *  The higherMaximum method accepts an integer parameter and returns
   *  an integer value.
   *
   *  @param highIn Passes the temperature value for higher maximum.
   *  @return highIn Returns the temperature value for higher maximum.
   */
   public int higherMaximum(int highIn)
   {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
   *  The toString method accepts no parameters and returns a String
   *  value.
   *
   *  @return Returns the temperature information in a String format.
   */
   public String toString()
   {
      return "\tTemperatures: " + temperatures
           + "\n\tLow: " + getLowTemp()
           + "\n\tHigh: " + getHighTemp();
   }
}