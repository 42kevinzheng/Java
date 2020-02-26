/**
 * Written by Kevin Zheng
 */
import java.util.Scanner;
import java.util.Random;
public class IntBSTreeDriver {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		
		IntBSTree tree= new IntBSTree();
		System.out.println("Testing the tree");
		System.out.println("Inserting 10 random numbers");
		Random r= new Random();
		for (int i =0; i<10;i++)
		{
			int ran=r.nextInt(100);
			System.out.println("Inserting "+ran);
			tree.insert(ran);
		}
		System.out.println("Printing pre-order traversal.");
		tree.printPreorder();
		System.out.println("Enter a number to remove.");
		int remove=keyboard.nextInt();
		System.out.println("Removing "+remove);
		tree.delete(remove);
		tree.printPreorder();
		System.out.println("Enter a number to find the depth.");
		int depth=keyboard.nextInt();
		tree.getDepth(depth);
	}

}
