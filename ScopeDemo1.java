//Scope Demonstration
class ScopeDemo1{
	public static void main(String args[]){
		{
			int x=10;
			System.out.println("x="+x);//here the scope of x is only in these braces
		}
		//System.out.println("x="+x); here gives the error because x is not defined here 
	}
}