
/**
 * Implement a circle
 * 
 * @author Mr. Jaffe 
 * @version 2017-07-14
 */
public class heptadecagon implements Shape
{
  private double sideLength;
  private String color;

  /**
   * Constructor for objects of class Circle
   */
  public heptadecagon(int sideLength, String color)
  {
    this.sideLength = sideLength;
    this.color = color;
  }

  /**
   * Get the area
   * 
   * @return     returns the area of the circle
   */
  @Override
  public double getArea()
  {
    return ((1.0/4) * 17 *Math.pow(sideLength, 2) * (1.0 / Math.tan(Math.PI / 17)));
  }

  /**
   * Get the perimeter
   * 
   * @return     returns the perimeter of the circle
   */
  public double getPerimeter()
  {
    return 17 * sideLength;
  }

  /**
   * Get the color
   * 
   * @return     returns the color of the circle
   */
  public String getColor()
  {
    return this.color;
  }
}
