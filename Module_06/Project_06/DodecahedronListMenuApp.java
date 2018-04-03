import java.util.ArrayList;   // Required for the ArrayList
import java.io.IOException;   // Required for throws IOException
import java.util.Scanner;     // Required for the Scanner

/**
*  The DodecahedronListMenuApp.java class presents the user with a menu
*  with eight options, each of which is implemented to do the following:
*     (1) Read the input file and create a DodecahedronList object.
*     (2) Print the DodecahedronList object.
*     (3) Print the summary for the DodecahedronList object.
*     (4) Add a Dodecahedron object to the DodecahedronList object.
*     (5) Delete a Dodecahedron object from the DodecahedronList object.
*     (6) Find a Dodecahedron object in the DodecahedronList object.
*     (7) Edit a Dodecahedron object in the DodecahedronList object.
*     (8) Quit the program.
*
*  Project 06
*  @author Robert Goodson - CPSC 1213: Introduction to Computer Science I
*                           Auburn University
*
*  @version February 23, 2018
*/
public class DodecahedronListMenuApp {
   /**
   *  The main method should print a list of options with the action code
   *  and a short description followed by a line with just the action codes
   *  prompting the user to select an action. After the user enters an
   *  action code, the action is performed, including output if any. Then
   *  the line with just the action codes prompting the user to select an
   *  action is printed again to accept the next code. The first action a
   *  user would normally perform is 'R' to read in the file and create a
   *  DodecahedronList object. However, the other action codes should work
   *  even if an input file has not been processed. The user may continue
   *  to perform actions until 'Q' is entered to quit (or end) the program.
   *
   *  @param args Command Line Arguments (Not Used)
   *  @throws IOException From scanning the file and/or files.
   */
   public static void main(String[] args) throws IOException {
      String sCode = "", sFileName = "";
      String sListName = "*** no list name assigned ***";
      String sColor = "", sLabel = "";
      double dEdge = 0;
      String sLabelIn = "", sColorIn = "";
      double dEdgeIn = 0;
      
      ArrayList<Dodecahedron> myList = new ArrayList<Dodecahedron>();
      DodecahedronList myDList = new DodecahedronList(sListName, myList);
      Scanner scan = new Scanner(System.in);
      
      // Print out the menu.
      System.out.println("Dodecahedron List System Menu\n"
                       + "R - Read File and Create Dodecahedron List\n"
                       + "P - Print Dodecahedron List\n"
                       + "S - Print Summary\n"
                       + "A - Add Dodecahedron\n"
                       + "D - Delete Dodecahedron\n"
                       + "F - Find Dodecahedron\n"
                       + "E - Edit Dodecahedron\n"
                       + "Q - Quit");
      
      /*
      *  Begins the selection process for the Dodecahedron List System
      *  Menu via a do-while loop.
      */
      do {
         // Code selection
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         sCode = scan.nextLine();
         sCode = sCode.trim();
         
         if (sCode.length() == 0) {
            continue;
         }
         
         // A switch statement that processes the code selection
         char cCodeChar = sCode.charAt(0);
         switch (cCodeChar) {
            case 'R':   // Read in File and Create DodecahedronList
            case 'r':
               
               System.out.print("\tFile name: ");
               sFileName = scan.nextLine();
               
               myDList = myDList.readFile(sFileName);
               
               System.out.println("\tFile read in and Dodecahedron "
                                + "List created\n");
               break;
                                      
            case 'P':   // Print DodecahedronList
            case 'p':
               
               System.out.println(myDList);
               break;
               
            case 'S':   // Print the Summary
            case 's':
               
               System.out.println("\n" + myDList.summaryInfo()
                                + "\n");
               break;
            
            case 'A':   // Add Dodecahedron Object
            case 'a':
               
               System.out.print("\tLabel: ");
               sLabel = scan.nextLine();
               System.out.print("\tColor: ");
               sColor = scan.nextLine();
               System.out.print("\tEdge: ");
               dEdge = Double.parseDouble(scan.nextLine());
               
               myDList.addDodecahedron(sLabel, sColor, dEdge);
               System.out.println("\t*** Dodecahedron added ***\n");
               break;
               
            case 'D':   // Delete Dodecahedron Object
            case 'd':
               
               System.out.print("\tLabel: ");
               sLabelIn = scan.nextLine();
               
               if (myDList.deleteDodecahedron(sLabelIn) == null) {
                  System.out.println("\t\"" + sLabelIn + "\" not found\n");
               }
               else {
                  System.out.println("\t\"" + sLabelIn + "\" deleted\n");
               }
               break;
            
            case 'F':   // Find Dodecahedron Object
            case 'f':
               
               System.out.print("\tLabel: ");
               sLabelIn = scan.nextLine();
               
               if (myDList.findDodecahedron(sLabelIn) == null) {
                  System.out.println("\t\"" + sLabelIn + "\" not found\n");
               }
               else {
                  System.out.println(myDList.findDodecahedron(sLabelIn)
                                    .toString() + "\n");
               }
               break;
            
            case 'E':   // Edit Dodecahedron Object
            case 'e':
               
               System.out.print("\tLabel: ");
               sLabelIn = scan.nextLine();
               System.out.print("\tColor: ");
               sColorIn = scan.nextLine();
               System.out.print("\tEdge: ");
               dEdgeIn = Double.parseDouble(scan.nextLine());
               
               if (myDList.findDodecahedron(sLabelIn) == null) {
                  System.out.println("\t\"" + sLabelIn + "\" not found\n");
               }
               else {
                  myDList.editDodecahedron(sLabelIn, sColorIn, dEdgeIn);
                  System.out.println("\t\"" + sLabelIn
                                   + "\" successfully edited\n");
               }
               break;
            
            case 'Q':   // Quit
            case 'q':
               
               break;
               
            default:    // No match, loop again
               
               System.out.println("\t*** invalid code ***\n");
               break;
         }  
      } while (!sCode.equalsIgnoreCase("Q"));                    
   }
}