//Use of final keyword
abstract class A{
	final void fun(){
		System.out.println("Hello");
	}
}
class B extends A{
	void fun(){
		System.out.println("Hello world");
	}//Gives error because we can't override a final method
}
class InheritFinalDemo9{
	public static void main(String args[]){}
}