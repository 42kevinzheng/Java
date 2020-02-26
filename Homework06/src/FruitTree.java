/**
 * 
 * Written by Kevin Zheng
 */

import java.io.*;
import java.util.*;
public class FruitTree<T extends Comparable> {
	
	private class Node{
		private T data;
		private Node leftChild;
		private Node rightChild;
		
		public Node (T aData)
		{
			data=aData;
			leftChild = rightChild =null;
		}
	}
	private Node root;
	public FruitTree()
	{
		root=null;
	}
	public void insert(T data) // Add to tree 
	{
		if(root == null)
			root =new Node(data);
		else
			insert(root,data);
	}
	private Node insert(Node aNode, T data) // helper recursion method 
	{
		if(aNode==null)
			aNode=new Node(data);
		else if(data.compareTo(aNode.data)<0)// go left 
			aNode.leftChild=insert(aNode.leftChild,data);
		else if(data.compareTo(aNode.data)>=0) // go right
			aNode.rightChild=insert(aNode.rightChild,data);
		return aNode;
	}
	public boolean search(T data)
	{
		return search (root,data);
	}
	
	private boolean search(Node aNode, T data)
	{
		if(aNode==null)
			return false;
		if(data.compareTo(aNode.data)==0)
			return true;
		else if (data.compareTo(aNode.data)<0) // go left
		return search(aNode.leftChild,data);
		//else if (data.compareTo(aNode.data)>0)
			//return search(aNode.rightChild,data);
		else 
			return search(aNode.rightChild,data);
	}
	
	public void delete(T data) // remove from tree
	{
		root= delete(root,data);
	}
	private Node delete(Node aNode, T data) //helper recursion method 
	{
		//This is looking for the value 
		if(aNode==null) // Value is not in the tree 
			return null;
		if(data.compareTo(aNode.data)<0)// go left
			aNode.leftChild=delete(aNode.leftChild,data);
		else if(data.compareTo(aNode.data)>0)//GO Right
			aNode.rightChild=delete(aNode.rightChild,data);
		else//Found a child
		{
			if(aNode.rightChild==null) // no children or maybe a left child
				return aNode.leftChild;
			else if(aNode.leftChild==null)// We only have a right child
				return aNode.rightChild;
			else // Found two child
			{
				Node temp=aNode;
				//find min in right 
				aNode=findMinInTree(aNode.rightChild);
				//delete min from right tree 
				aNode.rightChild=deleteMinFromTree(temp.rightChild);
				//make sure left is still left
				aNode.leftChild=temp.leftChild;
			}
		}
		return aNode;
	}
	private Node findMinInTree(Node aNode) 
	{
		if(aNode == null)
			return null;
		if(aNode.leftChild==null)
			return aNode;
		else
			return aNode.leftChild;
	}
	private Node deleteMinFromTree(Node aNode)
	{
		if(aNode==null)
			return null;
		if(aNode.leftChild==null)
			return aNode.rightChild;
			aNode.leftChild=deleteMinFromTree(aNode.leftChild);
			return aNode;
	}
	public void printPreOrder()
	{
		printPreOrder(root);
	}
	private void printPreOrder(Node aNode)
	{
		if(aNode==null)
			return;
		else
			if(aNode==null)
				return;
				System.out.println(aNode.data);//process
				if(aNode.leftChild!=null)
					printPreOrder(aNode.leftChild);
				if(aNode.rightChild!=null)
					printPreOrder(aNode.rightChild);
	}
	public void printInOrder()
	{
		printInOrder(root);
	}
	private void printInOrder(Node aNode)
	{
		if(aNode==null)
			return;
		if(aNode.leftChild!=null)
			printInOrder(aNode.leftChild);
			System.out.println(aNode.data);
			if(aNode.rightChild!=null)
			printInOrder(aNode.rightChild);
	}
	
	public void printPostorder() //Print out tree 
	{
			printPostrder(root);
	}
	private void printPostrder(Node aNode) // helper recursion method 
	{
		if(aNode==null)
			return;
		else
			if(aNode.leftChild!=null)
			printPostrder(aNode.leftChild);
		if(aNode.rightChild!=null)
			printPostrder(aNode.rightChild);
			System.out.println(aNode.data);
	}
	public void toString(T aString)
	{
		System.out.println(aString);
	}
	
	
	

}
