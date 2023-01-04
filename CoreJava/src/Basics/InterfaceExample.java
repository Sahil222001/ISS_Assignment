////It is used to achieve total abstraction.
//Since java does not support multiple inheritances in the case of class, by using an interface it can achieve multiple inheritances.
//Any class can extend only 1 class but can any class implement infinite number of interface.
interface subject {
void displayMarks();//declaring a function which will be used by many classes without declaring its body in the interface
}

class Theory implements subject {
	int marks = 90;
	
	public void displayMarks() 
	{
	  System.out.println("Theory :" + marks + " marks out of 100");
	 }
};

class Practical implements subject {
	int marks = 40;
	public void displayMarks() {
	System.out.println("Practicals :" + marks + " marks out of 40");
	}
};
public class InterfaceExample {
	public static void main(String[] args) {
		Theory obj1 = new Theory();
		obj1.displayMarks();
		Practical obj2 = new Practical();
		obj2.displayMarks();
	}
}
