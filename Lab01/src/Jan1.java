import java.util.Scanner;
import java.util.Random;
public class Jan1 {
	enum Spaces {Empty,Player,WALKED_PATH,GOAL};
	public static final int Boardsize= 10;
	public static void main(String[] args) {

	Spaces [][] board= new Spaces [Boardsize][Boardsize];	
		int numOfMoves=0;
		int pX=0;
		int pY=0;
		
		Random r=new Random();
		int gX=r.nextInt(Boardsize);
		int gY=r.nextInt(Boardsize);
		Scanner keyboard=new Scanner(System.in);
		for(int i=0;i<board.length;i++)
		{
			for(int q=0;q<board[i].length;q++)
			{
				board[i][q]=Spaces.Empty;
			}
		}
		board[pX][pY]=Spaces.Player;
		board[gY][gX]=Spaces.GOAL;
		boolean gameOver= false;
		while(gameOver==false)
		{
			for(int y=0;y<board.length;y++)
			{
				for (int x=0;x<board[y].length;x++)
				{
					switch(board[y][x])
					{
					case Empty:
						System.out.print("_");
						break;
					case Player:
						System.out.print("X");
						break;
					case WALKED_PATH:
						System.out.print("#");
						break;
					case GOAL:
						System.out.print("_");
						break;
						default:
						System.out.print("?");
						break;
					}
				}
				System.out.println("");
			}
			
			
			
		}
		
		
		
		
		
		
	}
}

		
		