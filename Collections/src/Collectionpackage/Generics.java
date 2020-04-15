package Collectionpackage;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>a=new ArrayList<Employee>();
		a.add(new Employee(1,"supraja"));
		a.add(new Employee(2,"soujanya"));
		a.add(new Employee(3,"santosh"));
		
		for(Employee aa:a)
		{
		System.out.println(aa.empid+" "+aa.empname);
		}
		
//		int a[]= {10,20,30};
//		for(int aa:a)
//		{
//		System.out.println(aa);
//		}
		
		
		

	}

}
