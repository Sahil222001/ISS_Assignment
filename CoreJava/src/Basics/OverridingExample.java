
class Car {

    // method display 

   public void display() {

      System.out.println("This is car");

   }

}

// Class Topic

class Brand extends Car {

    // method display which is overriding method here

   public void display() {

       // this will call say method of Car Class

       super.display();

      System.out.println("Its of BMW Brand");

   }

}

public class OverridingExample {

	 public static void main(String args[]) {

	      Car a = new Car(); // Car reference and object

	      Car b = new Brand(); // Car reference but Brand object



	      a.display(); // runs the method in Physics class

	      b.display(); // runs the method in Topic class

}
}
