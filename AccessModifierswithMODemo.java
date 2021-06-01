//Use of Access specifiers in method overriding
class A{
	public void msg1(){
		System.out.println("msg1");
	}
	private void msg2(){
		System.out.println("msg2");
	}
	protected void msg3(){
		System.out.println("msg3");
	}
	void msg4(){
		System.out.println("msg4");
	}
}
class B extends A{
	public void msg1(){//here any other access specifiers cannot override
		System.out.println("msg1ONE");
	}
	void msg2(){
		System.out.println("msg2TWO");//Here we can use all other access beacuse all other are weaker access compared to private
	}
	public void msg3(){//only can use default or public,no other specifiers are weaker than these
		System.out.println("msg3THREE");	
	}
	protected void msg4(){//here we can use public also because both public and protected are weaker than default
		System.out.println("msg4FOUR");//here we can also use public access
	}
}//and we can override all methods with the same access modifiers as in superclass
class AccessModifierswithMODemo{
	public static void main(String args[]){
		B b=new B();
		b.msg1();
		b.msg2();//gives error as private method cannot be overriden
		b.msg3();
		b.msg4();
	}
}