//public class StudyVariableTypes  
//{  
//    static int m=100;//static variable 
//   
//    void method()  
//    {    
//        int n=90;//local variable  
//        m=m-n;
//    }  
//    
//    public static void main(String args[])  
//    {  
//        int data=50;//instance variable 
//        StudyVariableTypes st=new StudyVariableTypes();
//        st.method();
//        System.out.println(m);
//    }  
//}


//Make common variable static 
//When we create object a new memory space is occupied for each value
//Some data has similar values for all the objects.
//In such cases to manage memory we declare the variable as static.
//So every object will share memory through static 

class StudyVariableTypes
{
	int empid;
	String name;
	static String company="ISS"; //as company name will be same for all the objects it will be declared static
	 StudyVariableTypes(int empid,String name)//,String company)
	 {
		 this.empid=empid;
		 this.name=name;
//		 this.company=company;
	 }
	 void display()
	 {
		 System.out.println(empid+" "+name+" "+company);
	 }
	public static void main(String []args)
	{
		StudyVariableTypes st1=new StudyVariableTypes(101,"Sahil");//,"ISS");
		st1.display();
		StudyVariableTypes st2=new StudyVariableTypes(102,"Jenil");
		st2.display();
	}
}

