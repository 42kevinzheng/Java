/**
  *  Written by Kevin Zheng 
 */
import java.io.*;
import java.util.*;
public class AEIOU_COUNTER {
	public static void main(String[] args){
		Scanner fileScanner=null;
		try 
		{
		fileScanner=new Scanner(new File("text.txt")); // read the text file.
		int aeiouCounter=0; // Keep track of how many times aeiou is in order.
			while(fileScanner.hasNextLine())
			{
				String token=fileScanner.nextLine();
			String token2=token.toLowerCase(); //Set the file to lowercase
				String token3=token2.replaceAll("\\s+",""); // get rid of all the spaces
				String token5=token3.replaceAll("[qwrtyplkjhgfdszxcvbnm!]","");// get rid of all constant and leave only the vowels
				int count=0;  // keep track of how many times "a" or "e" or "i" or "o" or "u", occurs  
			for (int x=0; x<token5.length();x++) // for loop to check each character in token 5.
				{
				if(token5.charAt(x)=='a')  
				{
					count++; //if it find "a" then will keep track.
				}
				if(token5.charAt(x)=='e')
				{
					if(count==1) //if it find "e" then will keep track and if count = 1. This is to make sure that "a" occurs before "e"
					{
					count++;
					}
					else
					{
						count=0; // if "a" does not occur before "e" count will have to reset/
					}
				}
				if(token5.charAt(x)=='i')
				{
					if(count==2)
					{
					count++;//if it find "i" then will keep track and if count = 2. This is to make sure that "a" and "e" occurs before "i"
					}
					else
					{
						count=0;
					}
				}
				if(token5.charAt(x)=='o')
				{
					if(count==3)//if it find "o" then will keep track and if count = 3. This is to make sure that "a" and "e" and "i"occurs before "o"
					{
					count++;
					}
					else
					{
						count=0;
					}
				}
				if(token5.charAt(x)=='u')
				{
					if(count==4) //if it find "u" then will keep track and if count = 4. This is to make sure that "a" and "e" and "i" and "o"occurs before "u"
					{
					count++; 
					}
					else
					{
						count=0;
					}
				}
				if(count==5) // if count ==5 it means that aeiou occur in the correct order.
				{
					aeiouCounter++; // keep track of the correct order of aeiou
					count=0; // reset the process to find other aeiou in order 
				}
			}
			}
			
			fileScanner.close(); // close the file
			
			
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream("blah.txt")); //create the text file to be printed.
			fileWriter.print(aeiouCounter); // print the result in the text file.
			fileWriter.close();
			System.out.println("The file blah.txt has AEIOU in order "+aeiouCounter+ " times" ); // print out the result.
		}
		catch(IOException e)
		{
		System.out.println(e);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}	
	}
}
