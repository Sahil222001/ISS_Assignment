import java.util.*;
public class LiscenceApprover {

	public static void main(String[] args) {
		int age;
		String country;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your country :");
		country=sc.nextLine();
		if(country.equals("INDIA"))
		{
			System.out.println("Enter your age:");
			age=sc.nextInt();
			if(age>18)
			{
				System.out.println("You are eligible for liscense");
			}
			else
			{
				System.out.println("You are not eligible for liscense");
			}
		}
		
		else{
			System.out.println("You are not eligible for liscense");
		}
		sc.close();

	}

}
