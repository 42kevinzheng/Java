public class ToDoList {
	
	private class ListNode{ // internal class 
		String data;
		ListNode link;
		public ListNode() // default Constructors
		{
			this.data="none"; 
			this.link=null;
		}
		public ListNode(String aData, ListNode aLink) // Parameterized Constructors
		{
			this.data=aData;
			this.link=aLink;
		}
	}
	private ListNode head; // instance Variables
    private ListNode current; // instance Variables
    private ListNode previous; // instance Variables
	public ToDoList()
	{
		head=current=previous=null; // default Constructors
	}
	
	public void goToNext() 
	{
		if(head!=null) // check to see if head node is not null
		previous=current; // move forward by one node 
		current=current.link; // path to current node 
	}
	
	public void goToPrev() 
	{
		if(current!=head) // check to see if current and head node is not null
		{
			current=previous; // move backward by one node 
			previous = previous.link; // path to previous node 
		}
	}
	
	public String getDataAtCurrent() 
	{
		if(current!=null) // check if current does not = null
		{
			return current.data; // return the data at current 
		}
		return null;  
	}
	
	public void setDataAtCurrent(String aData)
	{
		if(current !=null) // check if current does not = null
		{
			current.data=aData; // take in the parameter of string and set it to that value
		}
	}
	
	public void addItem(String newData) 
	{
		ListNode newNode= new ListNode(newData,null); // add a new node and looks for the first null
		if(head==null) // check if head is null 
		{
			head=newNode; // head is set to the newNode  
			current=head; // current is moved to the end
			return;
		}
		
		
		ListNode temp=head;
		while(temp.link !=null) // check if the list is empty, if it is then it starts the list.
		{
			temp=temp.link; 
		}
		temp.link=newNode; 
		
	}
	
	public void insertAfterCurrent(String aData)
	{
		ListNode newNode= new ListNode(aData,null);// add a new node and looks for the first null
		if(current !=null)
		{
		newNode.link=current.link; //  puts that node after the current position
		current.link=newNode;
		}	
					
	}
	
	public void deleteCurrentNode() 
	{
		if(current !=null && previous !=null) //removes the current node from the list by resetting the links
		{
			previous.link=current.link;
			current=current.link;
		}
		
	}
	
	
	public void showList()
	{
		int count=1; // count the number of the items
		ListNode temp=head; // Temperature node  
		while(temp!=null) // Make sure to print out every thing 
		{
		System.out.println(count +". "+ temp.data); // prints out result 
		count++; // keep track of the amount of items 
		temp=temp.link;  
		}
	}

}
