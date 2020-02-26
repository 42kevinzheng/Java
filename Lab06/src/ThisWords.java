/**
 * 
 * Written by Kevin Zheng.
 */

import java.util.*;
public class ThisWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter 2 words.  I will determine if the letters of one is contained in the other");
System.out.println("Enter First word.");
String one= keyboard.nextLine();
String one1=one.toLowerCase(); // Set first string lower case
System.out.println("Enter Second Word");
String two=keyboard.nextLine();
String two2=two.toLowerCase(); //set second string to lower case
if((one.length() < two.length() || one1!=""&&two2!="") ) // Check if first string is shorter than second string.
{
	if(contain(one1,two2)) // called the recursion method.
		System.out.println("They are contained."); 
	else
		System.out.println("They are not contained"); 
}
	}	
		
public static boolean contain(String one, String two) // Take in first string and second string.
{
	if(one.charAt(one.length()-1)==two.charAt(two.length()-1)) // Check if letters in both matches 
	{	
			 return true;
	}
	if(one.charAt(one.length()-1)!=two.charAt(two.length()-1)) // Check if letters in both matches 
	{	
			 return false;
	}
	else
	{
		return contain(one,two.substring(1,two.length()-1)); // check all remaining letter of second string 
	}
}




}
