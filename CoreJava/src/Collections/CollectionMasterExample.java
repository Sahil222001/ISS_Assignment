package Collections;
import java.util.*;

public class CollectionMasterExample{
	public static void main(String[] args) {
//		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
//		
//		list.add("Sahil");//Adding object in arraylist  
//		list.add("Jenil");
//		list.add("Nupur");
//		
//		//Traversing list through Iterator  
//		Iterator itr=list.iterator();
//		
//		while(itr.hasNext()){  
//			System.out.println(itr.next());  
//		}  
		
		
		
		HashSet<String> set=new HashSet<String>();  
		set.add("Sahil");  
		set.add("Jenil");  
		set.add("Nupur");  
		set.add("Jenil");
  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}
	
}
