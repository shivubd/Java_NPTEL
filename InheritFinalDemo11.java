//Use of final keyword
abstract class A{
	final void fun(){
		System.out.println("Hello");
	}
}
class B extends A{
	void printfun(){
		super.fun();//can invoke final method by using supr keyword but can't override it
	}
}
class InheritFinalDemo11{
	public static void main(String args[]){
		B b=new B();
		b.printfun();
		b.fun();
	}
}