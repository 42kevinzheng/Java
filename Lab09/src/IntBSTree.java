/**
 * Written By Kevin Zheng 
 */
public class IntBSTree <T extends Comparable> {
	
	private T[] tree;
	public static final int DEF_SIZE =1024;
	public IntBSTree()
	{
		tree= (T[]) (new Comparable [DEF_SIZE]);
	}
	public IntBSTree(int size)
	{
		if(size>0)
			tree= (T[])(new Comparable[size]);
	}
	public void insert(T data)
	{
		if(tree[0]==null)//empty tree
			tree[0]=data;
		else
			insert(0,data);
	}
	private void insert (int index, T data)
	{
		if(tree[index]==null)
		{
			tree[index]=data;
		}
		else if(data.compareTo(tree[index])<0)//go left
		{
			if(index*2+1<tree.length)// Still in bound in the array
				insert(index*2+1,data);
		}
		else if(data.compareTo(tree[index])>0)//go right 
		{
			if(index*2+2<tree.length)
			{
				insert(index*2+2,data);
			}
		}
	}
	public void printInOrder()
	{
		printInOrder(0);
	}
	private void printInOrder(int index)
	{
		if(tree[index]==null)
			return;
		if(index*2+1<tree.length)//can i go left
			printInOrder(index*2+1); //going left 
		System.out.println(tree[index]); // process
		if(index*2+2<tree.length) //can i go right
			printInOrder(index*2+2);//going right
	}
	public void printBreadthOrder()
	{
		for (T val:tree)//
		{
			if(val !=null)
				System.out.println(val);
		}
	}
	public void getDepth(T data) // get depth
	{
		returnDepth(0,data,0);
	}
	private void returnDepth(int index, T data, int getDepth)
	{		
		if(tree[index]==null) // The value does not exsit in the tree
		{
			System.out.println(-1);
		}
		else if(data.compareTo(tree[index])<0)// go left
		{
			returnDepth(index*2+1,data,getDepth+1);
		}
		else if(data.compareTo(tree[index])>0)//Go Right
		{
			returnDepth(index*2+2,data,(getDepth+1));
		}
		else  
		{
			System.out.println("The depth of "+data + " is "+getDepth);
		}	
	}
}
