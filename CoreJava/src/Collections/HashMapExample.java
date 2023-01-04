package Collections;
import java.util.*;
class EmpInfo {
	String name;
	int empid;
	String empdept;
	String pos;
	String phno;
	double salary;
	
	
	EmpInfo(String ei1, int ei2, String ei3, String ei4, String ei5, double ei6) 
	{
		name = ei1;
		empid = ei2;
		empdept = ei3;
		pos = ei4;
		phno = ei5;
		salary = ei6;
 }
}

public class HashMapExample
{
	public static void main(String args[]) {
			
		HashMap<Integer, EmpInfo> myhash = new HashMap<Integer, EmpInfo>();
		
		EmpInfo ob1 = new EmpInfo("ABC", 101, "XYZ", "LMN", "9145313144", 50000);
		EmpInfo ob2 = new EmpInfo("ABD", 102, "LMZ", "RST", "9144122144", 25000);
		EmpInfo ob3 = new EmpInfo("ABE", 103, "RVZ", "OPQ", "9145414144", 30000);
		
		myhash.put(1, ob1);
		myhash.put(2, ob2);
		myhash.put(3, ob3);
		
		double saltot = 0.0;
		Iterator itr = myhash.entrySet().iterator();
		
		System.out.println("Sn" + " " + "Name" + " " + "ID" + " " + "Dept" + " " + "Pos" +" " + "PhNo" + " "+ "Sal");
		while (itr.hasNext()) {
			Map.Entry record = (Map.Entry) itr.next();
			EmpInfo j = (EmpInfo) record.getValue();
			System.out.println(record.getKey() + " " + j.name + " " + j.empid + " " +j.empdept + " " + j.pos + " "+ j.phno + " " + j.salary);
			
			saltot = saltot + j.salary;
		}
		
		System.out.println(saltot);
	}
}