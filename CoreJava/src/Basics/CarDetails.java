//Understanding states(Instance Variables)
//Instance variables hold values that must be referenced by more than one method, constructor or block, or essential parts of an object's state that must be present throughout the class.
//They can be used with access modifiers
public class CarDetails {
	
	//this instance variables are visible for this class as well rthe child classes
    public String car_name;
    public String car_color;
    public String car_engine;
    public String owner_name;
    public int owner_age;
     
   //this instance variable is only visible and can be accessed within this class
    private String owner_phone;
    
    
    public CarDetails(String name,String color,String engine)
    {
    	car_name=name;
    	car_color=color;
    	car_engine=engine;
    }
    
    public void setOwnerInfo(String oName,int oAge){
    	owner_name=oName;
    	owner_age=oAge;
    	
    }
    
    private void setOwnerPhone(String oPhone)
    {
    	owner_phone=oPhone;
    }
    public void displayDet()
    {
    	System.out.println("car name:"+car_name);
    	System.out.println("car color:"+car_color);
    	System.out.println("car engine:"+car_engine);

    	System.out.println("owner name:"+owner_name);
    	System.out.println("owner age:"+owner_age);
    	System.out.println("owner contact:"+owner_phone);
    }
    public static void main(String args[]){
    	CarDetails cd=new CarDetails("BMW","BLACK","V8");
    	cd.setOwnerInfo("ROCK",22);
    	cd.setOwnerPhone("9145234342");
    	cd.displayDet();
    }
}