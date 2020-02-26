
public class IntBSTree <T extends Comparable>{

	private class Node{ //Internal Class
		
		private T data;
		private Node leftChild; // Find lower values
		private Node rightChild; // Find higher values
		public Node (T aData)
		{
			data=aData;
			leftChild = rightChild =null;
		}
	}
	
	private Node root; // Head of the tree 
	public IntBSTree()
	{
		root =null;
	}
	public void insert( T data) // Add to tree 
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
		if(aNode==null)
			return null;
		if(data.compareTo(aNode.data)<0)// go left
			aNode.leftChild=delete(aNode.leftChild,data);
		else if(data.compareTo(aNode.data)>0)//GO Right
			aNode.rightChild=delete(aNode.rightChild,data);
		else//Found a child
		{
			if(aNode.rightChild==null)
				return aNode.leftChild;
			else if(aNode.leftChild==null)
				return aNode.rightChild;
			else // Found two child
			{
				Node temp=aNode;
				aNode=findMinInTree(aNode.rightChild);
				aNode.rightChild=deleteMinFromTree(temp.rightChild);
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
	
	public void printPreorder() //Print out tree 
	{
			printPreOrder(root);
	}
	private void printPreOrder(Node aNode) // helper recursion method 
	{
		if(aNode==null)
			return;
			System.out.println(aNode.data);//process
			if(aNode.leftChild!=null)
				printPreOrder(aNode.leftChild);
			if(aNode.rightChild!=null)
				printPreOrder(aNode.rightChild);
	}
	public void getDepth(T data) // get depth
	{
		returnDepth(root,data,0);
	}
	
	private void returnDepth(Node aNode, T data, int getDepth)
	{		
		if(aNode==null) // The value does not exsit in the tree
		{
			System.out.println(-1);
		}
		else if(data.compareTo(aNode.data)==0) // The value is found 
		{
			System.out.println("The depth of "+data + " is "+getDepth);
		}
		else if(data.compareTo(aNode.data)<0)// go left
		{
			returnDepth(aNode.leftChild,data,getDepth+1);
		}
		else if(data.compareTo(aNode.data)>0)//Go Right
		{
			returnDepth(aNode.rightChild,data,(getDepth+1));
		}
		
	}
	
}
