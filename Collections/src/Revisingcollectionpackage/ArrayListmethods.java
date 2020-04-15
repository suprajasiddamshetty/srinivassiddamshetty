package Revisingcollectionpackage;

import java.util.ArrayList;

public class ArrayListmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
	
		//insert
		al.add("supraja");
		al.add("soujanya");
		al.add("santosh");
	
		System.out.println(al);
//		al.add(1,"siddamshetty");
//		System.out.println(al);
//		al.add(null);
//		System.out.println(al);
//		//update
//		al.set(4, "mee");
//		System.out.println(al);
//		//delete
//		al.remove(4);
//		System.out.println(al);
//		al.remove("supraja");
//		System.out.println(al);
//		//isEmpty()/clear()
//		//al.clear();
//		System.out.println(al);
//		System.out.println(al.isEmpty());
//		//adding one collection data into another(constructor approach)
		ArrayList<String> a2=new ArrayList<String>(al);
		a2.add("bhavya");
		System.out.println(a2);
	//	a2.retainAll(a2);
		System.out.println(a2.contains(al));
//		//adding one collection data into another using addAll()
//		ArrayList<String> a3=new ArrayList<String>();
//		a3.addAll(al);
//		a3.addAll(a2);
//		System.out.println(a3);
//		ArrayList<Employeeclass>a5=new ArrayList<Employeeclass>();
//		a5.add(new Employeeclass(1,"s1"));
//		a5.add(new Employeeclass(2,"s2"));
//		ArrayList<Employeeclass>a6=new ArrayList<Employeeclass>(a5);
//		a6.add(new Employeeclass(3,"s3"));
//		a6.add(new Employeeclass(4,"s4"));
//		a6.removeAll(a5);
//				
//		
//		for(Employeeclass e1:a6)
//		{
//			System.out.println(e1.eid+" "+e1.ename);
//		}
//		
//		
		
		
	}

}
