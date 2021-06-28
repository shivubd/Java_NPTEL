//
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class EHDemo4 extends Applet implements KeyListener{
	String msg="";
	int X=100,Y=50;
	public void init(){
		addKeyListener(this);
		requestFocus();
	}
	public void keyPressed(KeyEvent k){
		showStatus("Key Pressed");
		int key=k.getKeyCode();
		switch(key){
			case KeyEvent.VK_F1: msg+="<F1>";
						  break;
			case KeyEvent.VK_F2: msg+="<F2>";
						  break;
			case KeyEvent.VK_F3: msg+="<F3>";
						  break;
			case KeyEvent.VK_F4: msg+="<F4>";
						  break;
			case KeyEvent.VK_PAGE_UP: msg+="<UP>";
						  break;		
			case KeyEvent.VK_PAGE_DOWN: msg+="<DOWN>";
						  break;
			case KeyEvent.VK_LEFT: msg+="<LEFT>";
						  break;		
			case KeyEvent.VK_RIGHT: msg+="<RIGHT>";
						  break;			
		}
		repaint();
	}
	public void keyReleased(KeyEvent k){
		showStatus("Key Released");
	}
	public void keyTyped(KeyEvent k){
		msg+=k.getKeyChar();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg,X,Y);
	}
}
/*
<html>
<body>
<applet code="EHDemo4.class" width=500 height=500>
</applet>
</body>
</html>
*/