//Creating a Button
import java.awt.*;
public class AWTDemo3{
	public static void main(String args[]){
		Frame frame=new Frame("My first AWT Frame");
		Button b=new Button("Click");
		b.setBounds(100,100,100,30);
		frame.add(b);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.show();
	}
}