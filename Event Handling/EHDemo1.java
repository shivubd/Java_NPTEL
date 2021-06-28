//Event Handling: Scribble1
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class EHDemo1 extends Applet implements MouseListener,MouseMotionListener{
	private int lastx,lasty;
	public void init(){
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	public void mousePressed(MouseEvent e){
		lastx=e.getX();
		lasty=e.getY();
	}
	public void mouseDragged(MouseEvent e){
		Graphics g=this.getGraphics();
		int x=e.getX(), y=e.getY();
		g.drawLine(lastx,lasty,x,y);
		lastx=x;
		lasty=y;
	}
	public void mouseClicked(MouseEvent e){
		showStatus("Mouse Clicked");
	}
	public void mouseExited(MouseEvent e){
		showStatus("Mouse Exited");
	};
	public void mouseEntered(MouseEvent e){
		showStatus("Mouse Entered");
	};
	public void mouseReleased(MouseEvent e){
		showStatus("Mouse Released");
	};
	public void mouseMoved(MouseEvent e){
		//showStatus("(x,y)"+"("+e.getX()+","+e.getY()+")");
	};
}
/*
<html>
<body>
<applet code="EHDemo1.class" width=500 height=500>
</applet>
</body>
</html>
*/