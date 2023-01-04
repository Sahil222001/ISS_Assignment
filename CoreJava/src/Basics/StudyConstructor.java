//program to initialize the values from one object to another object.  
public class StudyConstructor {
    int emp_id;
    String name;
   //Default constructor    
	public StudyConstructor() {
	    emp_id=0;
	    name="NULL";
	}
	//Parameterized constructor where parameters have same name as local variables.Using this keyword to solve this
	public StudyConstructor(int emp_id,String name) {
	    this.emp_id=emp_id;
	    this.name=name;
	}
	//Copy constructor
	StudyConstructor(StudyConstructor s)
	{
		emp_id=s.emp_id;
		name=s.name;
	}
	void display()  //display information
	{
		System.out.println(emp_id);
  		System.out.println(name);
	}
	

	public static void main(String[] args) {
      		StudyConstructor s1=new StudyConstructor(1,"Sahil");
      		StudyConstructor s2=new StudyConstructor(s1); //Creating another object and passing first object as parameter 
      		s1.display();
      		s2.display();

	}

}
