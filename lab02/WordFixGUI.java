import javax.swing.*;
/**
 *
 * CS180 - Lab 02
 *
 * Takes a scrambled string and decodes it
 *
 * @author Jarrett Andrulis, jandruli@purdue.edu, Section B09
 *
 * @version 8/30/16
 *
 */
class WordFixGUI
{
	public static void main(String[] args)
	{
		String scrambledString = JOptionPane.showInputDialog(null, "Enter the word to be deciphered");
	try{ //Swap the first and the last letters and the substrings before and after the '*' character
			String finalString = scrambledString.charAt(scrambledString.length()-1)+scrambledString.substring(scrambledString.indexOf("*")+1,scrambledString.length()-1)+scrambledString.substring(1, scrambledString.indexOf("*"))+scrambledString.charAt(0);
			JOptionPane.showMessageDialog(null, finalString);
	}
	catch(Exception e) //if the string is too short or does not contain an *
	{
			JOptionPane.showMessageDialog(null, "You entered an invalid string");
	}

	}
}
