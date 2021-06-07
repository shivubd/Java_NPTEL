//Abstract class
abstract class Base{
	Base(){
		System.out.println("Base class constructor is called");
	}
	abstract void fun();
}
class Derieved extends Base{
	Derieved(){
		super();
		System.out.println("Derieved class is called");
	}
	void fun(){
		System.out.println("Derieved fun() is called");
	}
}
class InheritABSDemo8{
	public static void main(String args[]){
		Derieved d=new Derieved();
		d.fun();
		System.out.println();
		Base c=new Derieved();
		c.fun();
	}
}
	