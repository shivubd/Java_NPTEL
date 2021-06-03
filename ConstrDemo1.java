//Use of CONSTRUCTOR to initialize
class Circle{
	double x,y,r;
	Circle(double a,double b,double c){
		x=a;y=b;r=c;
	}
}
class ConstrDemo1{
	public static void main(String args[]){
		Circle c1 = new Circle(10,20,30);
		Circle c2 = new Circle(100,200,300);
		System.out.println("x1="+c1.x+"y1="+c1.y+"r1="+c1.r);
		System.out.println("x2="+c2.x+"y2="+c2.y+"r2="+c2.r);
	}
}