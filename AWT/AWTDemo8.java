//Creating the TextArea
import java.awt.*;
public class AWTDemo8{
	public static void main(String args[]){
		Frame f=new Frame("Text Area ");
		TextArea area=new TextArea("Type Here");
		area.setBounds(100,100,300,300);
		f.add(area);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
	}
}
