import java.util.*;
public class ShowcaseGame extends Showcase {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	boolean gameOver = false; 
	while(gameOver == false)
	{
	Prize[] list = readFromText("prizeList.txt"); // read the text file
	Prize[] prizes = randomP(list);  // pick the random items
	System.out.println("Welcome to the Showcase "+"The Prizes are:");
	
	for(int i =0;i<prizes.length;i++) 
	{
		System.out.println(prizes[i].getName()); // return the name in the file
	}
	
	int ppp = 0; // the price of the items
	for(int i = 0;i<prizes.length;i++) 
	{
		ppp += prizes[i].getPrice(); // get the price of the items 
	}   
	System.out.println("You must guess the total cost of all without going over\n"
			+ "Enter your guess");
	int answer = keyboard.nextInt();
	keyboard.nextLine();
	if((answer >= ppp-2000) && answer < ppp )// The price is less and within the 2000 limit.
	{
		System.out.println("You guessed " + answer + " the actual retail price is " + ppp + " ");
		System.out.println("Your guess was close enough!  You win!");
		System.out.println("Would you like to play again? Enter 'n' to quit"); // promt the user to keep playing or quit
		String win = keyboard.nextLine();
		if(win.equalsIgnoreCase("n"))
		{
			System.out.println("Goodbye!");
			gameOver = true;   //quit
		}
	}
	if((answer < ppp - 2000) && answer < ppp) //checks if the answer is less than but not within the 2000 limit
	{
		System.out.println("You guessed " + answer + " the actual retail price is " + ppp + " ");
		System.out.println("I'm sorry but that guess was bad.  You lose for being bad.");
		System.out.println("Would you like to play again? Enter 'n' to quit");
		String stop = keyboard.nextLine();
		if(stop.equalsIgnoreCase("n"))
		{
			System.out.println("Goodbye!");
			gameOver = true; //quit 
		}
	}
	if(answer > ppp) // user quess is over the price 
	{
		System.out.println("You guessed " + answer + " the actual retail price is " + ppp + " ");
		System.out.println("I'm sorry but that was over... You get nothing");
		System.out.println("Would you like to play again? Enter 'n' to quit");
		String over = keyboard.nextLine();
		if(over.equalsIgnoreCase("n"))
		{
			System.out.println("Goodbye!");
			gameOver = true; //quit 
		}
	}
	}
	}
}
