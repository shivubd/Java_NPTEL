//initialising the object with a method
class Circle{
	double x,y,r;
	void setPoint(double a,double b, double c){
		x=a;y=b;r=c;
	}
}
class Setpnt{
	public static void main(String args[]){
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		c1.setPoint(10,20,30);
		c2.setPoint(1,2,3);
		System.out.println("x1="+c1.x+"y1="+c1.y+"r1="+c1.r);
		System.out.println("x2="+c2.x+"y2="+c2.y+"r2="+c2.r);
	}
}
		
		