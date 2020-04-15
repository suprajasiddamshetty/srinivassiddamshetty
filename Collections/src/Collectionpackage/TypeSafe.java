package Collectionpackage;

import java.util.ArrayList;

public class TypeSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(12,"s12"));
		a1.add(new Employee(13,"s13"));
		a1.add(null);
		a1.add(new Employee(13,"s13"));
		
		for(Employee e:a1)
		{
			if(e==null)
			{
				System.out.println(e);
			}
			else
			{

		System.out.println(e.empid+" "+e.empname);
			}
		}
		
//		int a[]= {10,20,30};
//		for(int aa:a)
//		System.out.println(aa);

		
		

	}

}
