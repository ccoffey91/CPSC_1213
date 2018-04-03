import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
*  DodecahedronListApp.java reads in the name of the data file entered
*  by the user and then reads list name and Dodecahedron data from
*  the file, creates Dodecahedron objects, stores them in a local
*  ArrayList of Dodecahedron objects, creates a DodecahedronList
*  object with the name of the list and the ArrayList of
*  Dodecahedron objects, and then prints the DodecahedronList object
*  followed by summary information about the DodecahedronList object.
*
*  Project 05
*  @author Robert Goodson - CPSC 1213: Introduction to Computer
*                                      Science I
*  @version February 18, 2018
*/
public class DodecahedronListApp
{
   /**
   *  The main method should prompt the user to enter a file name,
   *  then it should read in the data file, create the appropriate
   *  information, and print out the applicable data.
   *
   *  @param args Command Line Arguments (Not Used)
   *  @throws FileNotFoundException From scanning the file.
   */
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<Dodecahedron> newList = new ArrayList<Dodecahedron>();
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      System.out.print("\n");
      
      Scanner scanFile = new Scanner(new File(fileName));
      
      String dListName = scanFile.nextLine();
      
      while (scanFile.hasNext())
      {
         String labelInput = scanFile.nextLine();
         String colorInput = scanFile.nextLine();
         double edgeInput = Double.parseDouble(scanFile.nextLine());
         
         Dodecahedron d = new Dodecahedron(labelInput, colorInput, edgeInput);
         newList.add(d);
      }
      scanFile.close();
      
      DodecahedronList newDList = new DodecahedronList(dListName, newList);
      
      System.out.println(newDList);
      
      System.out.println(newDList.summaryInfo());
   }
}