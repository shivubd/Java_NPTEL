//Simple Calculator
import java.awt.*;
import java.awt.event.*;
public class SimpleCalculator{
	Frame f;
	Panel p;
	TextField t;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bminus,bmulti,bdiv,bequ,bclear;
	String status=" ";
	int store=0;
	SimpleCalculator(){
		f=new Frame("Simple Calculator");
		p=new Panel();
		t=new TextField();
		t.setEditable(false);
		b0=new Button("0");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		bplus=new Button("+");
		bminus=new Button("-");
		bmulti=new Button("*");
		bdiv=new Button("/");
		bequ=new Button("=");
		bclear=new Button("C");
		t.setText("0");
		b0.addActionListener(new ButtonClick());
		b1.addActionListener(new ButtonClick());
		b2.addActionListener(new ButtonClick());
		b3.addActionListener(new ButtonClick());
		b4.addActionListener(new ButtonClick());
		b5.addActionListener(new ButtonClick());
		b6.addActionListener(new ButtonClick());
		b7.addActionListener(new ButtonClick());
		b8.addActionListener(new ButtonClick());
		b9.addActionListener(new ButtonClick());
		bplus.addActionListener(new ButtonClick());
		bminus.addActionListener(new ButtonClick());
		bmulti.addActionListener(new ButtonClick());
		bdiv.addActionListener(new ButtonClick());
		bequ.addActionListener(new ButtonClick());
		bclear.addActionListener(new ButtonClick());
		p.setLayout(new GridLayout(4,4,5,5));
		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(bdiv);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(bmulti);
		p.add(b6);
		p.add(b7);				
		p.add(b8);
		p.add(bplus);
		p.add(bclear);
		p.add(bequ);
		p.add(b9);
		p.add(bminus);
		p.setBackground(Color.gray);
		t.setBounds(20,50,230,40);
		p.setBounds(20,100,230,130);
		f.add(t);
		f.add(p);
		f.setSize(270,250);
		f.setLayout(null);
		f.setBackground(Color.gray);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public class ButtonClick implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b0){
				addtoText(0);
			}
			else if(e.getSource()==b1){
				addtoText(1);
			}
			else if(e.getSource()==b2){
				addtoText(2);
			}
			else if(e.getSource()==b3){
				addtoText(3);
			}
			else if(e.getSource()==b4){
				addtoText(4);
			}
			else if(e.getSource()==b5){
				addtoText(5);
			}
			else if(e.getSource()==b6){
				addtoText(6);
			}
			else if(e.getSource()==b7){
				addtoText(7);
			}
			else if(e.getSource()==b8){
				addtoText(8);
			}
			else if(e.getSource()==b9){
				addtoText(9);
			}
			else if(e.getSource()==bplus){
				//if(store!=0)
					addOperation();
			}
			else if(e.getSource()==bminus){
				//if(store!=0)
					subOperation();
			}
			else if(e.getSource()==bmulti){
				//if(store!=0)
					mulOperation();
			}
			else if(e.getSource()==bdiv){
				//if(store!=0)
					divOperation();
			}
			else if(e.getSource()==bequ){
				//if(store!=0)
					System.out.println("Equ clicked");
					equOperation();
			}
			else if(e.getSource()==bclear){
				//if(store!=0)
					clearOperation();
			}
			
		}
		void addtoText(int x){
			if(t.getText()!=" "){			
				String s=t.getText();
				t.setText(String.valueOf((Integer.parseInt(s)*10)+x));
			}
			else
				t.setText(String.valueOf(x));		
		}
		void addOperation(){
			status="add";
			store=Integer.parseInt(t.getText());
			System.out.println(status+" "+store);
			t.setText("0");
		}
		void subOperation(){
			store=Integer.parseInt(t.getText());
			status="sub";
			t.setText("0");
		}
		void mulOperation(){
			store=Integer.parseInt(t.getText());
			status="mul";
			t.setText("0");
		}
		void divOperation(){
			store=Integer.parseInt(t.getText());
			status="div";
			t.setText("0");
		}
		void equOperation(){
			int ans;
			System.out.println("Entered");
			if(status=="add"){
				ans= store + (Integer.parseInt(t.getText()));
				t.setText(String.valueOf(ans));
				store=ans;
			}
			else if(status=="sub"){
				ans=store-(Integer.parseInt(t.getText()));
				t.setText(String.valueOf(ans));
				store=ans;
			}
			else if(status=="mul"){
				ans=store*(Integer.parseInt(t.getText()));
				t.setText(String.valueOf(ans));
				store=ans;
			}
			else if(status=="div"){
				ans=store/(Integer.parseInt(t.getText()));
				t.setText(String.valueOf(ans));
				store=ans;
			}
			else if(status==""){}
		}
		void clearOperation(){
			t.setText("0");
			store=0;
			status=" ";
		}
	}
	public static void main(String args[]){
		new SimpleCalculator();
	}
}
		
		
		
	