//Creating Label
import java.awt.*;
public class AWTDemo6{
	public static void main(String args[]){
		Frame f=new Frame("Label Demo");
		Label l1=new Label("First Label");
		l1.setBounds(100,100,150,30);
		Label l2=new Label("Second Label");
		l2.setBounds(100,150,150,30);
		f.add(l1);
		f.add(l2);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}