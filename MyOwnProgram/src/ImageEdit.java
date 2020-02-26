import java.awt.Desktop;
import java.io.File;
import java.util.Scanner;
public class ImageEdit {
	private static Desktop desk;
	private static String pond= "C:/Users/13811/Pictures/2016-07-04 T/IMG_3318.JPG";
	private static String tree="" ;
	private static String countryside="";
	public static void main(String[] args) {
		Scanner key= new Scanner (System.in);
		System.out.println("Enter 1: Bridge over a pond\n"
				+ "Enter 2: Tree\n"
				+ "Enter 3: CountrySide");
		String option= "Enter 1: Open\n"
				+ "Enter 2: Edit";
		int user=key.nextInt();
		
		if(user==1) 
		{
			System.out.println(option);
			int choice = key.nextInt();
			if(choice == 1)
			{
				try{desk.getDesktop().open(new File(pond));}
				catch (Exception e){}
			}
			else 
			{
				try{desk.getDesktop().edit(new File(pond));}
				catch (Exception e){}
			}
		} 
		else if (user==2)
		{
			System.out.println(option);
			int choice = key.nextInt();
			if(choice == 1)
			{
				try{desk.getDesktop().open(new File("C:/Users/13811/Pictures/2016-07-04 T/IMG_3318.JPG"));}
				catch (Exception e){}
			}
			else 
			{
				try{desk.getDesktop().edit(new File("C:/Users/13811/Pictures/2016-07-04 T/IMG_3318.JPG"));}
				catch (Exception e){}
			}
		}
		else
		{
			System.out.println(option);
			int choice = key.nextInt();
			if(choice == 1)
			{
				try{desk.getDesktop().open(new File("C:/Users/13811/Pictures/2016-07-04 T/IMG_3318.JPG"));}
				catch (Exception e){}
			}
			else 
			{
				try{desk.getDesktop().edit(new File("C:/Users/13811/Pictures/2016-07-04 T/IMG_3318.JPG"));}
				catch (Exception e){}
			}
		}
	
	
	}
	

}
