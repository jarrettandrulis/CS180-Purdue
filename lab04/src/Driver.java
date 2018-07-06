import java.util.Scanner;
/**
 * CS180 - Lab 05
 *
 * Driver class , used to check to see if the other classes are working
 *
 * @author Jarrett Andrulis, jandruli@purdue.edu, section B09
 *
 * @version 09/13/16
 */
public class Driver {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        Circle c = new Circle(scanner.nextDouble());
        System.out.println("What is the length of one side of the triangle?");
        Triangle t = new Triangle(scanner.nextDouble());
        System.out.println("What is the length of the rectangle?");
        double len = scanner.nextDouble();
        System.out.println("What is the width of the rectangle?");
        Rectangle r = new Rectangle(len,scanner.nextDouble());

        System.out.println("The circumference of the circle is: " + c.getCircumference());
        System.out.println("The area of the circle is: " + c.getArea());
        System.out.println("The perimeter of the triangle is: " + t.getPerimeter());
        System.out.println("The area of the triangle is: " + t.getArea());
        System.out.println("The perimeter of the rectangle is: "+r.getPerimeter());
        System.out.println("The area of the rectangle is:" + r.getArea());
    }
}
