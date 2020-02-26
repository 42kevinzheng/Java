//Written By Kevin Zheng 
import java.util.*;

public class Hw4FrontEnd {
    public static void main(String[] args) {
    	System.out.println("Welcome to the reverse Polish Calculator!");
    	System.out.println("This will not be using File I/O");
    	System.out.println("Please enter your input as one string, seperated by spaces.");
        Scanner keyboard=new Scanner(System.in);
        String next= keyboard.nextLine();
        System.out.println("Calculating "+next);
        System.out.println("Result Is: "+working(next)); //Called on the working methods
    }
    
    public static int working(String user) {
    	Hw4 <Integer>stack= new Hw4<Integer>(); //initialize the stacks
		Scanner keyboard = new Scanner(user);
		
		while (keyboard.hasNext()) { // while string has another token continue.
			if (keyboard.hasNextInt()) // Check for integer values 
			{
				stack.push(keyboard.nextInt()); // push the int values into stack
			} 
			else {
				int num2 = stack.pop(); // first number 
				int num1 = stack.pop(); // second number 
				String token = keyboard.next(); // check for operations
				
				if (token.equals("+")) {
					stack.push(num1 + num2); //adds
				} else if (token.equals("-")) { 
					stack.push(num1 - num2); // subtract
				} else if (token.equals("*")) { 
					stack.push(num1 * num2); //multiply
				} 
				else if (token.equals("/"))
				{
					if(num1==0||num2==0)
					{
						System.out.println("Cannot divide by zero"); // check if denom is 0 
						System.exit(0);
					}
					else
					{
						stack.push(num1 / num2); // else it is able to divide 
					}
				}
								
				if (stack.getStackSize()<=1)  // check if stack size is
				{
					System.out.println("Not formatted correctly");
					System.exit(0);
				}
				if(token.toLowerCase().equals("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z"))
				{
					System.out.println("Exception! For input string: Letter"); // check if string contain a letter
					System.exit(0);
				}
				
				
			}
		}
		return stack.pop(); // return results 
    }
}


