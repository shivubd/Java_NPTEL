//Simple Banner program
import java.awt.*;
import java.applet.*;
public class AppletDemo4 extends Applet implements Runnable{
	Thread t=null;
	String msg="A Simple Moving Banner ";
	int state;
	boolean StopFlag;
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	public void start(){
		t=new Thread(this);
		StopFlag=false;
		t.start();
	}
	public void run(){
		char ch;
		for(;;){
			try{
				repaint();
				Thread.sleep(50);
				ch=msg.charAt(0);
				msg=msg.substring(1,msg.length());
				msg+=ch;
				if(StopFlag)
					break;
			}
			catch(Exception ie){
			}
		}
	}
	public void stop(){
		StopFlag=true;
		t=null;
	}
	public void paint(Graphics g){
		g.drawString(msg,50,150);
	}
}
/*
<applet code="AppletDemo4.class" width=300 height=300>
</applet>
*/
				
			
			