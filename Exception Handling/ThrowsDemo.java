//use of Throws keyword
import java.lang.*;
public class ThrowsDemo{
	public static void main(String args[]) throws Exception{
		int array[]=new int[3];
		try{
			for(int i=0;i<4;i++){
				array[i]=i;
			}
			System.out.println(array);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("fillIn="+e.fillInStackTrace());
			System.out.println("cause="+e.getCause());
			System.out.println("local="+e.getLocalizedMessage());
			System.out.println("messa="+e.getMessage());
			System.out.println("trace="+e.getStackTrace());
			System.out.print("trace=");
			e.printStackTrace();
			System.out.println();
			System.out.print("string=");
			e.toString();
			System.out.println();
			System.out.println("OopS we went too far lets come back");
			throw (Exception) new Exception().initCause(e);
		}
		finally{
			System.out.println(array[0]);
		}
	}
}
		