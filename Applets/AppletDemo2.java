//Use of stop() method
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class SampleFrame extends Frame{
	SampleFrame(String title){
		super(title);
		MyWindowAdapter adapter=new MyWindowAdapter(this);
		addWindowListener(adapter);
	}
	public void paint(Graphics g){
		g.drawString("THIS IS A FRAME WINDOW",50,125);
	}
}
class MyWindowAdapter extends WindowAdapter{
	SampleFrame sampleframe;
	MyWindowAdapter(SampleFrame sampleframe){
		this.sampleframe=sampleframe;
	}
	public void windowClosing(WindowEvent we){
		sampleframe.setVisible(false);
	}
}
public class AppletDemo2 extends Applet{
	Frame f;
	public void init(){
		f=new SampleFrame("This is frame");
		f.setSize(250,250);
		f.setVisible(true);
	}
	public void start(){
		f.setVisible(true);
	}
	public void stop(){
		f.setVisible(false);
	}
	public void paint(Graphics g){
		g.drawString("This applet window",50,150);
	}
}
/*
<html>
<body>
<applet code="AppletDemo2.class" width=300 height=300>
</applet>
</body>
</html>
*/
