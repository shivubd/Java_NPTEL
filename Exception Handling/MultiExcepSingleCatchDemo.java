//Multiple errors with single catch
class MultiExcepSingleCatchDemo{
	public static int j;
	public static void main(String args[]){
		for(int i=0;i<4;i++){
			try{
				switch(i){
					case 0:int z=0;
					       j=99/z;
					       break;
					case 1:int b[]=null;
					       j=b[0];
					       break;
					case 2:int c[]=new int[2];
				       	   j=c[10];
						   break;
					case 3:char ch="java".charAt(9);
						   break;
				}
			}
			catch(Exception e){
				System.out.println("In test case: "+i);
				System.out.println(e.getMessage());
			}
		}
	}
}
			