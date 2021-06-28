import java.awt.*;
import java.awt.event.*;
public class EHDemo5{
	private Frame f;
	private Label st,status;
	private Panel p;
	EHDemo5(){
		prepareGUI();
	}
	private void prepareGUI(){
		f=new Frame("Button action example");
		f.setSize(400,400);
		f.setLayout(null);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		p=new Panel();
		st=new Label();
		st.setBounds(100,50,180,30);
		status=new Label();
		status.setBounds(100,350,180,30);
		p.setBounds(0,100,400,200);
		p.setLayout(null);
		f.add(p);
		f.add(st);
		f.add(status);
		p.setBackground(Color.lightGray);
		f.setBackground(Color.gray);
		f.setSize(400,500);
	}
	private void runexample(){
		st.setText("Click on Below Buttons");
		Button ok=new Button("OK");
		Button submit=new Button("SUMIT");
		Button cancel=new Button("CANCEL");
		ok.setActionCommand("ok");
		submit.setActionCommand("sub");
		cancel.setActionCommand("can");
		ok.addActionListener(new ButtonClickListener());
		submit.addActionListener(new ButtonClickListener());
		cancel.addActionListener(new ButtonClickListener());
		ok.setBounds(100,80,80,40);
		submit.setBounds(200,80,80,40);
		cancel.setBounds(300,80,80,40);
		p.add(ok);
		p.add(submit);
		p.add(cancel);
		f.setVisible(true);
	}
	private class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String cmd=e.getActionCommand();
			if(cmd.equals("ok"))
				status.setText("OK is clicked");
			else if(cmd.equals("sub"))
				status.setText("SUBMIT is clicked");
			else
				status.setText("CANCEL is clicked");
		}
	}
	public static void main(String args[]){
		EHDemo5 x=new EHDemo5();
		x.runexample();
	}
}
		
	