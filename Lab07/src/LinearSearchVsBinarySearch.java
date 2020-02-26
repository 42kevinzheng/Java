/**
 * 
 * Written by Kevin Zheng 
 * 
 */
import java.util.*;
public class LinearSearchVsBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the search tester. We're going to see which algorithm performs the best out of 20 tests");
		Random r= new Random ();
		int binaryCount=0; // Keep track of the binary
		int linearCount=0; // Keep track of the linear 
		for(int i=0; i<=20;i++)
		{
			int[] a= createNewArray(); // Print 
			int ram= r.nextInt(1000); // Fill the linear and binary with random value.
			int linear=linearSearchRecursion(a,ram,0,0);  
			linearCount+=linear; // linear ++ 
			int binary=binarySearchReaper(a,ram,0,a.length-1,0);
			binaryCount+=binary;// binary ++
			System.out.println(); 
			System.out.println("Searching linear search");
			if(linear<999) // check if value is found in linear search 
			{
				System.out.println("Found!"); 
			}
			else
			{
				System.out.println("Not Found");
			}
			System.out.println("Searching binary search");
			if(binary<10) // Check if value is found in binary search 
			{
				System.out.println("Found!");
			}
			else
			{
				System.out.println("Not Found");
			}
			System.out.println("Linear Search " + linear); // Count out total search it takes to find value 
			System.out.println("Binary Search " +binary ); // Count out total search it takes to find value
		}
		
		int bAverage=binaryCount/20; // Find average of binary 
		int lAverage=linearCount/20; // Fine average of linear 
		System.out.println();
		System.out.println("The average number of checks for 20 were:");
		System.out.println("Linear Search " +lAverage); // Print out the linear average 
		System.out.println("Binary Search "+bAverage); // print out the binary average.
		
	}
	
	public static int linearSearchRecursion(int[] a, int value, int index,int l)
	{
		if(a[index]==value)
		{
			return l;
		}
		else
		{
				index++;
			if(index>=a.length)
				return l;
			else
				l++;
				return linearSearchRecursion(a,value,index,l);
		}
	}
	public static int binarySearchReaper(int[] a, int value, int minIndex, int maxIndex, int l)
	{
		int midIndex= (maxIndex+minIndex)/2;
		if(minIndex > maxIndex)//value not fond
			{
			return l;
			}
		if(a[ midIndex] == value)
			{
			return l;
			}
			else{
				if(value > a[midIndex])
				{
					l++;
					return binarySearchReaper(a,value,midIndex+1,maxIndex,l);
					
				}
				else
				{
					l++;
					return binarySearchReaper(a,value,minIndex,midIndex-1,l);
				}
			}
	}
	private static void merge(int[] left, int[] right, int[] a) 
	{
		int leftSize=left.length;
		int rightSize=right.length;
		int i,j,k;
		i=j=k=0;
		while(i<leftSize && j<rightSize)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i++;
				k++;
			}
			else 
			{
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<leftSize)  
		{
			a[k]= left[i];
			i++;
			k++;
		}
		while(j<rightSize) 
		{
			a[k]=right[j];
			j++;
			k++;
		}
	}
	
	public static void mergeSort(int[] a)// Divide and Concord.
	{
		int size= a.length;
		if(size<2)
		{
			return;
		}
		int mid =size/2;
		int leftSize=mid;
		int rightSize=size-mid;
		int[] left = new int[leftSize];
		int[] right =new int[rightSize];
		for(int i=0;i<mid;i++)
			left[i]=a[i];
		for (int i=mid;i<size;i++)
			right[i-mid]=a[i];
			mergeSort(left);
			mergeSort(right);
		merge(left,right,a);
	}
	
	public static int[] createNewArray() // 
	{
		Random r= new Random();
		int [] a = new int[1000];
		for (int i=0; i<a.length;i++)
		{
		a[i]=r.nextInt(1000); // Fill each element with a random number. 
		}
		mergeSort(a); 
		return a;
	}
	
	
	

}
