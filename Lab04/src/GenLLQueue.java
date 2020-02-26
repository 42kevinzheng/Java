/**
 * 
 * 
 * @author Kevin Zheng
 *
 * 
 */
public class GenLLQueue <T>{	
	private class ListNode{
		T data;
		ListNode link;
		public ListNode()
		{
			data =null;
			link=null;
		}
	}
	private ListNode head;
	private ListNode tail;
	public GenLLQueue()
	{
		head=tail=null; // default constructor
	}
	public void enqueue(Object data) // Java is weird, could not use T, force to use Object type
	{
		ListNode newNode = new ListNode(); 
		newNode.data=(T)(data); // Type cast data to T
		if(head==null) //Check for Empty list 
		{
			head=newNode; 
			tail=head; 
			return;
		}
		tail.link=newNode; // end is pointed to the newNode
		tail=newNode;// end is set to newNode.
	}
	public T dequeue()
	{
		if(head==null) // check for empty list 
		{
			return null; 
		}
		ListNode temp=head; // Create a temp node and set it to the first element.
		head = head.link; // path to the next elements 
		return temp.data; 
	}
	public T peek()
	{
		if(head==null) // If the first element is empty, return null
		{
			return null;
		}
		return head.data; // If first element is not empty, return data 
	}
	public void showQueue()
	{
		ListNode temp = head; // create a temp node and set it to the first elements
		while(temp!=null) // while the list is not empty, keep going.
		{
			System.out.println(temp.data); // print out result 
			temp=temp.link; // same as i++
		}
	}
}
