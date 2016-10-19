// Triangles.java: This program draws 50 triangles inside each other.
//http://www.physics.emory.edu/faculty/weeks//ideas/spiral.html
//ToDo: http://www.physics.emory.edu/faculty/weeks//ideas/spiral2.html


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Triangles extends Frame

{  public static void main(String[] args)
	{new Triangles();} //calling new method
   
   Triangles()//triangles method
   {  
	  super("Trippy Triangles"); // creating the title
      addWindowListener(new WindowAdapter()
      {public void windowClosing(WindowEvent e){System.exit(0);}});//exit the program when closing window event
      setSize(550, 550); //setting size to be equal to
      setBackground(Color.BLACK);
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
	  Random rnd = new Random();
	  initialize();//method call
      float  xA, yA, xB, yB, xC, 
      yC, xD, yD, xE, yE, xF, yF, 
      xG, yG, xH, yH, xI, yI,
      xJ, yJ, xL, yL, xK, yK,
      xM, yM, xN, yN, xO, yO,
      xP, yP, xQ, yQ, xR, yR,
      xA1, yA1, xB1, yB1, xC1, yC1, 
      yD1, xD1, xE1, yE1, xF1, yF1, 
      xG1, yG1, xH1, yH1, xI1, yI1,
      xJ1, yJ1, xL1, yL1, xK1, yK1,
      xM1, yM1, xN1, yN1, xO1, yO1,
      xP1, yP1, xQ1, yQ1, xR1, yR1,
      p, q; //float values of the 3 points A,B,C 
      //xA,yA,xB,yB,xC,yC = triangle
      q = 0.1F; //q = spacing between lines
      p = 1 - q; //p = line extending
      
      xA = 250;  //A side, x pos = center of x - half the side
      yA = 250; // a side, y pos = center of y - 1/2 the height
      xB = 50;  // b side x pos = center x + half the side
      yB = 250; // B side y pos = the same as A side y pos
      xC = 150; // C side x pos = center x
      yC = 75; //C side y pos = center y
      
      xD = 250;
      yD = 250;
      xE = 450;
      yE = 250;
      xF = 350;
      yF = 75;
      
      xG = 250;
      yG = 250;
      xH = 150;
      yH = 75;
      xI = 350;
      yI = 75;
      
      xJ = 250;
      yJ = 250;
      xK = 150;
      yK = 425;
      xL = 350;
      yL = 425;
      
      xM = 250;
      yM = 250;
      xN = 50;
      yN = 250;
      xO = 150;
      yO = 425;
      
      xP = 250;
      yP = 250;
      xQ = 450;
      yQ = 250;
      xR = 350;
      yR = 425;
      for (int i=0; i<30; i++) //for loop, starting at 0 going to 50
      {  
    	  try {
  			TimeUnit.MICROSECONDS.sleep(100000);
  		} catch (InterruptedException e) {
  			e.printStackTrace();
  		}
    	 g.setColor(Color.GREEN);
    	 g.drawLine(iX(xA), iY(yA), iX(xC), iY(yC)); //draw a line from xAyA to xByB
    	 g.setColor(Color.BLUE);
    	 g.drawLine(iX(xA), iY(yA), iX(xB), iY(yB));//draw a line from xByB to xCyC
//    	 g.setColor(Color.BLACK);
    	 g.drawLine(iX(xB), iY(yB), iX(xC), iY(yC));//draw a line from xCyC to xAyA
    	 g.setColor(Color.ORANGE);
    	 g.drawLine(iX(xD), iY(yD), iX(xE), iY(yE));
    	 g.setColor(Color.RED);
    	 g.drawLine(iX(xF), iY(yF), iX(xD), iY(yD));
//    	 g.setColor(Color.BLACK);
    	 g.drawLine(iX(xE), iY(yE), iX(xF), iY(yF));
    	 g.setColor(Color.CYAN);
    	 g.drawLine(iX(xG), iY(yG), iX(xH), iY(yH));
//    	 g.setColor(Color.BLACK);
    	 g.drawLine(iX(xH), iY(yH), iX(xI), iY(yI));
    	 g.setColor(Color.WHITE);
    	 g.drawLine(iX(xI), iY(yI), iX(xG), iY(yG));
    	 g.setColor(Color.RED);
    	 g.drawLine(iX(xJ), iY(yJ), iX(xK), iY(yK));
//    	 g.setColor(Color.BLACK);
    	 g.drawLine(iX(xK), iY(yK), iX(xL), iY(yL));
    	 g.setColor(Color.WHITE);
    	 g.drawLine(iX(xL), iY(yL), iX(xJ), iY(yJ));
    	 g.setColor(Color.BLUE);
    	 g.drawLine(iX(xM), iY(yM), iX(xN), iY(yN));
//    	 g.setColor(Color.BLACK);
    	 g.drawLine(iX(xN), iY(yN), iX(xO), iY(yO));
    	 g.setColor(Color.GREEN);
    	 g.drawLine(iX(xO), iY(yO), iX(xM), iY(yM));
    	 g.setColor(Color.ORANGE);
    	 g.drawLine(iX(xP), iY(yP), iX(xQ), iY(yQ));
//    	 g.setColor(Color.BLACK);
    	 g.drawLine(iX(xQ), iY(yQ), iX(xR), iY(yR));
    	 g.setColor(Color.YELLOW);
    	 g.drawLine(iX(xR), iY(yR), iX(xP), iY(yP));

    	 //TRIANGLE 1
         xA1 = p * xA + q * xC; 
         yA1 = p * yA + q * yC; 
         
         xC1 = p * xC + q * xB; 
         yC1 = p * yC + q * yB;
         
         xB1 = p * xB + q * xA; 
         yB1 = p * yB + q * yA; 
         
         
         //TRIANGLE 2
         xD1 = p * xD + q * xE;
         yD1 = p * yD + q * yE;
         
         xE1 = p * xE + q * xF;
         yE1 = p * yE + q * yF;
         
         xF1 = p * xF + q * xD;
         yF1 = p * yF + q * yD;

       //TRIANGLE 3
         xG1 = p * xG + q * xH;
         yG1 = p * yG + q * yH;
         
         xH1 = p * xH + q * xI;
         yH1 = p * yH + q * yI;
         
         xI1 = p * xI + q * xG;
         yI1 = p * yI + q * yG;

       //TRIANGLE 4
         xJ1 = p * xJ + q * xK;
         yJ1 = p * yJ + q * yK;
         
         xK1 = p * xK + q * xL;
         yK1 = p * yK + q * yL;
         
         xL1 = p * xL + q * xJ;
         yL1 = p * yL + q * yJ;
         
       //TRIANGLE 5
         xM1 = p * xM + q * xO;
         yM1 = p * yM + q * yO;
         
         xO1 = p * xO + q * xN;
         yO1 = p * yO + q * yN;
         
         xN1 = p * xN + q * xM;
         yN1 = p * yN + q * yM;
         
       //TRIANGLE 6
         xP1 = p * xP + q * xQ;
         yP1 = p * yP + q * yQ;
         
         xQ1 = p * xQ + q * xR;
         yQ1 = p * yQ + q * yR;
         
         xR1 = p * xR + q * xP;
         yR1 = p * yR + q * yP;
         
         xA = xA1; 
         xB = xB1; 
         xC = xC1;
         xD = xD1;
         xE = xE1;
         xF = xF1;
         xG = xG1;
         xH = xH1;
         xI = xI1;
         xJ = xJ1;
         xK = xK1;
         xL = xL1;
         xM = xM1;
         xN = xN1;
         xO = xO1;
         xP = xP1;
         xQ = xQ1;
         xR = xR1;
         
         yA = yA1;
         yB = yB1; 
         yC = yC1;
         yD = yD1;
         yE = yE1;
         yF = yF1;
         yG = yG1;
         yH = yH1;
         yI = yI1;
         yJ = yJ1;
         yK = yK1;
         yL = yL1;
         yM = yM1;
         yN = yN1;
         yO = yO1;
         yP = yP1;
         yQ = yQ1;
         yR = yR1;
      } 
   }
}
