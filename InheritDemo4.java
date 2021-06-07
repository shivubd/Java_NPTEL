//inheritance of constructors
class Box{
	int l,b,h;
	Box(){
		l=b=h=0;
	}
	Box(int x, int y,int z){
		l=x;
		b=y;
		h=z;
	}
	int vol(){
		return(l*b*h);
	}
}
class Boxw extends Box{
	int w;
	Boxw(){
		super();
		w=0;
	}
	Boxw(int x, int y,int z,int a){
		super(x,y,z);
		w=a;
	}
}
class InheritDemo4{
	public static void main(String args[]){
		Boxw b2=new Boxw(10,2,3,5);
		Box b1=new Box();
		System.out.println("Volume="+b1.vol());
		b1=b2;//copies l,b,h of sub class to l,b,h of super class leaving w
		System.out.println("Volume="+b1.vol());
		System.out.println("Volume="+b2.vol()+"weight="+b2.w);
	}
}