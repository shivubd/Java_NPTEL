//My first Interface
import java.awt.*;
public class Demo{
	public static void main(String args[]){
		Frame f=new Frame("Student survey");
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		//DESIGN OF PANEL 1: BASIC DETAILS
		Label name=new Label("Full name");
		Label father_name=new Label("Father's name");
		Label mother_name=new Label("Mother's name");
		Label age=new Label("Age");
		Label sex=new Label("Sex");
		Label DOB=new Label("Date of Birth:");
		Label day=new Label("Day");
		Label month=new Label("Month");
		Label year=new Label("Year");
		TextField namet=new TextField();
		TextField father_namet=new TextField();
		TextField mother_namet=new TextField();
		TextField aget=new TextField();
		CheckboxGroup ckg=new CheckboxGroup();
		Checkbox male=new Checkbox("Male",ckg,false);
		Checkbox female=new Checkbox("Female",ckg,false);
		Checkbox other=new Checkbox("Other",ckg,false);
		Choice dayc=new Choice();
		for(int i=1;i<=31;i++)
			dayc.add(String.valueOf(i));
		Choice monthc=new Choice();
		for(int j=1;j<=12;j++)
			monthc.add(String.valueOf(j));
		Choice yearc=new Choice();
		for(int k=1995;k<=2019;k++)
			yearc.add(String.valueOf(k));
		name.setBounds(10,10,80,30);                    //Label of Full name
		father_name.setBounds(10,60,80,30);             //Label of Father's name
		mother_name.setBounds(10,110,85,30);            //Label of Mother's name
		age.setBounds(10,160,80,30);                    //Label of age
   		sex.setBounds(10,210,80,30);                    //Label of Sex
		DOB.setBounds(10,260,80,30);                    //Label of Date of Birth
			day.setBounds(100,260,30,30);               //Label of Day
				dayc.setBounds(130,263,40,30);          //Choice of Day
			month.setBounds(180,260,40,30);             //Label of Month
				monthc.setBounds(220,263,40,30);        //Choice of Month
			year.setBounds(270,260,40,30);              //Label of Year
				yearc.setBounds(310,263,55,30);         //Choice of Year
		namet.setBounds(110,13,180,20);                 //TextField of Full name
		father_namet.setBounds(110,63,180,20);          //TextField of Father's name
		mother_namet.setBounds(110,113,180,20);         //TextField of Mother's name
		aget.setBounds(110,160,50,20);                  //TextField of age
		male.setBounds(110,210,80,30);                  //CheckboxGroup of Sex 
		female.setBounds(190,210,80,30);                //		
		other.setBounds(270,210,80,30);                 //
		p1.add(name);                                   //adding all the components to Panel p1:Basic Details
		p1.add(namet);
		p1.add(father_name);
		p1.add(father_namet);
		p1.add(mother_name);
		p1.add(mother_namet);
		p1.add(age);
		p1.add(aget);
		p1.add(sex);
		p1.add(male);
		p1.add(female);
		p1.add(other);
		p1.add(DOB);
		p1.add(day);
		p1.add(dayc);
		p1.add(month);
		p1.add(monthc);
		p1.add(year);
		p1.add(yearc);                                  //added all the components to p1
		p1.setBounds(30,60,430,300);                    //setting bounds of panel p1 in frame
		p1.setBackground(Color.lightGray);
		p1.setLayout(null);                             //layout of p1 is null
		f.add(p1);                                      //p1 is added to the Frame
		//END OF DESIGN OF PANEL 1
		/////////////////////////////////////////////////////////////////////////////////////
		//DESIGN OF PANEL2
		Label school=new Label("School name");
		Label sch_board=new Label("School Board:");
		Label puc=new Label("Pre-University:");
		Label stream=new Label("Stream:");
		Label clge_name=new Label("College name");
		Label degree=new Label("Degree:");
		Label deg_name=new Label("College name");
		Label schship=new Label("Scholarship");
		TextField schoolt=new TextField();
		TextField clge_namet=new TextField(" your puc college name here");
		TextField deg_namet=new TextField(" you degree college name here");
		CheckboxGroup sbg=new CheckboxGroup();
			Checkbox state=new Checkbox("State",false,sbg);
			Checkbox cbse=new Checkbox("CBSE",false,sbg);
			Checkbox icse=new Checkbox("ICSE",false,sbg);
		CheckboxGroup pug=new CheckboxGroup();
			Checkbox pu=new Checkbox("PUC",false,pug);
			Checkbox diplo=new Checkbox("Diploma",false,pug);
		CheckboxGroup str=new CheckboxGroup();
			Checkbox sci=new Checkbox("Science",false,str);
			Checkbox com=new Checkbox("Commerce",false,str);
			Checkbox art=new Checkbox("Arts",false,str);
		Choice deg=new Choice();
			deg.add("Btech");
			deg.add("BE");
			deg.add("BSc");
			deg.add("Bcom");
			deg.add("BBA");
			deg.add("BCA");
			deg.add("BA");
			deg.add("MBBS");
			deg.add("BAMS");
			deg.add("BHMS");
			deg.add("Pharma");
		CheckboxGroup tf=new CheckboxGroup();
			Checkbox yes=new Checkbox("Yes",false,tf);
			Checkbox no=new Checkbox("No",false,tf);
		school.setBounds(10,10,80,30);
		schoolt.setBounds(100,13,180,20);
		sch_board.setBounds(10,50,80,30);
		state.setBounds(100,50,50,30);
		cbse.setBounds(160,50,50,30);
		icse.setBounds(220,50,50,30);
		puc.setBounds(10,90,80,30);
		pu.setBounds(100,90,50,30);
		diplo.setBounds(160,90,50,30);
		stream.setBounds(10,130,80,30);
		sci.setBounds(100,130,80,30);
		com.setBounds(190,130,80,30);
		art.setBounds(280,130,80,30);
		clge_name.setBounds(10,170,80,30);
		clge_namet.setBounds(100,173,180,20);
		degree.setBounds(10,210,50,30);
		deg.setBounds(73,212,70,30);
		deg_name.setBounds(10,250,80,30);
		deg_namet.setBounds(100,253,180,20);
		schship.setBounds(10,280,80,20);
		yes.setBounds(100,280,40,20);
		no.setBounds(150,280,40,20);
		p2.add(school);
		p2.add(schoolt);
		p2.add(sch_board);
		p2.add(state);
		p2.add(cbse);
		p2.add(icse);
		p2.add(puc);
		p2.add(pu);
		p2.add(diplo);
		p2.add(stream);
		p2.add(sci);
		p2.add(com);
		p2.add(art);
		p2.add(clge_name);
		p2.add(clge_namet);
		p2.add(degree);
		p2.add(deg);
		p2.add(deg_name);
		p2.add(deg_namet);
		//p2.add(schship);
		//p2.add(yes);
		//p2.add(no);
		p2.setBackground(Color.lightGray);
		p2.setLayout(null);
		p2.setBounds(470,60,430,300);
		f.add(p2);
		//END OF DESIGN OF PANEL2
		/////////////////////////////////////////////////////////////////////////////////
		f.setSize(1000,1000);
		f.setBackground(Color.gray);
		f.setLayout(null);
		f.setVisible(true);
	}
}