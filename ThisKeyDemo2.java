//use of this keyword to invoke the same class methods in another method 
class A{
	void m(){
		System.out.println("Hello m");
	}
	void n(){
		System.out.println("Hello n");
		this.m();
	}
}
class ThisKeyDemo2{
	public static void main(String args[]){
		A a=new A();
		a.m();
		a.n();
	}
}
