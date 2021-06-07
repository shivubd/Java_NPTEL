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
	Boxw(int x, int y,int z,int a){
		l=x;
		b=y;
		h=z;
		w=a;
	}
}
class InheritDemo2{
	public static void main(String args[]){
		Box b1=new Box();
		Boxw b2=new Boxw(10,2,3,5);
		System.out.println("Volume="+b1.vol());
		System.out.println("Volume="+b2.vol()+"weight="+b2.w);
	}
}