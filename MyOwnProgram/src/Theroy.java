import java.awt.Desktop;
import java.io.File;
import java.net.URI;

public class Theroy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10;i++)
		{
			System.out.println(i);
		} 
		
		
		int[] array= {0,1,2,3,4,5,6,7,8,9,10}; 
		for(int i:array)
		{
			System.out.println(i);
		}
		/*
		try{  //opens picture to edit 
			Desktop.getDesktop().edit(new File("C:/Users/13811/Pictures/2016-07-04 T/IMG_3318.JPG"));
		}
		catch (Exception e){}
		*/


		  try { //open website 
		   URI uri= new URI("http://www.google.com");
		   java.awt.Desktop.getDesktop().browse(uri);		 
		  } catch (Exception e) {
		   
		   e.printStackTrace();
		  }
		
		
		if (Desktop.isDesktopSupported()) {
		    try { // open books/ PDF files 
		        File myFile = new File("C:/Users/13811/Documents/Torrent/Books/[Bostrom,_Nick]_Superintelligence__paths,_dangers(BookZZ.org) (1).pdf");
		        Desktop.getDesktop().open(myFile);
		    } catch (Exception ex) {
		        // no application registered for PDFs
		    }
		}
		

		
		
	}

}
