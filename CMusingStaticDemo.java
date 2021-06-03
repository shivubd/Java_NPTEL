//Class methods using static
class Circle{
	int r;
	Circle(int r){
		this.r=r;
	}
	public Circle bigger(Circle c){
		if(c.r>r) return c;
		else return this;
	}
	public static Circle bigger(Circle a,Circle b){
		if(a.r>b.r) return a;
		else return b;
	}
	
}
class CMusingStaticDemo{
	public static void main(String args[]){
		Circle c1=new Circle(50);
		Circle c2=new Circle(20);
		Circle a=c1.bigger(c2);
		System.out.println("Bigger is"+a.r);
		Circle b=Circle.bigger(c1,c2);
		System.out.println("Bigger is"+b.r);
	}
}	