class A{
	A(){
		this(5);
		System.out.println("HELLO");
	}
	A(int x){
		System.out.println(x);
	}
}
class ThisKeyDemo3{
	public static void main(String args[]){
		A a=new A();
	}
}