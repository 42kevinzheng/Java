/**
 * 
 * Written by Kevin Zheng.
 */
import java.io.*;
import java.util.*;

public class Hw4 <T>{
	
	private class ListNode
	{
		private T data;
		private ListNode link;
		public ListNode(T aData, ListNode aLink)
		{
			data= aData;
			link=aLink;
		}
	}
	private Integer stackSize;
	private ListNode head;
	public Hw4()
	{
		stackSize=0;
		head=null;
	}
	
	public void push (Object data)
	{
		ListNode newNode=new ListNode((T)data,head);// populate the new ListNode and set it to head
		head=newNode; //Size ++
		stackSize++;
	}
	public T pop() // 
	{
		if(head==null)  //Empty stack 
			return null;
		T retVal= head.data;
		head=head.link;
		return retVal; //Size --
	}
	public T peek() // get value at head 
	{
		if(head==null)
			return null;
		else 
			return head.data; 
	}
	public void print()
	{
		ListNode temp=head; 
		while(temp!=null) // check for empty list
		{
			System.out.println(temp.data); // print out result
			temp=temp.link; // same as i++
		}
		
	}
	public int getStackSize() //get the size of the stack currently
	{
		return stackSize;
	}
	
	
	}
	
