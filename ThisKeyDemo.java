//use of this() keyword
class Student{
	String name,course;
	int rollno;
	float fees;
	Student(int rollno,String name,String course){
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	Student(int rollno,String name,String course,float fees){
		this(rollno,name,course);
		this.fees=fees;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+course+" "+fees);
	}
}
class ThisKeyDemo{
	public static void main(String args[]){
		Student s1=new Student(100,"Shivu","CS");
		Student s2=new Student(120,"Chandru","EE",60000);
		s1.fees=40000;
		s1.display();
		s2.display();
	}
}
		