//Event Handling: Scribble1
import java.awt.event.*;
import java.awt.*;
import java.awt.Frame.*;
public class EHDemo2 implements MouseListener{
	Frame f=new Frame("Mouse Listener Example");
	Label l=new Label();
	EHDemo2(){
		l.setBounds(100,100,100,30);
		f.add(l);
		f.addMouseListener(this);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String artgs[]){
		new EHDemo2();
	}
	public void mousePressed(MouseEvent e){
		l.setText("Mouse Pressed");
	}
	public void mouseClicked(MouseEvent e){
		l.setText("Mouse Clicked");
	}
	public void mouseExited(MouseEvent e){
		l.setText("Mouse Exited");
	}
	public void mouseEntered(MouseEvent e){
		l.setText("Mouse Entered");
	}
	public void mouseReleased(MouseEvent e){
		l.setText("Mouse Released");
	}
	public void mouseMoved(MouseEvent e){
	    l.setText("Mouse Moved");
	};
}
