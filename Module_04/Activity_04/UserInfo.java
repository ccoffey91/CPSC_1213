/**
*  UserInfo.java is the skeleton code for UserInfoDriver.java.
*
*  Activity 04
*  @author Robert Goodson - CPSC 1213: Introduction to Computer
*                                      Science I
*  @version February 8, 2018
*/
public class UserInfo
{
   // instance variables
   private String firstName, lastName, location;
   private int age, status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   /**
   *  Constructor for my skeleton code.
   *
   *  @param firstNameIn User input for the first name.
   *  @param lastNameIn User input for the second name.
   */
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   /**
   *  Method for my skeleton code.
   *
   *  @return output
   */
   public String toString()
   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)
      {
         output += "Offline";
      }
      else
      {
         output += "Online";
      }
      
      return output;
   }
   
   /**
   *  A setter for my skeleton code.
   *
   *  @param locationIn User input for the location.
   */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   
   /**
   *  A setter for my skeleton code.
   *
   *  @param ageIn User input for the age.
   *  @return isSet
   */
   public boolean setAge(int ageIn)
   {
      boolean isSet = false;
      if (ageIn > 0)
      {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
   *  A getter for my skeleton code.
   *
   *  @return age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
   *  A getter for my skeleton code.
   *
   *  @return location
   */
   public String getLocation()
   {
      return location;
   }
   
   /**
   *  @status OFFLINE
   */
   public void logOff()
   {
      status = OFFLINE;
   }
   
   /**
   *  @status ONLINE
   */
   public void logOn()
   {
      status = ONLINE;
   }
}