//Method Overloading
class Cat{
	void speak(){
		System.out.println("Meaw.......");
	}
}
class Petcat extends Cat{
	void speak(){
		System.out.println("petMeeeeeeaw");
	}
}
class Wildcat extends Cat{
	boolean b;
	void speak(){
	if(b)
		super.speak();
	else
		System.out.println("wildmeawww");

}}
class InheritMODemo6{
	public static void main(String args[]){
		Cat c=new Cat();
		Petcat p=new Petcat();
		Wildcat w=new Wildcat();
		c.speak();
		p.speak();
		w.speak();
		w.b=true;
		w.speak();
	}
}

		
		
		