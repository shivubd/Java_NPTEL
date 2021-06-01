//Demo to use of init() and start() and paint()
import java.awt.*;
import java.applet.*;
public class AppletDemo1 extends Applet{
	String msg;
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
		resize(500,500);
		msg="Inside init()----";
	}
	public void start(){
		msg+="Inside start()----";
	}
	public void paint(Graphics g){
		msg+="Inside paint()";
		int x,y;
		x=Integer.parseInt(getParameter("xval"));
		y=Integer.parseInt(getParameter("yval"));
		showStatus("This my first applet");
		g.drawString(msg,x,y);
	}
}
/*
<html>
<body>
<applet code="AppletDemo1.class" width=300 height=300>
<param name="xval" value=50>
<param name="yval" value=150>
</applet>
</body>
</html>
*/

		