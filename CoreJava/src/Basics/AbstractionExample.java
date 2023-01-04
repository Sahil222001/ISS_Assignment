abstract class Animal {
  // Abstract method with no body
  public abstract void sound();
  // Regular method
  public void eyes() {
    System.out.println("And Has 2 eyes");
  }
}

// Subclass (inherit from Animal)
class Dog extends Animal {
  public void sound() {
    // The body of abstract method sound()
    System.out.println("The Dog says bow wow");
  }
}

class Cat extends Animal {
	  public void sound() {
	    // The body of abstract method sound()
	    System.out.println("The Cat says meow");
	  }
	}


public class AbstractionExample {
	public static void main(String[] args) {
	   Dog d=new Dog();
	   d.sound();d.eyes();
	   
	   Cat c=new Cat();
	   c.sound();c.eyes();
	  }
}
