/**
 * CS180 - Lab 05
 *
 * Circle class that can give area and circumference
 *
 * @author Jarrett Andrulis, jandruli@purdue.edu, section B09
 *
 * @version 09/13/16
 */
public class Circle {
    //private
    private double radius;

    //Constructor
    public Circle(double radius)
    {
        this.radius = radius;
    }
    //returns the circumference of the circle
    public double getCircumference()
    {
        return radius*2*Math.PI;
    }
    //returns the area of the circle
    public double getArea()
    {
        return radius*radius*Math.PI;
    }
}
