import java.util.Scanner;
public class PigLatin {
	
	public static void main (String[]args){
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Pig Latin, Enter in a word. Ex Duck = uckday"); 
		String ay= "ay", first="", second="";
		String user= keyboard.nextLine();
		String [] split= user.split(" "); 
		for(int i=0; i<split.length;i++)
		{
			first=split[i].substring(0,1);
			second= split[i]+first+ay;
			second=second.substring(1, second.length());
			System.out.println(second);	
		}		
	}
}