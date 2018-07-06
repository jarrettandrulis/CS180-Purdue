/**
 * CS180 - Lab 05
 *
 * Equilateral Triangle class that can give area and perimeter
 *
 * @author Jarrett Andrulis, jandruli@purdue.edu, section B09
 *
 * @version 09/13/16
 */
public class Triangle {
    //private
    private double sideLength;

    //Constructor
    public Triangle(double sideLength)
    {
        this.sideLength = sideLength;
    }
    //returns the perimeter of the triangle
    public double getPerimeter()
    {
        return sideLength*3;
    }
    //returns the area of the triangle
    public double getArea()
    {
        return Math.sqrt(3)/4.0 *sideLength*sideLength;
    }

}
