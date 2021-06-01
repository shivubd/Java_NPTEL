//use of destroy() method
import java.awt.Graphics;
import java.applet.Applet;
public class AppletDemo3 extends Applet{
	StringBuffer strbuffer;
	public void init(){
		strbuffer=new StringBuffer();
		addItem("Initializing the Applet");
	}
	public void start(){
		addItem("Starting the Applet");
	}
	public void stop(){
		addItem("Stopping the Applet");
	}
	public void destroy(){
		addItem("Destroying the Applet");
	}
	public void addItem(String msg){
		System.out.println(msg);
		strbuffer.append(msg);
		repaint();
	}
	public void paint(Graphics g){
		g.drawRect(10,10,getWidth()-20,getHeight()-20);
		g.drawString(strbuffer.toString(),50,150);
	}
}
/*
<html>
<body>
<applet code="AppletDemo3.class" width=300 height=300>
</applet>
</body>
</html>
*/
	