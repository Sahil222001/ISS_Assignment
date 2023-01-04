//Class to enter name of parent
class Parent {
		
	    String name;
		
		Parent(String name) {
		this.name = name;
		}
		
		
		void showdata() {
		System.out.println("Name is " + name);
		}
};
//Class to create a child for parent
class Child1 extends Parent {
		
	String name;
	
	 Child1(String name, String parent1) {
		super(parent1);   //super keyword in Java is a reference variable which is used to refer immediate parent class object.
	 	this.name = name;
	 }
	
	
	  void showdata() {
		System.out.println("Parent of " + name + " is " + super.name);
		}
};
//class to create a grand-parent

class Child2 extends Child1 {
		String name;
	    
		Child2(String name, String parent1, String parent2) {
		super(parent1, parent2);
		this.name = name;
		}
		
		
		void showdata() {
		System.out.println("Parent of " + name + " is " + super.name);
		super.showdata();
		}
		
};

public class InheritanceExample {
	
		public static void main(String args[]) {
		Child1 c1 = new Child1("Niel", "Nitin");
		c1.showdata();
		Child2 c2 = new Child2("Niel", "Nitin", "Mukesh");
		c2.showdata();
	
		}
}
