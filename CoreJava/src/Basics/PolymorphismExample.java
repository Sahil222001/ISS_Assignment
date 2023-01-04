//Program to calculate perimeter of different shapes
//cal() function is used in different forms having different no. of paramters for different shape

import java.util.*;

class Perimeter
{
	static int cal(int l){
		return 4*l;
	}
	
	static double cal(int l, int w){
		return 2*l+2*w;
	}
	static int cal(int a, int b, int c){
		return a+b+c;
	}
}


public class PolymorphismExample {

	public static void main(String[] args) {
		System.out.println("Enter your choice:");
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Calculate Perimeter of Square:");
		System.out.println("2. Calculate Perimeter of Rectangle:");
		System.out.println("3. Calculate Perimeter of Triangle:");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1: System.out.println("Enter length of side : ");
				int s=sc.nextInt();
				System.out.println("Perimeter of square is:"+Perimeter.cal(s));
				break;
				
		case 2: System.out.println("Enter length of rectangle : ");
				int l=sc.nextInt();
				System.out.println("Enter width of rectangle : ");
				int w=sc.nextInt();
				System.out.println("Perimeter of Rectangle is:"+Perimeter.cal(l,w));
		        break;
		        
		case 3: System.out.println("Enter lengths of all 3 sides : ");
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				System.out.println("Perimeter of Triangle is:"+Perimeter.cal(a,b,c));
				break;
			
		default: System.out.println("Wrong choice:");

	}
		sc.close();

   }
}
