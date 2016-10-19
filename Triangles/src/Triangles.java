// Triangles.java: This program draws 50 triangles inside each other.
//Alex Steel
//CS457 Computer Graphics Theory


import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

public class Triangles extends Frame

{  public static void main(String[] args)
	{new Triangles();} //calling new method
   
   Triangles()//triangles method
   {  
	   
	  super("Triangles: 250 triangles inside each other"); // creating the title
      addWindowListener(new WindowAdapter()
      {public void windowClosing(WindowEvent e){System.exit(0);}});//exit the program when closing window event
      setBackground(Color.BLACK);
      setSize(1280, 720); //setting size to be equal to
      add("Center", new CvTriangles()); //create a center in a new canvas
      show(); //show program
   }
}

class CvTriangles extends Canvas //canvas triangles extends canvas
{  
	int maxX, maxY, minMaxXY, xCenter, yCenter; //setting variables
	//maxX pos, maxY pos, minmaxXY pos, x center point, y center point

   void initialize()
   {  
	  Dimension d = getSize(); //setting the dimension d = the size of the screen
      maxX = d.width - 1; maxY = d.height - 1; //max X value is equal to dimension width - 1, max y is equal to dimension height - 1
      minMaxXY = Math.min(maxX, maxY);//the minimum MaxXY values are equal to the minimum value of maxX and maxY
      xCenter = maxX/2; yCenter = maxY/2; //x center point is equal to maxX/2, y is equal to maxY/2
   }
   int iX(float x){return Math.round(x);}//creating a float of x values, rounding the x values
   int iY(float y){return maxY - Math.round(y);}//float of y values, maxY - the rounding of the y values

   public void paint(Graphics g)
   {  
	  initialize();//method call
      float side = 0.95F * minMaxXY, //side = .95float * the min values of the maxXY
    		  sideHalf = 0.5F * side, //half the side = .5float * the side
    		  height = sideHalf * (float)Math.sqrt(3), //height = halfside * the float of the square root of 3
    		  xA, yA, xB, yB, xC, yC, xA1, yA1, xB1, yB1, xC1, yC1, p, q; //float values of the 3 points A,B,C 
      //xA,yA,xB,yB,xC,yC = triangle
      q = 0.02F; //q = spacing between lines
      p = 1 - q; //p = line extending
      xA = xCenter - sideHalf;  //A side, x pos = center of x - half the side
      yA = yCenter - 0.5F * height; // a side, y pos = center of y - 1/2 the height
      xB = xCenter + sideHalf;  // b side x pos = center x + half the side
      yB = yA; // B side y pos = the same as A side y pos
      xC = xCenter; // C side x pos = center x
      yC = yCenter + 0.5F * height; //C side y pos = center y
      for (int i=0; i<300; i++) //for loop, starting at 0 going to 50
      {  
    	
    	 g.setColor(Color.RED);
    	 g.drawLine(iX(xA), iY(yA), iX(xB), iY(yB)); //draw a line from xAyA to xByB
    	 g.setColor(Color.GREEN);
    	 g.drawLine(iX(xB), iY(yB), iX(xC), iY(yC));//draw a line from xByB to xCyC
    	 g.setColor(Color.BLUE);
    	 g.drawLine(iX(xC), iY(yC), iX(xA), iY(yA));//draw a line from xCyC to xAyA
         //calculations to determine the new lines extending from corners
         xA1 = p * xA + q * xB; 
         yA1 = p * yA + q * yB; 
         
         xB1 = p * xB + q * xC; 
         yB1 = p * yB + q * yC;
         
         xC1 = p * xC + q * xA; 
         yC1 = p * yC + q * yA; 
         
         xA = xA1; 
         xB = xB1; 
         xC = xC1;
         
         yA = yA1;
         yB = yB1; 
         yC = yC1;
      } 
   }
}
