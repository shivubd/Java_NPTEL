//Creating the List
import java.awt.*;
public class AWTDemo9{
	public static void main(String args[]){
		Frame f=new Frame("Text Area ");
		List l1=new List(5);
		l1.setBounds(100,100,100,300);
		l1.add("Item1");
		l1.add("Item2");
		l1.add("Item3");
		f.add(l1);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
	}
}
