//Creating a frame
import java.awt.*;
public class AWTDemo1{
	public static void main(String args[]){
		Frame frame=new Frame("My first AWT Frame");
		frame.resize(500,500);
		frame.setBackground(Color.blue);
		frame.show();
	}
}