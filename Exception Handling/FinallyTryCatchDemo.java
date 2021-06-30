//finally intry-catch block
class FinallyTryCatchDemo{
	public static void main(String args[]){
		int i=0;
		String greetings[]={"Hello Father","Hello Mother","Hello Sister"};
		while(i<4){
			try{
				System.out.println(greetings[i]);
				i++;
			}
			catch(Exception e){
				System.out.println(e.toString());
			}
			finally{
				if(i<3){
					System.out.println("Hi");
				}
				else{
					System.out.println("RESET THE INDEX");
					break;
				}
			}
		}
	}
}