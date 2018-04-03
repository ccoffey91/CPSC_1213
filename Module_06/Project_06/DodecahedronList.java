import java.util.ArrayList;      // Required for the ArrayList
import java.text.DecimalFormat;  // Required for DecimalFormat
import java.io.File;             // Required for File
import java.io.IOException;      // Required for IOException
import java.util.Scanner;        // Required for the Scanner

/**
*  The DodecahedronList.java class stores the name of the list and an
*  ArrayList of Dodecahedron objects. It also includes methods that return
*  the name of the list, number of Dodecahedron objects in the
*  DodecahedronList, total surface area, total volume, average surface
*  area, average volume, and average surface to volume ratio for all
*  Dodecahedron objects in the DodecahedronList. The toString method returns
*  a String containing the name of the list followed by each Dodecahedron
*  in the ArrayList, and a summaryInfo method returns summary information
*  about the list.
*
*  Project 06
*  @author Robert Goodson - CPSC 1213: Introduction to Computer Science I
*                           Auburn University
*
*  @version February 23, 2018
*/
public class DodecahedronList {
   private String listName = "";
   private ArrayList<Dodecahedron> dList;
   
   /**
   *  Constructor for the DodecahedronList class.
   *
   *  @param listNameIn User input for the name of the list.
   *  @param dListIn Represents the list of Dodecahedron objects.
   */
   public DodecahedronList(String listNameIn, ArrayList<Dodecahedron> dListIn) {
      listName = listNameIn;
      dList = dListIn;
   }
   
   /**
   *  The getName method returns a String representing the name of the list.
   *
   *  @return listName User input for the name of the list.
   */
   public String getName() {
      return listName;
   }
   
   /**
   *  The numberOfDodeCahedrons method returns an int representing the number of
   *  Dodecahedron objects in the DodecahedronList. If there are zero
   *  Dodecahedron objects in the list, zero should be returned.
   *
   *  @return dList.size() The number of Dodecahedrons.
   */
   public int numberOfDodecahedrons() {
      if (dList.size() != 0) {
         return dList.size();
      }
      else {
         return 0;
      }
   }
   
   /**
   *  The totalSurfaceArea method returns a double representing the total
   *  surface areas for all Dodecahedron objects in the list. If there
   *  are zero Dodecahedron objects in the list, zero should be returned.
   *
   *  @return totalSurfaceArea The tota surface area for the Dodecahedrons.
   */
   public double totalSurfaceArea() {
      double totalSurfaceArea = 0;
      
      if (dList.size() != 0) {
         int index = 0;
         while (index < dList.size()) {
            totalSurfaceArea += dList.get(index).surfaceArea();
            index++;
         }
      }
      else {
         return 0;
      }
      return totalSurfaceArea;
   }
   
   /**
   *  The totalVolume method returns a double representing the total volumes
   *  for all Dodecahedron objects in the list. If there are zero Dodecahedron
   *  objects in the list, zero should be returned.
   *
   *  @return totalVolume The total volume for the Dodecahedrons.
   */
   public double totalVolume() {
      double totalVolume = 0;
      
      if (dList.size() != 0) {
         int index = 0;
         while (index < dList.size()) {
            totalVolume += dList.get(index).volume();
            index++;
         }
      }
      else {
         return 0;
      }
      return totalVolume;
   }
   
   /**
   *  The averageSurfaceArea method returns a double representing the average
   *  surface area for all Dodecahedron objects in the list. If there are zero
   *  Dodecahedron objects in the list, zero should be returned.
   *
   *  @return averageSurfaceArea The average surface area of the Dodecahedrons.
   */
   public double averageSurfaceArea() {
      double averageSurfaceArea = 0;
      
      if (dList.size() == 0) {
         return 0;
      }
      averageSurfaceArea = totalSurfaceArea() / dList.size();
      return averageSurfaceArea;
   }
   
   /**
   *  The averageVolume method returns a double representing the average volume
   *  for all Dodecahedron objects in the list. If there are zero Dodecahedron
   *  objects in the list, zero should be returned.
   *
   *  @return averageVolume The average volume of the Dodecahedrons.
   */
   public double averageVolume() {
      double averageVolume = 0;
      
      if (dList.size() == 0) {
         return 0;
      }
      averageVolume = totalVolume() / dList.size();
      return averageVolume;
   }
   
   /**
   *  The averageSurfaceToVolumeRatio method returns a double representing the
   *  average surface to volume ratio for all Dodecahedron objects in the list.
   *  If there are zero Dodecahedron objects in the list, zero should be
   *  returned.
   *
   *  @return averageSurfaceToVolumeRatio The average surface to volume ratio.
   */
   public double averageSurfaceToVolumeRatio() {
      double averageSurfaceToVolumeRatio = 0;
      double tSurfaceToVolumeRatio = 0;
      int index = 0;
      
      while (index < dList.size()) {
         tSurfaceToVolumeRatio += dList.get(index).surfaceToVolumeRatio();
         index++;
      }
      
      if (dList.size() != 0) {
         averageSurfaceToVolumeRatio = tSurfaceToVolumeRatio / dList.size();   
      }
      else {
         return 0;
      }
      return averageSurfaceToVolumeRatio;
   }
   
