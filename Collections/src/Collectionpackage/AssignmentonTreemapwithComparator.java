package Collectionpackage;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class AssignmentonTreemapwithComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<ProductClass,CustomerClass>p1=new TreeMap<ProductClass,CustomerClass>(new ProductpidComparator());
		p1.put(new ProductClass(1,"p1",1000),new CustomerClass(1,"c1"));
		p1.put(new ProductClass(4,"p4",4000),new CustomerClass(4,"c4"));
		p1.put(new ProductClass(2,"p2",2000),new CustomerClass(2,"c2"));
		p1.put(new ProductClass(3,"p3",3000),new CustomerClass(3,"c3"));
		
		Set<ProductClass> s=p1.keySet();
		for(ProductClass ee:s)
		{
			System.out.println(ee.pid+" "+ee.pdname+" "+ee.cost);
		}

	}

}
