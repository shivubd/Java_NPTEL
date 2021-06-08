//Multilevel inheritance
class Box{
	int l,b,h;
	Box(int p,int q,int r){
		l=p;b=q;h=r;
	}
	int vol(){
		return(l*b*h);
	}
}
class Boxw extends Box{
	int w;
	Boxw(int p,int q,int r,int s){
		super(p,q,r);
		w=s;
	}
}
class Shipment extends Boxw{
	int cost;
	Shipment(int p,int q,int r,int s,int cost){
		super(p,q,r,s);
		this.cost=cost;
	}
}
class InheritMLDemo7{
	public static void main(String args[]){
		Shipment s1=new Shipment(10,2,3,500,25000);
		Shipment s2=new Shipment(1,2,3,700,20);
		System.out.println("BOX1");
		System.out.println("Volume="+s1.vol()+" "+"Weight="+s1.w+" "+"Cost="+s1.cost);
		System.out.println("BOX2");
		System.out.println("Volume="+s2.vol()+" "+"Weight="+s2.w+" "+"Cost="+s2.cost);
	}
}