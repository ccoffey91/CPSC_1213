import java.util.ArrayList;
import java.text.DecimalFormat;

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
*  Project 05
*  @author Robert Goodson - CPSC 1213: Introduction to Computer
*                                      Science I
*  @version February 17, 2018
*/
public class DodecahedronList
{
   private String listName = "";
   private ArrayList<Dodecahedron> dList;
   
   /**
   *  Constructor for the DodecahedronList class.
   *
   *  @param listNameIn User input for the name of the list.
   *  @param dListIn Represents the list of Dodecahedron objects.
   */
   public DodecahedronList(String listNameIn, ArrayList<Dodecahedron> dListIn)
   {
      listName = listNameIn;
      dList = dListIn;
   }
   
   /**
   *  The getName method returns a String representing the name of the list.
   *
   *  @return listName User input for the name of the list.
   */
   public String getName()
   {
      return listName;
   }
   
   /**
   *  The numberOfDodeCahedrons method returns an int representing the number of
   *  Dodecahedron objects in the DodecahedronList. If there are zero
   *  Dodecahedron objects in the list, zero should be returned.
   *
   *  @return dList.size() The number of Dodecahedrons.
   */
   public int numberOfDodecahedrons()
   {
      if (dList.size() != 0)
      {
         return dList.size();
      }
      else
      {
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
   public double totalSurfaceArea()
   {
      double totalSurfaceArea = 0;
      
      if (dList.size() != 0)
      {
         int index = 0;
         while (index < dList.size())
         {
            totalSurfaceArea += dList.get(index).surfaceArea();
            index++;
         }
      }
      else
      {
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
   public double totalVolume()
   {
      double totalVolume = 0;
      
      if (dList.size() != 0)
      {
         int index = 0;
         while (index < dList.size())
         {
            totalVolume += dList.get(index).volume();
            index++;
         }
      }
      else
      {
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
   public double averageSurfaceArea()
   {
      double averageSurfaceArea = 0;
      
      if (dList.size() == 0)
      {
         return 0;
      }
      
      // Calculate the average surface area.
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
   public double averageVolume()
   {
      double averageVolume = 0;
      
      if (dList.size() == 0)
      {
         return 0;
      }
      // Calculate the average volume.
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
   public double averageSurfaceToVolumeRatio()
   {
      double averageSurfaceToVolumeRatio = 0;
      double tSurfaceToVolumeRatio = 0;
      int index = 0;
      
      while (index < dList.size())
      {
         tSurfaceToVolumeRatio += dList.get(index).surfaceToVolumeRatio();
         index++;
      }
      
      if (dList.size() != 0)
      {
         averageSurfaceToVolumeRatio = tSurfaceToVolumeRatio / dList.size();   
      }
      else
      {
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
   public String toString()
   {
      String result = listName + "\n";
      int index = 0;
      while (index < dList.size())
      {
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
   public String summaryInfo()
   {
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
}