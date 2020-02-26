
public class GenDoubleLinkedListTester {
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    	//Test Strings 
        GenDoubleLinkedList<String> sList = new GenDoubleLinkedList<String>(); 
        
        sList.addItem("Pencil");
        sList.addItem("Paper");
        sList.addItem("BasketBall"); //Use addItem method to test other methods. 
        sList.addItem("Golf Cart");
        sList.addItem("Palm Tree");
        sList.showList(); // Test the showList method.
        System.out.println();
        System.out.println("Test the goToNext method. It should add \"Computer\" after Pencil");
        sList.insertNodeAfterCurrent("Computer");// test insertNodeAfterCurrent method. 
        sList.showList();
        System.out.println();
        System.out.println("Let's get rid of pencil.");
        sList.deleteCurrentNode();
      
        sList.showList();
        System.out.println();
        System.out.println(sList.getDataAtCurrent()); // Test the getDataAtCurrent method
        
        
    }

}
