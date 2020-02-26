import java.util.Random;
import java.util.Scanner;
public class IntBSTreeTester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Int BST Tester!\n"
				+ "Creating tree\n"
				+ "Populating Tree with values\n"
				+ "Testing insertion by in-order traversal");
		IntBSTree tree= new IntBSTree();
		Scanner keyboard= new Scanner(System.in);
		
		Random r= new Random();
		int [] a = new int[10];
		for (int i=0; i<a.length;i++)
		{
		a[i]=r.nextInt(100); 
		}
		for(int i=0; i<a.length;i++)
		{
		tree.insert(a[i]);
		}
		tree.printInOrder();
		System.out.println("Testing breadth order traversal");
		tree.printBreadthOrder();
		System.out.println("Enter a number to find the depth.");
		int depth=keyboard.nextInt();
		tree.getDepth(depth);
		System.out.println("Enter another number to find the depth.");
		int depth2=keyboard.nextInt();
		tree.getDepth(depth2);
	}
}
