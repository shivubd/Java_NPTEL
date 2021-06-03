class Circle{
	double x,y,r;
	double circum(){
		return(2*(22/7)*r);
	}
	double area(){
		return(22/7*r*r);
	}
}
class Box{
	double l,b,h;
	double area(){
		return(l*b+l*h+h*b);
	}
	double vol(){
		return(l*b*h);
	}
}
class EncapDemo2{
	public static void main(String args[]){
		Circle c=new Circle();
		Box b=new Box();
		c.x=0.0;
		c.y=0.0;
		c.r=5.0;
		b.l=5.0;
		b.h=3.0;
		b.b=2.0;
		System.out.println("Circumference = "+c.circum());
		System.out.println("Area = "+c.area());
		System.out.println("Area of cuboid = "+b.area());
		System.out.println("Volume = "+b.vol());
	}
}
	