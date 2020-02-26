import java.util.Scanner;
public class Simple {
	public static void main (String[] args){
		Scanner keyboard=new Scanner(System.in);
		boolean stop=false;
		System.out.println("Enter 1: +\n"
				+ "Enter 2: -\n"
				+ "Enter 3: *\n"
				+ "Enter 4: / \n"
				+ "Enter 9: Quit");
		int user=keyboard.nextInt();
		if(user==1){
			System.out.println("Enter in two number.");
			double a =keyboard.nextDouble();
			double b=keyboard.nextDouble();
			double result = a+b;
			System.out.println("The result is "+result);
		}
		else if(user==2){
			System.out.println("Enter in two number.");
			double a =keyboard.nextDouble();
			double b=keyboard.nextDouble();
			double result = a-b;
			System.out.println("The result is "+result);
		}
		else if(user==3){
			System.out.println("Enter in two number.");
			double a =keyboard.nextDouble();
			double b=keyboard.nextDouble();
			double result = a*b;
			System.out.println("The result is "+result);
		}
		else if (user==4){
			System.out.println("Enter in two number.");
			double a =keyboard.nextDouble();
			double b=keyboard.nextDouble();
			double result = a/b;
			System.out.println("The result is "+result);
		}
		else
		{
			stop=true;
			System.out.println("Goodbye!");
			System.exit(0);
		}
	}
}