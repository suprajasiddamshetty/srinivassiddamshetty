package Collectionpackage;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveReplaceAddingusingListiterator {
	private static int empid;

	public static void main(String[] args) {
//	 ArrayList<String> a1=new ArrayList<String>();
//	 a1.add("s1");
//	 a1.add("s2");
//	 a1.add("s3");
//	 a1.add("s4");
//	 a1.add("s5");
//	 System.out.println(a1);
//	 ListIterator<String> li=a1.listIterator();
//	 li.add("s8");
//	 while(li.hasNext())
//	 {
//		 String s=li.next();
//		 if(s.equals("s1"))
//		 {
//			 li.remove();
//		 }
//		 if(s.equals("s2"))
//		 {
//			 li.set("s6");
//		 }
//	 }
//		System.out.print(a1);
//		
		ArrayList<Employee> a2=new ArrayList<Employee>();
		a2.add(new Employee(1,"r1"));
		a2.add(new Employee(2,"r2"));
		
		ListIterator<Employee> li1=a2.listIterator();
		 while(li1.hasNext())
		 {
			 Employee s=li1.next();
			 if(s.empname.equals("r1"))
			 {
				 li1.remove();
			 }
			 if(s.empname.equals("r2"))
			 {
				li1.set(new Employee(2,"r8"));
			 }
			 
		 }
			 for(Employee ee:a2)
			 {
				 System.out.println(ee.empid+" "+ee.empname);
			 }

}
}
