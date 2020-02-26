import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		boolean stop=false;
		while(!stop)
		{
		System.out.println("What do you want to do?"
				+ "1: add/n"
				
				+ "2 exponent/n"
				+ "3 subtract/n"
				+ "4 times/n"
				+ "5 divide/n"
				+ "0 Quit");
		int answer=keyboard.nextInt();
		System.out.println("Enter in two numbers");
		int one =keyboard.nextInt();
		System.out.println("You enter: "+one);
		int two= keyboard.nextInt();
		System.out.println("You enter: " +two);
		switch(answer){
		case 1 :
			System.out.println(one +" + "+two +" = "+add(one,two));
			break;
		case 2:
			System.out.println(exponent(one,two));
			break;
		case 3:
			System.out.println(sub(one,two));
			break;
		case 4:
			System.out.println(times(one,two));
			break;
		case 5:
			System.out.println(divide(one,two));
			break;
			default:
				stop=true;
				System.exit(0);
				break;
		}
		}
	}
	
	public static int add(int one, int two)
	{
		return one+two;
	}
	public static double divide (int one, int two)
	{
		return (double)one/two;
	}
	public static int times (int one, int two)
	{
		return one*two;
	}
	public static int sub (int one, int two)	
	{
		return one-two;
	}
	public static double exponent (int one, int two)
	{
		return  Math.pow(one, two);
	}
	public static double derv(int one, int two)
	{
		return Math.pow(one,two+1);
	}
	
	
	

}
