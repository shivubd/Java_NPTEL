//applet programming_to print Helloworld in applet
import java.applet.Applet;
import java.awt.Graphics;
public class Helloworld extends Applet{
	public void paint(Graphics g){
		g.drawString("Hello, World!",150,150);
	}
}
		