//Demonstration to Create a class and invoke methods etc
class Circle{
	double x,y,r;
	double circum(){
		return(2*(22/7)*r);
	}
	double area(){
		return(22/7*r*r);
	}
}
class EncapDemo1{
	public static void main(String args[]){
		Circle c=new Circle();
		c.x=0.0;
		c.y=0.0;
		c.r=5.0;
		System.out.println("Circumference = "+c.circum());
		System.out.println("Area = "+c.area());
	}
}
	