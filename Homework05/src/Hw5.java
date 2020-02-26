/**
 * Written by Kevin Zheng
 * 
 */
import java.awt.*;
import java.applet.*;
import java.util.*;
public class Hw5 extends Applet {
    private Graphics drawingArea;
    private	Image display;  
    public void init(){
        setBackground( Color.black ); // I set up the background to make it easier to see the colors.
    	int height =getSize().height; 
		int width=getSize().width; 
		display= createImage(width,height); // Creates the pop up window  
		drawingArea=display.getGraphics(); // draw the pop up window with graphics  
        int[] x = { 0, 0+width, 0+width/2 }; // initialize all three x points 
        int[] y = { 0+height, 0+height, 0 }; // initialize all three y points
        drawTriangle( x, y, width/2); //Set up the first recursion.     
    }
    public void paint(Graphics g) // called by Applet to draw the thing
	{
		g.drawImage(display, 0, 0, null);
	}   
    private void drawTriangle ( int[] x, int[] y, int z)
    {
        if (z<=4) // check if a limit of 4 pixels is reached
        {
        	drawingArea.fillPolygon ( x, y, 3 ); 
        }
        else 
        {
            int xc = (x[0]+x[1])/2; // x points for the fourth recursion 
            int xb = (x[0]+x[2])/2; // x points for the third recursion 
            int xa = (x[1]+x[2])/2; // x points for the second recursion 
            int yc = (y[0]+y[1])/2; // y points for the second recursion 
            int yb = (y[0]+y[2])/2; // y points for the third recursion 
            int ya = (y[1]+y[2])/2; // y points for the fourth recursion 
            int[] x1s = { x[0], xc, xb }; //recalculate the x's for the second recursion 
            int[] y1s = { y[0], yc, yb }; //recalculate the y's for the second recursion
            drawingArea.setColor(Color.blue); // Change colors for every time drawTriangle is called.
            drawTriangle ( x1s, y1s, z/2); // second recursion 
            int[] x2s = { x[1], xc, xa };  
            int[] y2s = { y[1], yc, ya };
            drawingArea.setColor(Color.red);
            drawTriangle ( x2s, y2s, z/2 ); // third recursion 
            int[] x3s = { x[2], xb, xa };
            int[] y3s = { y[2], yb, ya };
            drawingArea.setColor(Color.green);
            drawTriangle ( x3s, y3s, z/2); // fourth recursion
        }
    }
}