   /**
   *  The toString method returns a String (does not begin with \n) containing
   *  the name of the list followed by each Dodecahedron in the ArrayList. In
   *  the process of creating the return result, this toString() method should
   *  include a while loop that calls the toString() method for each
   *  Dodecahedron object in the list (adding a \n before and after each). Be
   *  sure to include appropriate newline escape sequences.
   *
   *  @return result The String result of our Dodecahedron ArrayList.
   */
   public String toString() {
      String result = listName + "\n";
      
      int index = 0;
      while (index < dList.size()) {
         result += "\n" + dList.get(index) + "\n";
         index++;
      }
      return result;
   }
   
   /**
   *  The summaryInfo method returns a String (does not begin with \n)
   *  containing the name of the list (which can change depending of
   *  the value read from the file) followed by various summary
   *  items: number of Dodecahedrons, total surface area, total volume,
   *  average surface area, average volume, and average surface to
   *  volume ratio. Use "#,##0.0##" as the pattern to format the double
   *  values.
   *
   *  @return result The summary information of our Dodecahedron ArrayList.
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      String result = "----- Summary for " + getName()
                    + " -----"
                    + "\nNumber of Dodecahedrons: "
                    + df.format(numberOfDodecahedrons())
                    + "\nTotal Surface Area: "
                    + df.format(totalSurfaceArea())
                    + "\nTotal Volume: "
                    + df.format(totalVolume())
                    + "\nAverage Surface Area: "
                    + df.format(averageSurfaceArea())
                    + "\nAverage Volume: "
                    + df.format(averageVolume())
                    + "\nAverage Surface/Volume Ratio: "
                    + df.format(averageSurfaceToVolumeRatio());
      
      return result;
   }
   
   /*
   *  *******************************************
   *   ********   Project 06 Methods   *********
   *  *******************************************
   */
   
   /**
   *  The getList method returns the ArrayList of Dodecahedron objects.
   *
   *  @return dList
   */
   public ArrayList<Dodecahedron> getList() {
      return dList;
   }
   
   /**
   *  The readFile method takes a String parameter representing the file name,
   *  reads in the file, storing the list name and creating an ArrayList of
   *  Dodecahedron objects, uses the list name and the ArrayList to create a
   *  DodecahedronList object, and then returns the DodecahedronList object.
   *
   *  @param sFileNameIn Required for the filename to read.
   *  @return dL DodecahedronList
   *  @throws IOException If the file cannot be opened.
   */
   public DodecahedronList readFile(String sFileNameIn) throws IOException {
      Scanner scanFile = new Scanner(new File(sFileNameIn));
      ArrayList<Dodecahedron> myNewList = new ArrayList<Dodecahedron>();
      String dListName = "";
      
      listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         double edge = Double.parseDouble(scanFile.nextLine());
         
         Dodecahedron d = new Dodecahedron(label, color, edge);
         myNewList.add(d);
      }
      DodecahedronList dL = new DodecahedronList(listName, myNewList);
      return dL;
   }
   
   /**
   *  The addDodecahedron method returns nothing but takes three parameters
   *  (label, color, and edge), creates a new Dodecahedron object, and adds it
   *  to the DodecahedronList object.
   *
   *  @param sLabelIn For Label Input
   *  @param sColorIn For Color Input
   *  @param dEdgeIn For Edge Input
   */
   public void addDodecahedron(String sLabelIn,
                               String sColorIn, double dEdgeIn) {
      Dodecahedron d = new Dodecahedron(sLabelIn, sColorIn, dEdgeIn);
      dList.add(d);
   }
   
   /**
   *  The findDodecahedron method takes a label of a Dodecahedron as the String
   *  parameter and returns the corresponding Dodecahedron object if found in
   *  the DodecahedronList object; otherwise returns null.
   *
   *  @param sLabelIn For Label Input 
   *  @return result Returns the corresponding Dodecahedron object; otherwise,
   *                 it returns a null value.
   */
   public Dodecahedron findDodecahedron(String sLabelIn) {
      Dodecahedron result = null;
      
      for (int i = 0; i < dList.size(); i++) {
         if (dList.get(i).getLabel().equalsIgnoreCase(sLabelIn)) {
            result = dList.get(i);
            break;
         }
      }
      return result;
   }
   
   /**
   *  The deleteDodecahedron method takes a String as a parameter that
   *  represents the label of the Dodecahedron and returns the
   *  Dodecahedron if it is found in the DodecahedronList object and
   *  deleted; otherwise returns null.
   *
   *  @param sLabelIn For Label Input
   *  @return Returns the Dodecahedron if it is found in the
   *          DodecahedronList object and deleted; otherwise,
   *          returns null.
   */
   public Dodecahedron deleteDodecahedron(String sLabelIn) {
      Dodecahedron result = findDodecahedron(sLabelIn);
      
      if (result != null) {
         dList.remove(result);
      }
      return result;
   }
   
   /**
   *  The editDodecahedron method takes three parameters (label, color,
   *  and edge), uses the label to find the corresponding Dodecahedron
   *  object. If found, sets the color and edge to the values passed in
   *  as parameters, and returns true. If not found, returns false.
   *
   *  @param sLIn For Label Input
   *  @param sCIn For Color Input
   *  @param dEIn For Edge Input
   *  @return true Returns true; otherwise, it returns false.
   */
   public boolean editDodecahedron(String sLIn, String sCIn, double dEIn) {
      Dodecahedron result = null;
      
      for (int i = 0; i < dList.size(); i++) {
         if (dList.get(i).getLabel().equalsIgnoreCase(sLIn)) {
            result = dList.get(i);
            dList.get(i).setColor(sCIn);
            dList.get(i).setEdge(dEIn);
            return true;
         }
      }
      return false;
   }
}