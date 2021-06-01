//setting BACKGROUND COLOR
import java.applet.*;
import java.awt.*;
public class Bgcolor extends Applet{
	public void init(){
		setBackground(Color.YELLOW);
	}
	public void paint(Graphics g){
		g.drawString("BACKGROUND COLOR SET",150,150);
	}
}