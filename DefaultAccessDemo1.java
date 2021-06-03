//Use of default acess modifier in same file
class A{
	void msg(){
		System.out.println("Hello I am Class A");
	}
}
class DefaultAccessDemo1{
	public static void main(String args[]){
		A obj=new A();
		obj.msg();
	}
}
