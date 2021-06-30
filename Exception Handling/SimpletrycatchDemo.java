//Demonstration of Simple try catch
import java.lang.Throwable.*;
class SimpletrycatchDemo{
	static int anyFunc(int a,int b){
		try{
			System.out.println("Calculating....");
			int x=a/b;		
			System.out.println("Calculated sucessfully");
			return x;
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero");
		}
		return 0;
	}
	public static void main(String args[]){
		int a=0;
		int b=0;
		int result;
		try{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
		}
		catch(NumberFormatException e){
			System.out.println("Numberformat");
		}
			result=anyFunc(a,b);
			System.out.println("Result="+result);
		
	}
}
			