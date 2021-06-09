//draw RECTANGLE and STRING using input from HTML file
import java.applet.*;
import java.awt.*;
public class RectangleTest extends Applet{
	int x,y,w,h,p,q;
	public void init(){
		x=Integer.parseInt(getParameter("xV"));
		y=Integer.parseInt(getParameter("yV"));
		w=Integer.parseInt(getParameter("wV"));
		h=Integer.parseInt(getParameter("hV"));
		p=Integer.parseInt(getParameter("pV"));
		q=Integer.parseInt(getParameter("qV"));
	}
	public void paint(Graphics g){
		g.drawRect(x,y,w,h);
		g.drawRect(x+2,y+2,w-4,h-4);
		g.drawRect(x+4,y+4,w-8,h-8);
		g.drawRect(x+6,y+6,w-12,h-12);
		g.drawString("RECTANGLE",p,q);
	}
}