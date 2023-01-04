package Exceptions;
import java.util.*;
//Creating classes for each operation and creating objects while throwing exception 
class DivideExc extends Exception {
	public DivideExc(String str) {
		super(str);
    }
}


class Subs extends Exception {
	public Subs(String str) {
		super(str);
	}
}

class Add extends Exception {
	public Add(String str) {
		super(str);
	}
}
class Mul extends Exception {
	public Mul(String str) {
		super(str);
	}
}


class Choice extends Exception {
	public Choice(String str) {
	super(str);
	}
}


public class CalculatorException {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to perform operations on");
		
		int num1;
		int num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		int ch;
		System.out.println("Operation List ");
		System.out.println("\n 1. Additon \n 2. Substraction \n 3. Multiplication \n 4.Division");
		System.out.println("Enter the operation no. to be performed : ");
		
		
		try{
			ch = sc.nextInt();
			
			if (ch <= 0 || ch > 4) {
			throw new Choice("Invalid Choice exception");
			}
			
			switch (ch) {
			case 1:
				System.out.println("Performing Addition");
				try {
					if (num1 == 0 && num2 == 0) {
						throw new Add("0 addition exception");
					}
					int ans = num1 + num2;
					System.out.println(num1 + "+" + num2 + "=" + ans);
				} 
				
				catch (Add e) {
					System.out.println("Additon of 2 0's! Always 0");
				}
				
				break;
				
				
			case 2:
				System.out.println("Performing Substraction");
					try {
						if (num2 > num1) {
							throw new Subs("Susbs exception");
						}
						
						int ans = num1 - num2;
						System.out.println(num1 + "-" + num2 + "=" + ans);
					} 
					
					catch (Subs e) {
						System.out.println("The fisrt number should be greater!");
					}
				break;
			case 3:
				System.out.println("Performing Multiplication");
				try {
					if (num1 == 0 || num2 == 0) {
						throw new Mul("0 Multiplication exception");
					}
					int ans = num1 * num2;
					System.out.println(num1 + "*" + num2 + "=" + ans);
				} 
				
				catch (Mul e) {
					System.out.println("Multiplying anything with 0 gets you 0!");
				}
				
				break;
				
			case 4:
				System.out.println("Performing Division");
				try {
					if (num2 == 0) {
						throw new DivideExc("Divide exception");
					}
					System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
				} 
				
				catch (DivideExc e) {
					System.out.println("Cant divide by zero");
				}
				
				break;
				}
		} 
		
		catch (Choice e) {
		System.out.println("Invalid Choice of operation ....See serial number properly!");
		}
		
		
		finally {
		System.out.println("Happy Calculating!");
		}
}
}