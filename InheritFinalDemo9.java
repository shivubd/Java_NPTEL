//Use of final keyword
final class A{
	void fun(){
		System.out.println();
	}
}
class B extends A{    //Gives error because we can't inherit final A class
}
class InheritFinalDemo9{
	public static void main(String args[]){}
}