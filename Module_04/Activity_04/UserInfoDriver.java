/**
*  UserInfoDriver.java creates two objects from the skeleton code
*  found within UserInfo.java.
*
*  Activity 04
*  @author Robert Goodson - CPSC 1213: Introduction to Computer
*                                      Science I
*  @version February 8, 2018
*/
public class UserInfoDriver
{
   /**
   *  Creates two objects from the skeleton code.
   *  @param args Command Line Args (Not Used)
   */
   public static void main(String[] args)
   {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}