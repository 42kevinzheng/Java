import java.util.Scanner;
import java.util.Random;
public class g {
enum Spaces {Mine,Empty,Player,Goal};
public static final int BOARD_SIZE = 10;
public static void main(String[] args) {
    int numOfMoves=0;
    int pX = 0;
    int pY = 0;
    Random r = new Random();
    int gX = r.nextInt(BOARD_SIZE);
    int gY = r.nextInt(BOARD_SIZE);
    Scanner keyboard = new Scanner(System.in);
    Spaces[][] board = new Spaces[BOARD_SIZE][BOARD_SIZE];
    for(int y=0;y<board.length;y++)
    {
        for(int x=0;x<board[y].length;x++)
        {
            board[x][y] = Spaces.Empty;
        }
    }
    board[pX][pY] = Spaces.Player;
    board[gX][gY] = Spaces.Goal;
    double death=0.1;
    int mines = (int)(BOARD_SIZE * BOARD_SIZE * death);
    System.out.println("Welcome to Mine Walker.  Get the ice cream cone and avoid the mines");
    
    while(mines>0)
    {
       int x = r.nextInt(BOARD_SIZE - 1) + 1; 
       int y = r.nextInt(BOARD_SIZE - 1) + 1;
       if(board[x][y] == Spaces.Empty)
        { 
            board[x][y] = Spaces.Mine;
            mines--;
        }
    }
    boolean gameOver = false;
    while(gameOver == false)
    {
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
                case Mine:
                    System.out.print("#");
                    break;
                case Goal:
                    System.out.print("^");
                    break;
                default:
                    System.out.print("?");
                break;
                }
            }
            System.out.println(" ");
        }
        
        System.out.println("Enter either -1,0,1 to move in the x or 9 to quit");
        int x = keyboard.nextInt();
        if(x == 9)
        {
            System.out.println("Game over!");
            System.exit(0);
        }
        System.out.println("Enter either -1,0,1 to move in the y");
        int y = keyboard.nextInt();
        if(x <-1 || x >1)
        {
            System.out.println("Invalid input X");
            y = 0;
        }
        if(y <-1 || y>1)
        {
            System.out.println("Invalid input Y");
            y = 0;
        }
        board[pX][pY] = Spaces.Empty;
        pX+=x;
        pY+=y;

        if(pX < 0)
        {
            pX = 0;
        }
        else if(pX>BOARD_SIZE-1)
        {
            pX = BOARD_SIZE-1;
        }
        
        if(pY < 0)
        {
            pY = 0;
        }
        else if(pY> BOARD_SIZE-1)
        {
            pY = BOARD_SIZE-1;
        }
        if(board[pX][pY]==Spaces.Mine)
        {           
            System.out.println("Boom! Dead!");
            System.out.println("Would you like to play again? Yes or No");  
            String again = keyboard.nextLine();
            if (again.equalsIgnoreCase("Yes"))
            {
                    gameOver = false;   
            }
            else 
            {
                System.out.println("Goodbye!");
                gameOver=true;
                System.exit(0); 
            }
        }
        if(board[pX][pY]==Spaces.Goal)
        {
            System.out.println("You win!");
            System.out.println("Would you like to play again? Yes or No");
            String once=keyboard.next();
            if (once.equalsIgnoreCase("Yes"))
            {
            		
                    gameOver = false; 
                 
            }
            else 
            {
                System.out.println("Goodbye!");
                gameOver=true;
                System.exit(0); 
            }
        }
        board[pX][pY] = Spaces.Player;  
    }     
}


}