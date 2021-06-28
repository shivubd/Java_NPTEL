import java.awt.event.*;
import java.awt.*;
import java.lang.*;
public class EHDemo6 extends Frame implements ActionListener{
	//Frame f;
	TextField t1,t2,t3;
	Button b1,b2;
	EHDemo6(){
		//f=new Frame("Calci");
		t1=new TextField();
		t1.setBounds(50,100,100,30);
		t2=new TextField();
		t2.setBounds(50,160,100,30);
		t3=new TextField();
		t3.setBounds(50,220,100,30);
		t3.setEditable(false);
		b1=new Button("+");
		b1.setBounds(50,280,100,60);
		b2=new Button("-");
		b2.setBounds(50,380,100,60);
		b1.addActionListener(this);
		b2.addActionListener(this);
		//f.add(t1);
		add(t1);
		//f.add(t2);
		add(t2);
		//f.add(t3);
		add(t3);
		//f.add(b1);
		add(b1);
		//f.add(b2);
		add(b2);
		//f.setLayout(null);
		setLayout(null);
		//f.setSize(200,500);
		setSize(200,500);
		//f.setVisible(true);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosed(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e){
			String s1=t1.getText();
			String s2=t2.getText();
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			System.out.print(b);
			int c=0;
			if(e.getSource()==b1)
				c=a+b;
			else if(e.getSource()==b2)
				c=a-b;
			t3.setText(String.valueOf(c));
	}
	public static void main(String args[]){
		new EHDemo6();
	}
}



























				
				
		
		
		