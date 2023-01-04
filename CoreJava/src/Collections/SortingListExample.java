package Collections;

import java.util.*;  

class Employee implements Comparable<Employee> {  
    public String name;
    
    public Employee(String name) {  
        this.name = name;  
  } 
    
  public int compareTo(Employee emp) {  
    return name.compareTo(emp.name);  
      
  }   
}  
public class SortingListExample {  
  public static void main(String[] args) {  
      ArrayList<Employee> al=new ArrayList<Employee>();  
      al.add(new Employee("ABC"));  
      al.add(new Employee("XYZ"));  
      al.add(new Employee("AMZ"));  
      al.add(new Employee("BCD"));  
      
    Collections.sort(al);
    
    for (Employee s : al) {  
      System.out.println(s.name);  
    }  
  }  
}  