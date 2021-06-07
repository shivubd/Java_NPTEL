//use of super for avoiding varible collision
class A{
	int i;
}
class B extends A{
	int i;
	B(int a,int b){
		super.i=a;
		i=b;
	}
	void show(){
		System.out.println("A="+super.i+"B="+i);
	}
}
class InheritDemo5{
	public static void main(String args[]){
		B b=new B(10,20);
		b.show();
	}
}
