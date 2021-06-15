//Demo of sinlge inheritance
class A{
	int i,j;
	void showij(){
		System.out.println("i="+i+"j="+j);
	}
}
class B extends A{
	int k;
	void showk(){
		System.out.println("i="+i+"j="+j+"k="+k);
	}
}
class SingleInheritDemo1{
	public static void main(String args[]){
		A a=new A();
		B b=new B();
		a.i=10;
		a.j=20;
		a.showij();
		b.i=100;
		b.j=200;
		b.k=300;
		b.showk();
	}
}
	