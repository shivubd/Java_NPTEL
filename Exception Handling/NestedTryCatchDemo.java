//Nested try-catch
public class NestedTryCatchDemo{
	public static void main(String args[]){
		try{
			int a=args.length;
			int b=42/a;
			if(a==1)
				a=a/(a-a);
			try{
				if(a==2){
					int c[]={1};
					c[2]=8;
				}
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array Index Out Of Bounds Exception:"+e);
			}
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception: Divide by zero="+e);
		}
	}
}