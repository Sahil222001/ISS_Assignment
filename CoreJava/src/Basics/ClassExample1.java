class HelloPrint{
	void printer()
	{
		int x=5;
        int i=0;
        for(i=0;i<x;i++)     //FOR LOOP
        {
        	System.out.println("Hello");
        }
	}
}
public class ClassExample1 {  //A class which contains main method should have the same name as file's name

	public static void main(String[] args) {
        HelloPrint p=new HelloPrint(); //Creating object of class
        p.printer();   //invoking method using object created
	}

}
