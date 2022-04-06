package lab4;
import java.awt.Color;
import java.awt.Graphics;
public class Linie extends FiguraGeometrica{
	
	int x;
	int y;
	public Linie() {}
	
	public Linie(int x,int y)
	{
		 this.x = x;
	     this.y = y;
	}
	
	public void paint(Graphics g1)
	{
		int r,g,b1;
		
		g1.drawLine(100, 100, 400, 100);
		r=(int)(Math.random()*256);
		g=(int)(Math.random()*256);
		b1=(int)(Math.random()*256);
				
		g1.setColor(new Color(r,g,b1));
		
				
	}

}
