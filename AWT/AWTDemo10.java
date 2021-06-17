//Creating the List
import java.awt.*;
public class AWTDemo10{
	public static void main(String args[]){
		Frame f=new Frame("Text Area ");
		Choice c1=new Choice();
		c1.setBounds(100,100,100,30);
		c1.add("Item1");
		c1.add("Item2");
		c1.add("Item3");
		c1.add("Item4");
		c1.add("Item5");
		f.add(c1);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
	}
}
