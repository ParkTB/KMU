// Draw a top view of 24 soda cans, that is 24 circles,
// arranged in a 4 x 6 grid.

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class CoffeeCansComponent extends JComponent
{

   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;

      int a = 10;
      int b = 10;
      while(b < 160) {
    	  
    	  while (a < 240) {
    		  Ellipse2D.Double can = new Ellipse2D.Double(a, b, 40, 40);
    	      g2.draw(can);
    	      a += 40;
    	      
    	  }
    	  b += 40;
    	  a = 10;
      }
      
      

      

    }
}