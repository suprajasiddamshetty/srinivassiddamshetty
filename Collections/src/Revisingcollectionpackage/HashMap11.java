package Revisingcollectionpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMap11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, Employeeclass> h = new LinkedHashMap<Integer,Employeeclass>();
		h.put(1, new Employeeclass(1,"e1"));
		h.put(3, new Employeeclass(3,"e3"));
		h.put(4, new Employeeclass(4,"e4"));
		h.put(2, new Employeeclass(2,"e2"));
		Set<Integer>s1=h.keySet();
		Collection<Employeeclass>s2=h.values();
		Set<Entry<Integer,Employeeclass>>s3=h.entrySet();
		Iterator<Entry<Integer,Employeeclass>>itr=s3.iterator();
//		while(itr.hasNext())
//		{
//			Entry<Integer,Employeeclass>e1=itr.next();
//			Integer i=e1.getKey();
//			System.out.println(i);
//			Employeeclass i1=e1.getValue();
//			System.out.println(i1.eid+" "+i1.ename);
//		}
		for(Map.Entry ee:h.entrySet())
		{
			Integer i=(Integer) ee.getKey();
			System.out.println(i);
			Employeeclass eee=(Employeeclass) ee.getValue();
			System.out.println(eee.eid+" "+eee.ename);
			
		}
		
		
	

	}

}
