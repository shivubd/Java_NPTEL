//use of getParameter()
import java.awt.*;
import java.applet.*;
public class AppletDemo5 extends Applet{
	int x,y,w,h;
	String msg;
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.black);
		resize(400,300);
	}
	public void start(){
		x=Integer.parseInt(getParameter("xVal"));
		y=Integer.parseInt(getParameter("yVal"));
		w=Integer.parseInt(getParameter("wVal"));
		h=Integer.parseInt(getParameter("hVal"));
		msg=getParameter("message");
	}
	public void paint(Graphics g){
		int i;
		for(i=0;i<=5;i++){
			g.drawRect(x+i,y+i,w-(2*i),h-(2*i));
		}
		g.drawString(msg,200-(msg.length()/2),300/2);
	}
}