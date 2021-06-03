//Use of DataInputStream to input
import java.io.DataInputStream;
class DatainputstreamDemo{
	public static void main(String args[]){
		try{
			Float p=new Float(0);
			Float r=new Float(0);
			Integer t=new Integer(0);
			String temp;
			DataInputStream in=new DataInputStream(System.in); //here System.in means the input is from Keyboard
			System.out.println("Enter Principle");
			System.out.flush();
			temp = in.readLine();
			p=Float.valueOf(temp);
			System.out.println("Enter Rate of Interest");
			System.out.flush();
			temp=in.readLine();
			r=Float.valueOf(temp);
			System.out.println("Enter Time");
			System.out.flush();
			temp=in.readLine();
			t=Integer.parseInt(temp);
			System.out.println("SI="+(p*t*r/100));
		}
		catch(Exception ex){}//here try{}  catch{} are used for Exception Handling
	}
}
		