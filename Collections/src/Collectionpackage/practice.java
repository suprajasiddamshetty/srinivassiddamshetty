package Collectionpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TreeMap<ProductClass,CustomerClass>al=new TreeMap<ProductClass,CustomerClass>(new ProductpidComparator());
	/*
	TreeMap<CustomerClass,ProductClass>a2=new TreeMap<CustomerClass,ProductClass>();*/
	al.put(new ProductClass(1,"s1",1000),new CustomerClass(1,"s1"));
	al.put( new ProductClass(2,"s2",2000),new CustomerClass(13,"s2"));
	al.put( new ProductClass(3,"s3",3000),new CustomerClass(2,"s3"));
	al.put( new ProductClass(44,"s4",4000),new CustomerClass(6,"s4"));
	al.put( new ProductClass(5,"s5",5000),new CustomerClass(9,"s9"));
//Set<ProductClass>ss=al.keySet();
//for(ProductClass ee:ss)
//{
//System.out.println(ee.pid+ " "+ee.pdname+" "+ee.cost);
//}
//	Collection<ProductClass> pp=al.values();
//	for(ProductClass ee:pp)
//	{
//		System.out.println(ee.pid+" "+ee.pdname+" "+ee.cost);
//	}
//	Iterator<ProductClass> itr=pp.iterator();
//	while(itr.hasNext())
//	{
//		ProductClass p1=itr.next();
//		if(p1.pid==3)
//		{
//			itr.remove();
//		}
//		
//	}
//	for(ProductClass p1:pp)
//	{
//		System.out.println(p1.pid+" "+p1.pdname+" "+p1.cost);
//	}
	
//SetEntry<Integer,ProductClass>> e1=al.entrySet();
//	for(Entry<Integer,ProductClass> e2:e1)
//	{
//		
//		Integer i1=e2.getKey();
//		System.out.println(i1);
//		ProductClass p1=e2.getValue();
//		System.out.println(p1.pid+" "+p1.pdname+" "+p1.cost);
//	}
//	
Collection<CustomerClass> cc=al.values();
for(CustomerClass c1:cc)
{
	System.out.println(c1.cid+" "+c1.cname);
}

	
	}

}
