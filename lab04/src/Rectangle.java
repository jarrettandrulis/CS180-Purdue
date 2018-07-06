/**
 * CS180 - Lab 05
 *
 * Rectangle class that can give area and perimeter
 *
 * @author Jarrett Andrulis, jandruli@purdue.edu, section B09
 *
 * @version 09/13/16
 */
public class Rectangle {
    //private
    private double length;
    private double width;

    //Constructor
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    //Returns the perimeter of the rectangle
    public double getPerimeter()
    {
        return 2*length + 2*width;
    }
    //returns the area of the rectangle
    public double getArea()
    {
        return length*width;
    }
}
