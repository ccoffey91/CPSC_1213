import java.text.DecimalFormat;

/**
*  Dodecahedron.java stores the values for label, color, and
*  edge. In addition, the class includes methods to set and get
*  each of these fields, as well as methods to calculate the
*  surface area, volume, and surface to volume ratio of a
*  Dodecahedron object, and a method to provide a String value
*  of a Dodecahedron object.
*
*  Project 04
*  @author Robert Goodson - CPSC 1213: Introduction to Computer
*                                      Science I
*  @version February 12, 2018
*/
public class Dodecahedron
{
   private String label = "", color = "";
   private double edge = 0;
   
   /**
   *  Constructor for the Dodecahedron class.
   *
   *  @param labelIn User input for label.
   *  @param colorIn User input for color.
   *  @param edgeIn User input for edge.
   */
   public Dodecahedron(String labelIn, String colorIn, double edgeIn)
   {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   }
   
   /**
   *  The getLabel method accepts no parameters and returns a String
   *  representing the label field.
   *
   *  @return label
   */
   public String getLabel()
   {
      return label;
   }
   
   /**
   *  The setLabel method takes a String parameter and returns a boolean.
   *  If the string parameter is not null, then the "trimmed" String is set
   *  to the label field and the method returns true. Otherwise, the method
   *  returns false and the label is not set.
   *
   *  @param labelIn User input for label.
   *  @return true If applied or false If not applied.
   */
   public boolean setLabel(String labelIn)
   {
      if (labelIn != null)
      {
         label = labelIn.trim();
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
   *  The getColor method accepts no parameters and returns a String
   *  representing the color field.
   *
   *  @return color
   */
   public String getColor()
   {
      return color;
   }
   
   /**
   *  The setColor method takes a String parameter and returns a boolean.
   *  If the string parameter is not null, then the "trimmed" String is set
   *  to the color field and the method returns true. Otherwise, the method
   *  returns false and the label is not set.
   *
   *  @param colorIn User input for color.
   *  @return true If applied or false If not applied.
   */
   public boolean setColor(String colorIn)
   {
      if (colorIn != null)
      {
         color = colorIn.trim();
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
   *  The getEdge method accepts no parameters and returns a double representing
   *  the edge field.
   *
   *  @return edge
   */
   public double getEdge()
   {
      return edge;
   }
   
   /**
   *  The setEdge method accepts a double parameter and returns a boolean as
   *  follows. If the edge is greater than zero, sets the edge field to the
   *  double passed in and returns true. Otherwise, the method returns false
   *  and the edge is not set.
   *
   *  @param edgeIn User input for edge.
   *  @return true If applied or false If not applied.
   */
   public boolean setEdge(double edgeIn)
   {
      if (edgeIn > 0)
      {
         edge = edgeIn;
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
   *  The surfaceArea method accepts no parameters and returns the double
   *  value for the total surface area calculated using the value for edge.
   *
   *  @return surfaceArea
   */
   public double surfaceArea()
   {
      double insideFunction = 0, surfaceArea = 0;
      
      insideFunction = (25 + (10 * Math.sqrt(5)));
      surfaceArea = (3 * Math.sqrt(insideFunction)) * Math.pow(edge, 2);
      return surfaceArea;
   }
   
   /**
   *  The volume method accepts no parameters and returns the double value
   *  for the volume calculated using the value for edge.
   *
   *  @return volume
   */
   public double volume()
   {
      double volume = 0;
      
      volume = ((15 + (7 * Math.sqrt(5))) / 4) * Math.pow(edge, 3);
      return volume;
   }
   
   /**
   *  The surfaceToVolumeRatio method accepts no parameters and returns the
   *  double value calculated by dividing the total surface area by the volume.
   *
   *  @return surfaceToVolumeRatio
   */
   public double surfaceToVolumeRatio()
   {
      double surfaceToVolumeRatio = 0;
      
      surfaceToVolumeRatio = (surfaceArea() / volume());
      return surfaceToVolumeRatio;
   }
   
   /**
   *  The toString method returns a String containing the information about the
   *  Dodecahedron object formatted as shown below, including decimal formatting
   *  ("#,##0.0##") for the double values. Newline and tab escape sequences
   *  should be used to achieve the proper layout. In addition to the field
   *  values (or corresponding "get" methods), the following methods should be
   *  used to compute appropriate values in the toString method: surfaceArea(),
   *  volume(), and surfaceToVolumeRatio(). Each line should have no trailing
   *  spaces (e.g., there should be no spaces before a newline (\n) character).
   *
   *  @return output
   */
   public String toString()
   {
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
      String output = "Dodecahedron \"" + label + "\" is \"" + color
                    + "\" with 30 edges of length " + edge + " units."
                    + "\n\tsurface area = " + df1.format(surfaceArea())
                    + " square units"
                    + "\n\tvolume = " + df1.format(volume())
                    + " cubic units"
                    + "\n\tsurface/volume ratio = "
                    + df1.format(surfaceToVolumeRatio());
      return output;
   }
}