
public class GenDoubleLinkedList <T>{
	
	private class ListNode {
		private T data;
		private ListNode nextLink;
		private ListNode prevLink;
		public ListNode()
		{
		
		}
		public ListNode(T aData, ListNode aNext, ListNode aPrev )
		{
			this.data=aData;
			this.nextLink=aNext;
			this.prevLink=aPrev;
		}
	}
	private ListNode head;
	private ListNode current;
	public GenDoubleLinkedList()
	{
		head=current=null;	
	}
	public void addItem(T newData) 
	{
		ListNode newNode= new ListNode();
		newNode.data=newData;
		if(head==null) // check if head is null 
		{
			head=newNode; // head is set to the newNode  
			current=head; // current is moved to the end
			return;
		}
		ListNode temp=head;
		while(temp.nextLink!=null) // check if the list is empty, if it is then it starts the list.
		{
			temp=temp.nextLink;
		}
		temp.nextLink=newNode;
	}
	
	
	public void goToNext()
	{
		if(current!=null)
		{	
			head=current.nextLink;
		}
	}
	
	
	public void goToPrev()
	{
		if(current!=null) 
		{
			current=head.prevLink; 
		}
	}
	
	
	public void insertNodeAfterCurrent(T newData) // Working Thank goodness
	{
		ListNode newNode= new ListNode ();
		newNode.data=newData;
		if(current!=null)
		{
			newNode.nextLink=current.nextLink;
			current.nextLink=newNode;
			newNode.prevLink=head.nextLink;
		}
	}
	
	public void deleteCurrentNode()// Humm it works. Thank goodness.
	{
			head=current.nextLink; 
			current=current.nextLink;	
	}
	
	public T getDataAtCurrent()
	{
		if(current!=null)
		{
			return current.data;
		}
		else
		{
			return null; 
		}
	}
	
	
	public void setDataAtCurrent(T newData)
	{
		if(current!=null)	
			this.current.data=newData;	
	}
	
	public void showList() //This is work too. Thank goodness.
	{
		ListNode temp=head; 
		while(temp!=null) 
		{
		System.out.println(temp.data); 
		temp=temp.nextLink;  
		}
	}
	
	
	public boolean inList(T newData)
	{
		
			if(current.equals(newData) )
			{
				return true;
			}
			else
			{
				return false;
			}
		
		
	}
	
	
}
