/**
 * Written by Kevin Zheng 
 */
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class a {
enum Spaces {Empty,Player,WALKED_PATH,Goal}; // Constant elements for this class.
public static final int BOARD_SIZE = 10; // Constant int for the board size 
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	Scanner key =new Scanner(System.in);
	boolean stop=false;
	while(stop==false){ //  reset the whole game when player step on WALKED_PATH or wins.
    int pX = 0;
    int pY = 0;
    Random r = new Random();
    int gX = r.nextInt(BOARD_SIZE); // Board size 10 across the x axis 
    int gY = r.nextInt(BOARD_SIZE); // Board size 10 across the y axis
    
    Spaces[][] board = new Spaces[BOARD_SIZE][BOARD_SIZE]; // Creates the Board 
    for(int y=0;y<board.length;y++)
    {
        for(int x=0;x<board[y].length;x++)
        {
            board[x][y] = Spaces.Empty; // Empty the board before starting the game. 
        }
    }
    board[pX][pY] = Spaces.Player; //Set the player 
    board[gX][gY] = Spaces.Goal; // set the goal
    System.out.println("Welcome to Mine Walker.  Get the ice cream cone and avoid the WALKED_PATHs");
    
    for (int t=10;t>0;t--)
    {
    	int x = r.nextInt(10); 
        int y = r.nextInt(10);
        if(board[x][y] == Spaces.Empty)
         { 
             board[x][y] = Spaces.WALKED_PATH; //Populate the board with 10 random WALKED_PATHs
         }
    }
    boolean gameOver = false;
    while(gameOver == false){
        for (int y = 0; y < board.length ; y++ ) 
        {
            for (int x = 0; x < board[y].length ; x++ ) {
                switch(board[x][y])
                {
                case Empty:
                    System.out.print("_");
                    break;
                case Player:
                    System.out.print("X");
                    break;
                case WALKED_PATH:
                    System.out.print("_");
                    break;
                case Goal:
                    System.out.print("^");
                    break;
                default:
                    System.out.print("?");
                break;
                }
            }
            System.out.println(" "); //Populate the array with these symbols.
        }
        System.out.println("Enter either -1,0,1 to move in the x or 9 to quit");
        int x = keyboard.nextInt();
        if(x == 9){ // Allow the user to quit.
            System.out.println("Game over!");
            System.exit(0);
        }
        System.out.println("Enter either -1,0,1 to move in the y");
        int y = keyboard.nextInt();
        if(x<-1 || x>1)
        {
            x = 0;
        }
        if(y <-1 || y>1)
        {
            y = 0;
        }
        board[pX][pY] = Spaces.Empty; 
        pX+=x;
        pY+=y;
        if(pX < 0){
            pX = 0; // Make sure the player's x axis does not go out of bound.
        }
        else if(pX>10){
            pX = 10;
        }
        if(pY < 0){
            pY = 0;
        }
        else if(pY> 10){
            pY = 10; //Make sure the player y axis does not go out of bound.
        }
        if(board[pX][pY]==Spaces.WALKED_PATH){           
            System.out.println("Boom! Dead!\n"
            		+ "Would you like to play again? Yes or No");
            String again= key.nextLine();
            keyboard.nextLine();
            if (again.equalsIgnoreCase("Yes")){
                    gameOver = true;// If player step on WALKED_PATH, promt them to play again. Yes or no 
            }
            else {
                System.out.println("Goodbye!");
                gameOver=true;
                System.exit(0);  // If player does not pick yes, the program will quit.
            }
        }
        if(board[pX][pY]==Spaces.Goal){
            System.out.println("You win!\n"
            		+ "Would you like to play again? Yes or No");
            String once=keyboard.next();
            if (once.equalsIgnoreCase("Yes")){
                    gameOver = true; //If the player reaches the goal, it will promt them to play again yes or no.
            }
            else {
                System.out.println("Goodbye!");
                gameOver=true;
                System.exit(0); // If player does not pick yes, the program will quit.
            }
        }
        board[pX][pY] = Spaces.Player;  // Updates the player's movement
    }     
}
}
}