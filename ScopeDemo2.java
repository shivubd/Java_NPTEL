//Scope Demo2
class ScopeDemo2{
	public static void main(String args[]){
		for(int i=0;i<5;i++){
			System.out.println(i);//cannot access i beyond the for loop
		}
	}
}