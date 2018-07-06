import java.util.Scanner;
import java.lang.Math;
/**
 *
 * CS180 - Lab 03
 *
 * Takes an equation in the form of (-n1 + sqrt(n2 * n3 - 4 * n4 * n5))/(2*n6) and returns a value
 *
 * @author Jarrett Andrulis, jandruli@purdue.edu, Section B09
 *
 * @version 8/30/16
 *
 */
public class ExpressionEvaluation{
    public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);//To read the expression
		System.out.println(evaluate(scanner.nextLine()));	
	}
	public static double evaluate(String inputString)
	{
		int n1,n2,n3,n4,n5,n6;
		int currentChar = 1;
		n1 = Integer.parseInt(inputString.substring(currentChar,inputString.indexOf('+')));//n1 will always start at the second charcter and go until the first +
		currentChar = inputString.indexOf('+');//Increment index to not pick up previous characters
		n2 = Integer.parseInt(inputString.substring(inputString.indexOf("sqrt(")+5,inputString.indexOf('*'))); //Get n2, which is always after the sqrt( and before the first '*'
		currentChar = inputString.indexOf('*');//Increment index to not pick up previous characters
		n3 = Integer.parseInt(inputString.substring(inputString.indexOf('*',currentChar)+1,inputString.indexOf('-',currentChar))); //n3 will always be after the first '*' character and before the second '-'
		currentChar = inputString.indexOf('*',currentChar+1);//Increment index to not pick up previous characters
		n4= Integer.parseInt(inputString.substring(inputString.indexOf('*',currentChar)+1,inputString.indexOf('*',currentChar+1)));//n4 is always after the second '*' character and before the third '*'
		currentChar = inputString.indexOf('*',currentChar+1);//Increment index to not pick up previous characters
		n5 = Integer.parseInt(inputString.substring(inputString.indexOf('*',currentChar)+1,inputString.indexOf(')',currentChar))); //n5 is always after the third '*' character and before the first ')'
		n6=Integer.parseInt(inputString.substring(inputString.lastIndexOf('*')+1,inputString.lastIndexOf(')'))); //n6 is always between the last '*' and ')'
		double result = (n1 + Math.sqrt(n2*n3-4*n4*n5))/(2*n6); //Evaluate the result through the known formula

		return result;

	}
}
