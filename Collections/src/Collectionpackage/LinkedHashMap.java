package Collectionpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		HashMap<Employee,Student>h2= new HashMap<Employee,Student>();
		h2.put(new Employee(1,"e1"),new Student(1,"s1"));
		h2.put(new Employee(2,"e2"),new Student(2,"s2"));
		h2.put(new Employee(3,"e3"),new Student(3,"s3"));
		h2.put(new Employee(4,"e4"),new Student(4,"s4"));
		Set<Employee>s1=h2.keySet();
		
		for(Employee e:s1)
		{
			System.out.println(e.empid+" "+e.empname);
		}
		Collection<Student>s2=h2.values();
		for(Student e1:s2)
		{
			System.out.println(e1.stdid+" "+e1.stdname);
		}
		Collection<Entry<Employee,Student>> s3 =h2.entrySet();
		Iterator<Entry<Employee,Student>> i1=s3.iterator();
		while(i1.hasNext())
		{
			Entry<Employee,Student>e=i1.next();
			Employee e1=e.getKey();
			
			
			System.out.println(e1.empid+" "+e1.empname);
			Student s21=e.getValue();
			System.out.println(s21.stdid+ " "+s21.stdname);
			
		}
		
		
		

		
		

	}

}
