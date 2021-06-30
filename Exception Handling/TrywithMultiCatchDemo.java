//Demonstration to use try with multiple catch
class TrywithMultiCatchDemo{
	public static void main(String args[]){
		try{
			int i=args.length;
			String mystring[]=new String[i];
			if(args[0].equals("Java")){
				System.out.println("First word is Java");
			}
			System.out.println("No of arguments "+i);
			int x=42/i;
			int y[]={1,2};
			y[i]=20;
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero:"+e);
		}
		catch(NullPointerException e){
			System.out.println("Nullpointer exception:"+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bound:"+e);
		}
	}
}