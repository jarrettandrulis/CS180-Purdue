import java.util.Scanner;
import java.util.Random;
/**
 *
 * CS180 - Lab 02
 *
 * Generates STAR information for students (STAR group and email address)
 *
 * @author Jarrett Andrulis, jandruli@purdue.edu, Section B09
 *
 * @version 8/30/16
 *
 */
public class StarGenerator{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Please enter your name:");
		String rawName = s.nextLine();
		System.out.println("Enter the college that you are in:");
		String college = s.nextLine();
		System.out.println("Your name: "+ rawName);
		String email = rawName.charAt(0)+rawName.substring(rawName.indexOf(" ")+1,rawName.length())+"@purdue.edu"; //Take first letter of first name and concatenate it with the last name and '@purdue.edu' then it converts everything to lower case
		System.out.println(email.toLowerCase());
		System.out.println("Your College: " + college);
		System.out.println("STAR group: " + college.substring(0,3).toUpperCase() + r.nextInt(4)); //Take the first three letters of the college and put them to uppercase. Then assign them a random group(0,4)



	}
}
