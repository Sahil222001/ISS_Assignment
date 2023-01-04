//PROGRAM TO UNDERSTAND GETTING INPUT USING SCANNER CLASS 
import java.util.Scanner;     //import Scanner class found in java.util package 
public class CustomerInformation {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in); //Create a object of scanner class
			String name;
			int age;
			long acc_no,phno;
			
			System.out.println("Enter name:");
			name=sc.nextLine();   //Invoke a nextLine method of Scanner class using its object for getting text input
			
			System.out.println("Enter age:");
			age=sc.nextInt();      //Invoke a nextInt method of Scanner class using its object for getting Integer input
			
			System.out.println("Enter account number:");
			acc_no=sc.nextLong();    //Invoke a nextLong method of Scanner class using its object for getting Long input
			
			System.out.println("Enter phone number:");
			phno=sc.nextLong();
			sc.close();
			
			System.out.println("----------Customer Details--------------");
			System.out.println("| Customer Name is:"+name+" |");
			System.out.println("| Customer Age is:"+age+" |");
			System.out.println("| Customer Account number is:"+acc_no+" |");
			System.out.println("| Customer Phone number is:"+phno+" |");
			System.out.println("------------------ ---------------------");

	}

}
