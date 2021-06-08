//use of protected access 
class A{
	private int data=10;
	protected void msg(){// in same file any class can invoke protected access memebers but only by subclasses present in other files
		System.out.println(data);
	}
}
class ProtectedAccessDemo1{
	public static void main(String args[]){
		A a=new A();
		a.msg();
	}
}
