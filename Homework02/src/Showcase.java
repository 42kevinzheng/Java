import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class Showcase extends Prize{
	public static final String DELIM="\t";
	private Prize[]prizes; // create the prize array
	public static final int PRIZE_SIZE=50; // The size of the array.
	public Showcase()
	{
		prizes =new Prize[PRIZE_SIZE]; // default constructor 
	}
	public Showcase(int aInt)
	{
		prizes=new Prize[aInt]; // Parameterize constructor
	}
	public static Prize[] readFromText (String fileName)
	{
		Prize[] prizes = new Prize[PRIZE_SIZE]; // Create the size of the array.
		if(fileName == null)  
		{
			return null; // If File is null, return null
		}
		try
		{
		Scanner fileScanner=new Scanner(new File(fileName)); // read the file 
		fileScanner.nextLine();
		int token =0; // keep track of the index of the file 
		while(fileScanner.hasNextLine())
		{
			String fileLine=fileScanner.nextLine();
			String[] splitLine=fileLine.split(DELIM); // split the file using tabs 
			if(splitLine.length==2) // Check if the lines are formitted correctly 
			{
			String prizeName=splitLine[0]; // Separate the name of the prize 
			double prizePrice= Double.parseDouble(splitLine[1]); // Separate the price of the prize 
			prizes[token] = new Prize(prizeName,prizePrice); // print the prize 
			token++; //increase the index
			}
			else 
			{
				System.out.println("File Not Formitted Correctly."); // the format is not correct
			}
		}	
		fileScanner.close(); //closes the Scanner
		}
		catch(IOException e) 
		{
			System.out.println(e); // Check for I/O exception and print it out 
		}
		catch(Exception e)
		{
			System.out.println(e); // print out the exception 
		}
		return prizes;
	}
	
	
	  public static int randomFill(){

		    Random rand = new Random();
		    int randomNum = rand.nextInt(PRIZE_SIZE);// Pick a random prize from the prizeList.
		    return randomNum;
		    }
	  
	  public static Prize[] randomP(Prize[] game)
	  {
		  Prize[] ok =new Prize[5];
		  for(int i=0; i<ok.length;i++)
		  {
			  ok[i]=game[randomFill()]; //Fill the array with random prizes that are picked from randomFill
		  }
		  return ok;
	  }
	

}
