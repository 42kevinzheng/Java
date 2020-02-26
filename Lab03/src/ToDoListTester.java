
public class ToDoListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToDoList list=new ToDoList();
		System.out.println("To Do List Tester!\n"
				+ "Adding Five Tasks To Do\n"
				+ "Printing List");
		list.addItem("Buy Ground Beef"); //add item 
		list.addItem("Buy Cheese");  //add item 
		list.addItem("Buy Tacos Shells"); //add item 
		list.addItem("Make Tacos"); //add item 
		list.addItem("Eat Tacos"); //add item 
		list.showList(); // test showList method 
		System.out.println("I forgot to get salsa.  Let me add that after step 2.\n"
				+ "Printing List");
		list.goToNext(); // Test goToNext method by moving node forward by one
		list.insertAfterCurrent("Buy Salsa"); //creates a new node based on data and puts that node after the current position. 
		list.showList(); 
		System.out.println("On second thought I’m in a spicy mood so let’s change salsa to hot sauce.\n"
				+ "Printing List");
		list.goToNext();
		list.goToNext(); 
		list.goToPrev(); // test the previous method 
		list.setDataAtCurrent("Buy Hot Sauce"); // takes in a parameter of String and sets the data at the current node to that value as long as current is not null
		list.showList(); 
		System.out.println("Do people put guacamole on tacos? I’ll add it after step 3.\n"
				+ "Printing List");
		list.insertAfterCurrent("Buy guacamole"); 
		list.showList();
		System.out.println("On second thought I don’t think they do let me take that out.");
		list.goToNext();
		list.deleteCurrentNode(); //test the deleteCurrentNode and removes the current node from the list by resetting the links
		list.showList();
		System.out.println("Now I have tested the perfect taco related list!");
		System.out.println(list.getDataAtCurrent()); // Test the getDataAtCurrent method by printing it out 
		
	}

}
