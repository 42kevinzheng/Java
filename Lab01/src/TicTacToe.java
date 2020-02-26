import java.util.Random;
public class TicTacToe {
  private static final int Boardsize = 3;
  public static void main(String[] args) {
    System.out.println("Welcome to random Tic Tac Toe Checker. Let's see our randomly generated board.");
    char[][] board = new char[Boardsize][Boardsize]; 
    Random r = new Random();
    for (int i = 0; i < Boardsize; i++) 
    {
      for (int j = 0; j < Boardsize; j++) 
      {
		int a = r.nextInt(5);
        if (a <2) 
        {
          board[i][j] = 'x';
        } 
        else if (a >=2)
        {
          board[i][j] = 'o';
        }
      }
    }// This nested for loop is used to assign each element in the multidimensional array a x or o based on random number generator between 0 and 4.    

    
    
    for (int i = 0; i < Boardsize; i++) {
      for (int j = 0; j < Boardsize; j++) {
        System.out.print(board[i][j]);
      }
      System.out.println();
    } // This nested for loop is used to print the each element in the multidimensional array. These elements have already been assign there x or o from the 
     // first nested for loop.
    
    
    boolean x =false;
    boolean o=false; // These two boolean keep track of the winner.
    
    
	if(board[0][0]=='x'&& board[1][0]=='x'&&board[2][0]=='x')
	{
		System.out.println("The X’s win!");
		x=true;
	}
	else if(board[0][1]=='x'&& board[1][1]=='x'&&board[2][1]=='x')
	{
		System.out.println("The X’s win!");
		x=true;
	}
	else if(board[0][2]=='x'&& board[1][2]=='x'&&board[2][2]=='x')
	{
		System.out.println("The X’s win!");
		x=true;
	}
	else if(board[0][0]=='x'&& board[0][1]=='x'&&board[0][2]=='x')
	{
		System.out.println("The X’s win!");
		x=true;
	}
	else if(board[1][0]=='x'&& board[1][1]=='x'&&board[1][2]=='x')
	{
		System.out.println("The X’s win!");
		x=true;
	}
	else if(board[2][0]=='x'&& board[2][1]=='x'&&board[2][2]=='x')
	{
		System.out.println("The X’s win!");
		x=true;
	}
	else if(board[0][0]=='x'&& board[1][1]=='x'&&board[2][2]=='x')
	{
		System.out.println("The X’s win!");
		x=true;
	}
	else if(board[0][2]=='x'&& board[1][1]=='x'&&board[2][0]=='x')
	{
		System.out.println("The X’s win!");
		x=true;
	}       // This if/else if, statement is used to check for the x winner   
	
	
		if(board[0][0]=='o'&& board[1][0]=='o'&&board[2][0]=='o')
		{
			System.out.println("The O’s win!");
			o=true;
		}
		else if(board[0][1]=='o'&& board[1][1]=='o'&&board[2][1]=='o')
		{
			System.out.println("The O’s win!");
			o=true;
		}
		else if(board[0][2]=='o'&& board[1][2]=='o'&&board[2][2]=='o')
		{
			System.out.println("The O’s win!");
			o=true;
		}
		else if(board[0][0]=='o'&& board[0][1]=='o'&&board[0][2]=='o')
		{
			System.out.println("The O’s win!");
			o=true;
		}
		else if(board[1][0]=='o'&& board[1][1]=='o'&&board[1][2]=='o')
		{
			System.out.println("The O’s win!");
			o=true;
		}
		else if(board[2][0]=='o'&& board[2][1]=='o'&&board[2][2]=='o')
		{
			System.out.println("The O’s win!");
			o=true;
		}
		else if(board[0][0]=='o'&& board[1][1]=='o'&&board[2][2]=='o')
		{
			System.out.println("The O’s win!");
			o=true;
		}
		else if(board[0][2]=='o'&& board[1][1]=='o'&&board[2][0]=='o')
		{
			System.out.println("The O’s win!");
			o=true;
		}// This if/else if , statement is used to check for the o winner 
		 // I used two separated if/else if, statement to check if x and o will win at the same time.
		
		if(x==false && o==false)
		 System.out.println("Cat! No One Wins!");// Check if there is no winners.
		 
	}
}
