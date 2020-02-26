/** 
 * 
 * Written By Kevin Zheng
 *
 */
public class FruitTreeDriver extends FruitTreeHelper{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the fruit tree!");
		System.out.println("Populating tree file file");
		FruitTree<String> sTree = new FruitTree<String>();
		String a= readFile("fruitFile.txt");
		sTree.insert(a);
		System.out.println("Printing the in-order traversal");
		sTree.printInOrder();
		System.out.println("Printing the pre-order traversal");
		sTree.printPreOrder();
		System.out.println("Printing the post-order traversal");
		sTree.printPostorder();
		System.out.println("Deleting Apple 0.4859853412170728");
		sTree.delete("Apple 0.4859853412170728");
		sTree.printInOrder();
		
	}

}
	