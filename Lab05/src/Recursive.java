/**
 * Written by Kevin Zheng
 * 
 */
import java.util.Scanner;
class Recursive
{
	 public static void main(String[]args)
	    {
	        Scanner keyboard = new Scanner(System.in);
	        System.out.println("Enter a word and I will determine if it is a palindrome:");
	        String token = keyboard.nextLine();
	    	String token2 =token.toLowerCase(); // set to lowerCase 
	    	String token3 =token2.trim(); // Removes leading and trailing white spaces.
	    	String token4 =token3.replaceAll(" ", ""); // Replace all spaces with nothing.
	        if(word(token4)) //Used the recursion method 
	            System.out.println("The word "+"\""+token+"\"" + " is a palindrome");
	        else
	            System.out.println("The word "+"\""+token+"\"" + " is not a palindrome");
	    }
	    public static boolean word(String user)
	    {   
	        if(user.length()<2||user==null) // Check if string is less than 2  or if it is null, then nothing to return.
	        {
	            return true;
	        }
	        if(user.charAt(0) == user.charAt(user.length()-1)) // Check if the first and last letters matches.
	        {
	        return word(user.substring(1, user.length()-1)); // calling on itself to reduce letters until string is less than 2
	        }   
	        else
	        {
	        return false; // a boolean method has to return false for something.
	        }
	    }
}