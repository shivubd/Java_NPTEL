//use of acess with constructors
class A{
	private A(){
		System.out.println();
	}
}
class ConsAMDemo{
	public static void main(String args[]){
		A obj=new A();//Gives an ERROR because if Constructor is private it cant create object
	}
}