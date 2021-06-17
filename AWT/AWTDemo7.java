//Creating TextField
import java.awt.*;
public class AWTDemo7{
	public static void main(String args[]){
		Frame f=new Frame("Label Demo");
		TextField t1=new TextField("First TextField");
		t1.setBounds(100,100,150,30);
		TextField t2=new TextField("Second TextField");
		t2.setBounds(100,150,150,30);
		f.add(t1);
		f.add(t2);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}