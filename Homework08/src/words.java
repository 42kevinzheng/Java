/**
 * 
 * Written by Kevin Zheng
 */
import java.util.*;
import java.io.*;
public class words {
	public int[][] list;
	int path = 1;
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("This program will test to see if the word you enter is in the text file");
		System.out.println("Enter in a string");
		Scanner key= new Scanner(System.in);
		String a =key.nextLine().toLowerCase();
		char[][] matrix = { 
				{ 'r', 'a', 'h', 'j', 'm' },
				{ 'y', 'u', 'w', 'w', 'k' }, 
				{ 'r', 'x', 'n', 'f', 'm' },
				{ 'q', 'g', 'e', 'e', 'b' }, 
				{ 'e', 'o', 'a', 'p', 'e' } };
		words w = new words(matrix.length);
		if (w.searchWord(matrix, a)&& a.length()>=2 && a.length()<=5) {
			w.print();
			System.out.println("The word you enter "+"'"+a +"'"+" is in the dictory file");
		}
		else if(a.length()<2)
		{
			System.out.println("The word you enter is too short");
		}
		else if(a.length()>5)
		{
			System.out.println("The word you enter is too long");
		}
		else 
		{
			System.out.println("The word you enter "+"'"+a +"'"+" is not in text file");
		}
	}
	
	public words(int N) { // Default constructor 
		list = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				list[i][j] = 0;
			}
		}
	}
	
	public boolean searchWord(char[][] matrix, String word) { // Find the word in the 2d matrix 
		int N = matrix.length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (search(matrix, word, i, j, 0, N)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean search(char[][] matrix, String word, int row, int col, 
			int index, int N) {

		// check if current cell not already used or character in it is not not

		if (list[row][col] != 0 || word.charAt(index) != matrix[row][col]) {
			return false;
		}

		if (index == word.length() - 1) {
			// word is found, return true
			list[row][col] = path++;
			return true;
		}

		// mark the current cell as 1
		list[row][col] = path++;		
		// check if cell is already used

		if (row + 1 < N && search(matrix, word, row + 1, col, index + 1, N)) { // go
																				// down
			return true;
		}
		if (row - 1 >= 0 && search(matrix, word, row - 1, col, index + 1, N)) { // go
																				// up
			return true;
		}
		if (col + 1 < N && search(matrix, word, row, col + 1, index + 1, N)) { // go
																				// right
			return true;
		}
		if (col - 1 >= 0 && search(matrix, word, row, col - 1, index + 1, N)) { // go
																				// left
			return true;
		}
		if (row - 1 >= 0 && col + 1 < N
				&& search(matrix, word, row - 1, col + 1, index + 1, N)) {
			// go diagonally up right
			return true;
		}
		if (row - 1 >= 0 && col - 1 >= 0
				&& search(matrix, word, row - 1, col - 1, index + 1, N)) {
			// go diagonally up left
			return true;
		}
		if (row + 1 < N && col - 1 >= 0
				&& search(matrix, word, row + 1, col - 1, index + 1, N)) {
			// go diagonally down left
			return true;
		}
		if (row + 1 < N && col + 1 < N
				&& search(matrix, word, row + 1, col + 1, index + 1, N)) {
			// go diagonally down right
			return true;
		}

		list[row][col] = 0; // DFS
		path--;
		return false;
	}

	public void print() { 
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				System.out.print(" " + list[i][j]);
			}
			System.out.println();
		}
	}
	



}