//use of MULTIPLE CONSTRUCTORS by constructor OVERLOADING
class Circle{
	double x,y,r;
	Circle(double a,double b,double c){
		x=a;y=b;r=c;
	}
	Circle(){
		x=0;y=0;r=0;
	}
	Circle(double c){
		x=0;y=0;r=c;
	}
	Circle(Circle c){
		x=c.x;y=c.y;r=c.r;
	}
}
class MultiConstrDemo{
	public static void main(String args[]){
		Circle c1 = new Circle(10,20,30);
		Circle c2 = new Circle(130);
		Circle c3 = new Circle();
		Circle c4 = new Circle(c1);
		System.out.println("x1="+c1.x+"y1="+c1.y+"r1="+c1.r);
		System.out.println("x2="+c2.x+"y2="+c2.y+"r2="+c2.r);
		System.out.println("x3="+c3.x+"y3="+c3.y+"r3="+c3.r);
		System.out.println("x4="+c4.x+"y4="+c4.y+"r4="+c4.r);
	}
}
		