package Exceptions;
import java.util.*;
//checking whether the user is accessing the correct position or indexing in array using exception handling
public class ExceptionExample1 
{
	public static void main(String args[]) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("Elements in the array are:: ");
		
		for (int i = 0; i < arr.length; i++) {
		System.out.println("element at index " + i + ": " + arr[i]);
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter index of element to be displayed:");
		
		try {
			int ind = sc.nextInt();
			System.out.println("Element is : " + arr[ind]);
		} 
		
		
		catch (ArrayIndexOutOfBoundsException exp){
			System.out.println("Index invalid!");
			int n = (arr.length) - 1;  //getting the last accesible index from the array
			System.out.println("The last index accesible is : " + n);
		}
		
		finally {
			System.out.println("Thankyou for using our array!"); //finally block which is always executed at the end 
			sc.close();
		}
	}
}