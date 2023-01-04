package Collections;
import java.util.*;
class Students{
	String name;
	int rn;
	
	Students(int rn,String name)
	{
		this.rn=rn;
		this.name=name;
	}
	
	public int getRn()
	{
		return rn;
	}
	// Sorting in ascending order of roll number

	public static Comparator<Students> Sturn=new Comparator<Students>(){
		public int compare(Students st1, Students st2) {
			int rn1 = st1.getRn();
			int rn2 = st2.getRn();
			return rn1 - rn2;
	    }
	};
	
		public String toString(){
			return rn+" | "+name;
		}
	
}
public class ComparatorExample{
	
	public static void main(String[] args) 
	{
		ArrayList<Students> arraylist = new ArrayList<Students>();
		arraylist.add(new Students(3, "Sahil")); //adding objects of Students class in arraylist
		arraylist.add(new Students(2, "Nirja"));
		arraylist.add(new Students(1, "Hriddhi"));
		arraylist.add(new Students(5, "Meet"));
		arraylist.add(new Students(6, "Akki"));
		  
		System.out.println("Before sort");
		  
		for (Students s : arraylist) { //printing objects directly will call to String method
			  System.out.println(s);
		}
		  
		System.out.println("After sort");
		
		Collections.sort(arraylist, Students.Sturn); //sorting  
	    
		for (Students s : arraylist) {
			  System.out.println(s);
		  }
	}
}



