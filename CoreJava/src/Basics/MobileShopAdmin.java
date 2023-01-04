//TO UNDERSTAND A NEW CLASS BUFFEREDREADER AND ITS METHOD. GET BASIC UNDERSTANDING OF CONSTRUCTOR. THIS KEYWORD
//UNDERSTANDING DO WHILE LOOP
import java.io.*;
public class MobileShopAdmin {
	
	String brand, color;
	int cam;
	
	MobileShopAdmin (String brand, String color, int cam) {
	this.brand = brand;
	this.color = color;
	this.cam = cam;
	}
	
	
	void Disp() {
	System.out.println("----------------------------");
	System.out.println("Mobile:");
	System.out.println("Brand:" + this.brand);
	System.out.println("Color:" + this.color);
	System.out.println("Camera :" + this.cam + " megapixels");
	System.out.println("----------------------------");
	}
	
	
	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new
	InputStreamReader(System.in));
	int ans;
	
		do {
		
		String brand, color;
		int cam;
		
		System.out.println("Enter Brand of mobile:");
		brand = br.readLine().trim();
		System.out.println("Enter Color of mobile:");
		color = br.readLine().trim();
		System.out.println("Enter Megapixels of Camera provided:");
		cam = Integer.parseInt(br.readLine().trim());
		
		
		MobileShopAdmin  ob1 = new MobileShopAdmin (brand, color, cam);
		ob1.Disp();
		
		System.out.println("Do you want to continue ? Yes = 1, No = 0");
		ans = Integer.parseInt(br.readLine().trim());
		
		
		} while (ans != 0);
    }
	
	
}
