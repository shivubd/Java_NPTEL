//Demo to use Scanner
import java.util.Scanner;
class ScnrDemo1{
	public static void main(String args[]){
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=s.nextInt();
		b=s.nextInt();
		if(a>b)
			System.out.printf("%d is greater than %d",a,b);
		else
			System.out.printf("%d is greater than %d",b,a);
		
	}
}
/*for intger nextInt()
  for float nextFloat()
  for double nextDouble()
  for long nextLong()
 */