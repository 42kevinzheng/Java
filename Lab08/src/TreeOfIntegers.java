
public class TreeOfIntegers <T extends Comparable> {
	
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
	
	
	
}
