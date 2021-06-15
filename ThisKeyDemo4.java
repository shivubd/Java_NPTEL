class Circle{
	int x,y,z;
	Circle(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	Circle(int z){
		this(0,0,z);
	}
	Circle(){
		this(0,0,0);
	}
	Circle(Circle c){
		this(c.x,c.y,c.z);
	}
	void display(){
		System.out.println(x+" "+y+" "+z);
	}
}
class ThisKeyDemo4{
	public static void main(String args[]){
		Circle c1=new Circle(10,20,30);
		Circle c2=new Circle(103);
		Circle c3=new Circle();
		Circle c4=new Circle(c1);
		c1.display();
		c2.display();
		c3.display();
		c4.display();
	}
}
		