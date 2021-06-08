//use of private access
class A{
	private int a=10;
	public void msg(){
		System.out.println("Hello"+a);
	}
}
class PrivateAccessDemo1{
	public static void main(String args[]){
		int data=40;
		//private int data=40;
		//public int data=40;  these two statements give ERROR because in main() method we cant have access modifiers other than default
		A obj=new A();
		obj.msg();
		System.out.println(data);
	}
}

		
	
	
