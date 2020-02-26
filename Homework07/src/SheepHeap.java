/**
 * 
 * 
 * Written by Kevin Zheng
 *
 */
public class SheepHeap {

    private Sheep[]aSheep;
	public static final int DEF_SIZE=128; 
    private static int tailIndex;

    public SheepHeap()
    {
        aSheep = (Sheep[])(new Comparable[DEF_SIZE]);
        tailIndex = 0;
    }
    public SheepHeap(int aSize)
    {
        aSheep = new Sheep[aSize];
    }

    public void addSheep(Sheep val)
    {
        if(tailIndex >= aSheep.length)
            return;
        aSheep[tailIndex] = val;
        this.climbUp();
        tailIndex++;
    }

    public void climbUp()
    {
    	int tempIndex=this.tailIndex;
		while(tempIndex > 0 && aSheep[(tempIndex-1)/2].compareTo(aSheep[tempIndex])<0)
		{
			
			Sheep temp=aSheep[(tempIndex-1)/2];
			aSheep[(tempIndex-1)/2]=aSheep[tempIndex];
			aSheep[tempIndex]=temp;
			tempIndex=(tempIndex-1)/2;
		}
    }
    

    public Sheep removeSheep()
    {
    	Sheep repVal= aSheep[0];
		aSheep[0]=aSheep[tailIndex-1];// set root to the last element 
		aSheep[tailIndex-1]=null;
		tailIndex--;
		this.climbDown();
		return repVal;
    }
    
	private void climbDown()
	{
		int tempIndex=0;
		while(tempIndex*2+1< tailIndex)
		{
			// find larger child
			int bigIndex=tempIndex*2+1;//Assume the left child is bigger
			if(tempIndex*2+2<tailIndex && 
					aSheep[tempIndex*2+1].compareTo(aSheep[tempIndex*2+2])<0)
			{
				//there is a right child and its bigger.
				bigIndex=tempIndex*2+2;
			}
			//compare child to the parent
			if(aSheep[tempIndex].compareTo(aSheep[bigIndex])<0)//parent smaller than child
			{
				Sheep temp = aSheep[tempIndex];
				aSheep[tempIndex]=aSheep[bigIndex];
				aSheep[bigIndex]=temp;
			}
			else 
				break;
			tempIndex=bigIndex;
		}
	}
	
	
	  public void sheepHeapSort() 
	    {
	    	for (Sheep val:aSheep)
			{
				if(val !=null){
					
				this.climbDown();
					System.out.println(val);
				}
			}	
	    }
    public void sheepRollCall()
    {  
        System.out.println("Adding 15 Sheeps and roll call them in breadth order");

    		for (Sheep val:aSheep) // print out array 
    		{
    			if(val !=null)
    				System.out.println(val);			
    		}
    		System.out.println();
    		System.out.println("Removing 5 Sheeps");
    	
    		for(int x=0;x<5;x++) // remove sheep 
        	{
        		removeSheep();
        	}
            for(int i=tailIndex;i>0;i--) // print out array after removing 
            {
                System.out.println(removeSheep());
            	
            }
    }

  
}