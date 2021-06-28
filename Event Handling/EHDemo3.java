//
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class EHDemo3 extends Applet implements KeyListener{
	String msg="";
	int X=10,Y=5;
	public void init(){
		addKeyListener(this);
		requestFocus();
	}
	public void keyPressed(KeyEvent k){
		char s=k.getKeyChar();
		if(s=='s')
			showStatus("S is pressed");
		else
			showStatus("Key Pressed");
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
<applet code="EHDemo3.class" width=500 height=500>
</applet>
</body>
</html>
*/