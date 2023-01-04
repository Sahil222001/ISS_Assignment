
public class StudyDataTypes {
  int num=5;
  float pi=3.14f;
  long uid=2020301073;
  byte roll=120;
  short cash=1200;
  boolean adult=true;
  char gender='M';
  
  void display()
  {
	  System.out.println(num);
	  System.out.println(pi);
	  System.out.println(uid);
	  System.out.println(roll);
	  System.out.println(cash);
	  System.out.println(adult);
	  System.out.println(gender);
  }
  public static void main(String args[])
  {
	  StudyDataTypes st=new StudyDataTypes();
	  st.display();
  }
}
