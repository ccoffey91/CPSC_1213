import java.util.Scanner;  // Required for the Scanner object.

/**
*  DodecahedronApp.java reads in values for label, color, and
*  edge. After the values have been read in, main creates a
*  Dodecahedron object and then prints a new line and the
*  object.
*
*  Project 04
*  @author Robert Goodson - CPSC 1213: Introduction to Computer
*                                      Science I
*  @version February 11, 2018 
*/
public class DodecahedronApp
{
   // Utilized with the decision structure for input validation.
   private static final double EDGE_FLOOR = 0;
   
   /**
   *  Reads in values for label, color, and edge. After the values
   *  have been read in, main creates a Dodecahedron object and
   *  then prints a new line and the object.
   *
   *  @param args Command Line Args (Not Used)
   */
   public static void main(String[] args)
   {
      // Variable declaration for the main method.
      String labelIn = "", colorIn = "", edgeInput = "";
      
      /*
      *  Scanner object for reading the user's input from the
      *  keyboard.
      */
      Scanner keyboard = new Scanner(System.in);
      
      /* 
      *  Prompts the user for the label, color, and edge length
      *  of a dodecahedron.
      */
      System.out.println("Enter label, color, and edge length for "
                       + "a dodecahedron.");
                       
      System.out.print("\tlabel: " + labelIn);
      labelIn = keyboard.nextLine();
      
      System.out.print("\tcolor: " + colorIn);
      colorIn = keyboard.nextLine();
      
      System.out.print("\tedge: " + edgeInput);
      edgeInput = keyboard.nextLine();
      double edgeIn = Double.parseDouble(edgeInput);
      
      /*
      *  A decision structure that acts as a form of input
      *  validation. If the edge length is less than or
      *  equal to 0 then an error message occurs. Otherwise,
      *  a new, Dodecahedron object is created, and the
      *  appropriate information is outputted onto the screen.
      */
      if (edgeIn <= EDGE_FLOOR)
      {
         System.out.print("Error: edge must be greater than 0.");
      }
      else
      {
         Dodecahedron obj = new Dodecahedron(labelIn, colorIn, edgeIn);
         System.out.println("\n" + obj);
      }
   }
}