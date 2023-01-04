package PackagesEx;
import java.util.*;
import src.Square.*;//import packages created in src folder  
import src.Triangle.*;
import src.Circle.*;
public class PackageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int stp = 0;
		while (stp == 0) 
		{
			System.out.println("\n\nArea calculator: \n");
			System.out.println(" 1. Square \n 2. Circle \n 3. Triangle");
			System.out.println("\n\nEnter your choice:");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter one side of square : ");
				int s = sc.nextInt();
				Square sq = new Square(s);  //once imported packages we can now access classes and methods of those packages
				System.out.println("Area of Square : " + sq.disp());
				break;
				
				
			case 2:
				System.out.println("Enter radius of Circle: ");
				int r = sc.nextInt();
				Circle ci = new Circle(r);
				System.out.println("Area of Circle : " + ci.disp());
				break;
				
			case 3:
				System.out.println("Enter Side 1 : ");
				int s1 = sc.nextInt();
				System.out.println("Enter Side 2 : ");
				int s2 = sc.nextInt();
				System.out.println("Enter Side 3 : ");
				int s3 = sc.nextInt();
				Triangle t = new Triangle(s1, s2, s3);
				System.out.println("Area of Triangle : " + t.disp());
				break;
				
			
			default:
			    break;
		   }//switch end
			
			System.out.println("Do u want to stop? 1-Yes 0-No ...");
			stp = sc.nextInt();
	     }//while loop end
	}

}
