//Creating a Panel
import java.awt.*;
public class AWTDemo2{
	public static void main(String args[]){
		Frame frame=new Frame("My first AWT Frame");
		Panel panel=new Panel();
		frame.resize(500,500);
		frame.setBackground(Color.blue);
		frame.setLayout(null);
		panel.setBackground(Color.yellow);
		panel.resize(250,250);
		frame.add(panel);
		frame.show();
	}
}