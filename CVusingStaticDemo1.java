//use of static keyword to define class varibles
class Circle{
	static int circumcentre=0;
	public int x,y,r;
	Circle(int x, int y, int r){
		this.x=x;this.y=y;this.r=r;
	}
	Circle(int r){
		this(0,0,r);
		circumcentre++;
	}
	Circle(Circle c){
		this(c.x,c.y,c.r);
		circumcentre++;
	}
	Circle(){
		this(0,0,0);
		circumcentre++;
	}
}
class CVusingStaticDemo1{
	public static void main(String args[]){		
	Circle c1=new Circle();
	System.out.println(c1.circumcentre);
	Circle c2=new Circle(0);
	System.out.println(c2.circumcentre);
	Circle c3=new Circle(c1);
	System.out.println(c1.circumcentre+" "+c2.circumcentre+" "+c3.circumcentre);
}}