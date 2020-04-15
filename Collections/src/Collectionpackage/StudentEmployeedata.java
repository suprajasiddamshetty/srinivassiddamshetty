package Collectionpackage;

import java.util.ArrayList;

public class StudentEmployeedata {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(new Employee(1, "supraja"));
		a1.add(new Student(2, "soujanya"));
		a1.add(new Employee(3,"santosh"));
		a1.add("ratan");
		a1.add(100);
		a1.add(10.5);
		a1.add(10.5f);
		a1.add(null);
		System.out.println(a1);
		for(Object aa:a1)
		{
			if(aa instanceof Employee)
			{
				Employee e1=(Employee)aa;
				System.out.println(e1.empid+" "+e1.empname);
				
			}if(aa instanceof Student)
			{
				Student s1=(Student)aa;
				System.out.println(s1.stdid+" "+s1.stdname);
			}if(aa instanceof Integer)
			{
				Integer i1= (Integer)aa;
				System.out.println(i1);
				
			}
			if(aa instanceof String)
			{System.out.println(aa);
				
			}
			if(aa instanceof Double)
			{
				System.out.println(aa);
			}
			if(aa instanceof Float)
			{
				System.out.println(aa);
			}
			if(aa == null)
			{
				System.out.println(aa);
			}
		}
		
		
			

	}

}
