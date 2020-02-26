import java.util.Scanner;
public class fahrenheit_to_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter c to convert F - C\n"
				+ "Enter f to convert C-F");
		String user= keyboard.nextLine();
		if(user.equalsIgnoreCase("f")){
			System.out.println("Enter in a celsius number: ");
			int temp= keyboard.nextInt();
			far(temp); }
		else {
		System.out.println("Enter in a fahrenheit number: ");
		int temp= keyboard.nextInt();
		cel(temp); }
	}
	public static void far(int num)
	{ System.out.println(((num*9)/5)+32+ " F"); }
	public static void cel(int num)
	{ System.out.println(((num-32)*5)/9+ " C"); }
}
