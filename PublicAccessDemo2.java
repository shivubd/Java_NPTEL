//use of Public Access in same file
class A{
	public int a=20;
	public void msg(){
		System.out.print("Value of A=");
	}
}
class PublicAccessDemo2{
	public static void main(String args[]){
		A obj=new A();
		obj.msg();
		System.out.println(" "+obj.a);
	}
}
