class CmdDemo2{
	public static void main(String args[]){
		if (args.length>0)
		{
			for(String val:args)
				System.out.println(val);
			
		}
		else
			System.out.println("No command line input found");
	}
}