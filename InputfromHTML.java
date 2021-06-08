//In this program the HTML is also typed here, this is another method to execute the APPLETS
import java.applet.Applet;
import java.awt.Graphics;
public class InputfromHTML extends Applet{
	int x,y;
	String msg;
	public void paint(Graphics g){
		x=Integer.parseInt(getParameter("xPos"));
		y=Integer.parseInt(getParameter("yPos"));
		msg=getParameter("msg");
		g.drawString(msg,x,y);
	}
}
/*<applet code="InputfromHTML.class" width="500" height="500">
<param name="xPos" value="100"/>
<param name="yPos" value="100"/>
<param name="msg" value="HELLO"/>
</applet>
*/
		