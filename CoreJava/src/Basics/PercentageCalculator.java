//TO UNDERSTAND String,int,float DATA-TYPES IN JAVA & THEIR CORRESPONDING METHODS IN SCANNER CLASS

import java.util.Scanner;   //import Scanner class in java.util package
public class PercentageCalculator {
	
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //Creating object of scanner class
		
		String name;
		int rollno;
		float m1,m2,m3,m4,m5,percent;
		
		System.out.println("Enter name:");
		name=sc.nextLine();    //Invoke a nextLine method of Scanner class using its object for getting Text input
		
		System.out.println("Enter rollno:");
		rollno=sc.nextInt();  	//Invoke a nextInt method of Scanner class using its object for getting Integer input
		
		System.out.println("Enter Physics marks:");
		m1=sc.nextFloat();     //Invoke a nextFloat method of Scanner class using its object for getting Float input
		
		System.out.println("Enter Chemistry marks:");
		m2=sc.nextFloat();
		
		System.out.println("Enter Maths marks:");
		m3=sc.nextFloat();
		
		System.out.println("Enter English marks:");
		m4=sc.nextFloat();
		
		System.out.println("Enter Social studeis marks:");
		m5=sc.nextFloat();
		sc.close();    //SCANNER OBJECT CLOSED AFTER TAKING INPUT FROM USERS
		
		percent=(m1+m2+m3+m4+m5)/500*100;  //Calculating percentage
		
		//Display report
		
		System.out.println("---------------Student Report ----------------");
		System.out.println("Student's Name :"+name);
		System.out.println("Roll no :"+rollno);
		System.out.println("Physics:"+m1);
		System.out.println("Chemistry:"+m2);
		System.out.println("Maths:"+m3);
		System.out.println("English:"+m4);
		System.out.println("Social Studies:"+m5);
		System.out.println("----------------------------------");
		System.out.println("Percentage: "+percent+" %");
 
	}

}
