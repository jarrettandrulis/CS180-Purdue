import javax.swing.*;
/**
 *
 * CS180 - Lab 01
 *
 * Takes a string and then displays it to the string
 *
 * @author Jarrett Andrulis, jandruli@purdue.edu, Section B09
 *
 * @version 8/23/16
 *
 */

public class Copycat{
    public static void main(String[] args){
		String s = JOptionPane.showInputDialog("Trigger the Copycat");
		JOptionPane.showMessageDialog(null,s);
    }
}
