//Creating the Checkbox
import java.awt.*;
public class AWTDemo4{
	AWTDemo4(){
		Frame f=new Frame("Checkbox frame");
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox c1=new Checkbox("C++",cg);
		Checkbox c2=new Checkbox("Java",cg,true);
		Checkbox c3=new Checkbox("Python",cg,false);
		c1.setBounds(100,100,50,50);
		c2.setBounds(100,150,50,50);
		c2.setBounds(100,200,50,50);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.setSize(500,500);
		f.setLayout(null);
		f.show();
	}
	public static void main(String args[]){
		new AWTDemo4();
	}
}