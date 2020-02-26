/**
 * 
 * Written by Kevin Zheng
 */

import java.io.*;
import java.util.Scanner;

public class FruitTreeHelper {
	static final String DELIM = "\t";
	private String name;
	private double weight;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = reFruit("fruitFile.txt");
		String b= reWeight("fruitFile.txt");
	}
	public FruitTreeHelper()
	{
		weight = 0.0;
		name = "fruit";
	}
	public FruitTreeHelper(String aName, double aWeight)
	{
		weight = aWeight;
		name = aName;
	}
	public String getName()
	{
		return name;
	}
	public void setName (String aName)
	{
		name=aName;
	}
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double aWeight)
	{
		weight=aWeight;
	}
	public boolean equals (FruitTreeHelper aFruit)
	{
		if(this.name.equals(aFruit.getName()) && this.weight==aFruit.getWeight())
		{
		  return true;
		}
		else
		{
			return false;
		}	
	}
	
	public String toString()
	{
		return name+" " +weight;
	}
	
	public static String readFile(String fileName) // prints the weight and fruit 
	{
		try
		{	
			Scanner fileScanner=new Scanner(new File(fileName));
			String original="";
			fileScanner.nextLine();
			while(fileScanner.hasNext())
			{		
				String fileLine=fileScanner.nextLine();
				String[] splitLine=fileLine.split(DELIM);
					String fruit= splitLine[0];
					double weight=Double.parseDouble(splitLine[1]);
					original= new String (original + fileLine+"\r\n");
			}
			fileScanner.close();
			return original;
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("File Not Found");
		}
		catch(Exception e)
		{
			
		}
		return fileName;
	}
	public static String reFruit(String fileName) //prints the fruit and not the weight.
	{
		try
		{	
			Scanner fileScanner=new Scanner(new File(fileName));
			String original="";
			fileScanner.nextLine();
			while(fileScanner.hasNext())
			{		
				String fileLine=fileScanner.nextLine();
				String[] splitLine=fileLine.split(DELIM);
					String fruit= splitLine[0];
					original= new String (original + splitLine[0]+"\r\n");
			}
			fileScanner.close();
			System.out.println(original);
			return original;
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("File Not Found");
		}
		return fileName;
	}
	
	public static String reWeight(String fileName) // Prints just the weight 
	{
		try
		{	
			Scanner fileScanner=new Scanner(new File(fileName));
			String original="";
			fileScanner.nextLine();
			while(fileScanner.hasNext())
			{		
				String fileLine=fileScanner.nextLine();
				String[] splitLine=fileLine.split(DELIM);
					double weight=Double.parseDouble(splitLine[1]);
					original= new String (original + splitLine[1]+"\r\n");
			}
			fileScanner.close();
			System.out.println(original);
			return original;
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("File Not Found");
		}
		
		return fileName;
	}
	

}
