//Creating the Checkbox
import java.awt.*;
public class AWTDemo5{
	AWTDemo5(){
		Frame f=new Frame("Checkbox frame");
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox c1=new Checkbox("C++",cg,false);
		Checkbox c2=new Checkbox("Java",cg,true);
		Checkbox c3=new Checkbox("Python",cg,false);
		c1.setBounds(100,100,50,50);
		c2.setBounds(100,150,50,50);
		c3.setBounds(100,200,50,50);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new AWTDemo5();
	}
}