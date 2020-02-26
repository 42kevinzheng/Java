import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class MainDownload {

  public static void main(String[] args) throws IOException {
		 
		 String fileName = "f.png"; //The file that will be saved on your computer
		 URL link = new URL("https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.w3schools.com%2Fcss%2Ftrolltunga.jpg&imgrefurl=https%3A%2F%2Fwww.w3schools.com%2Fcss%2Fcss3_images.asp&docid=2bZLA8JdC6ZaTM&tbnid=lAHthDF3S1ACoM%3A&vet=10ahUKEwj6vdf-tuHTAhVFLSYKHQPTBrwQMwhbKAAwAA..i&w=1000&h=300&bih=1012&biw=2048&q=image&ved=0ahUKEwj6vdf-tuHTAhVFLSYKHQPTBrwQMwhbKAAwAA&iact=mrc&uact=8"); //The file that you want to download
		
     //Code to download
		 InputStream in = new BufferedInputStream(link.openStream());
		 ByteArrayOutputStream out = new ByteArrayOutputStream();
		 byte[] buf = new byte[1024];
		 int n = 0;
		 while (-1!=(n=in.read(buf)))
		 {
		    out.write(buf, 0, n);
		 }
		 out.close();
		 in.close();
		 byte[] response = out.toByteArray();
 
		 FileOutputStream fos = new FileOutputStream(fileName);
		 fos.write(response);
		 fos.close();
     //End download code
		 
		 System.out.println("Finished");

	}

}
 

