
import java.util.*;
public class fun {
    public static void main(String[] args) {
    	System.out.println("Welcome to the reverse Polish Calculator!");
    	System.out.println("This will not be using File I/O");
    	System.out.println("Please enter your input as one string, seperated by spaces.");
        Scanner keyboard=new Scanner(System.in);
        String next= keyboard.nextLine();
        System.out.println("Calculating "+next);
        System.out.println("Result Is: "+working(next));
    }
   
    public static int working(String user) {
    	Hw4 <Integer>stack= new Hw4<Integer>();
		Scanner keyboard = new Scanner(user);
		
		while (keyboard.hasNext()) {
			if (keyboard.hasNextInt()) {
				stack.push(keyboard.nextInt());
			} 
			else {
				int one = stack.pop();
				int two = stack.pop();
				String input = keyboard.next();
				if (input.equals("+")) {
					stack.push(one + two);
				} else if (input.equals("-")) {
					stack.push(one - two);
				} else if (input.equals("*")) {
					stack.push(one * two);
				} 
				else if (two==0) 
				{
					System.out.println("Cannot divide by 0");
				}
				else  
				{
					stack.push(one / two);
				}	
				
			}	
		}
		return stack.pop();
    }
}


