/**
 * 
 *Written by Kevin Zheng
 */
public class ProcessHeap {

	private Process[] pro;
	private int size;
	
	  public ProcessHeap()
	    {
	        pro = (Process[])(new Comparable[128]);
	        size = 0;
	    }
	    public ProcessHeap(int aSize)
	    {
	        pro = new Process[aSize];
	    }
	
	public void insert(Process data)
	{
		if(size>=pro.length)
			return;// the heap is full
		pro[size]=data;
		this.bubbleUp();
		size++;
	}
	private void bubbleUp()
	{
		int tempIndex=this.size;
		while(tempIndex > 0 && pro[(tempIndex-1)/2].compareTo(pro[tempIndex])<0)
		{
			Process temp=pro[(tempIndex-1)/2];
			pro[(tempIndex-1)/2]=pro[tempIndex];
			pro[tempIndex]=temp;
			tempIndex=(tempIndex-1)/2;
		}
	}
	public Process remove()
	{
		Process repVal= pro[0];
		pro[0]=pro[size-1];// set root to the last element 
		pro[size-1]=null;
		size--;
		this.bubbleDown();
		return repVal;
	}
	private void bubbleDown()
	{
		int tempIndex=0;
		while(tempIndex*2+1< size)
		{
			// find larger child
			int bigIndex=tempIndex*2+1;//Assume the left child is bigger
			if(tempIndex*2+2<size && 
					pro[tempIndex*2+1].compareTo(pro[tempIndex*2+2])<0)
			{
				//there is a right child and its bigger.
				bigIndex=tempIndex*2+2;
			}
			//compare child to the parent
			if(pro[tempIndex].compareTo(pro[bigIndex])<0)//parent smaller than child
			{
				Process temp = pro[tempIndex];
				pro[tempIndex]=pro[bigIndex];
				pro[bigIndex]=temp;
			}
			else 
				break;
			tempIndex=bigIndex;
		}
	}
	
	  public Process peek()
	    {
	        if(pro == null)
	            return null;
	        else 
	        return pro[0];
	    }
	  
	public boolean isEmpty()
	{
		if(pro==null)
			return true;
		else 
			return false;
	}
	
	   public void printHeap()
	    {
	        for(Process thing : pro)
	        {
	            if(thing == null)
	                break;
	            System.out.println(thing.toString());
	        }
	    }
	   
	   public void heapSort(Process heap)
		{
			for(int i=size;i>0;i--)
				System.out.println(this.remove());
		}
	
	
	
	
	 
	 
	  
	
	
	
	
	
	
}
