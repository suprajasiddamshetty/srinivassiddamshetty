package Collectionpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,ProductClass>h1=new HashMap<Integer,ProductClass>();
		h1.put(1, new ProductClass(1,"p1",1000));
		h1.put(2, new ProductClass(2,"p2",1000));
		h1.put(3, new ProductClass(3,"p3",1000));
		h1.put(4, new ProductClass(4,"p4",1000));
		h1.put(5, new ProductClass(5,"p5",1000));
		//Set<Integer>s1=h1.keySet();
		//System.out.println(s1);
	//Collection<ProductClass>p1=h1.values();
		//for(ProductClass p2:p1)
		//{
		//	System.out.println(p2.pid+ " "+p2.pdname+ " "+p2.cost);
		//}
		Collection<Entry<Integer,ProductClass>>p2= h1.entrySet();
		Iterator<Entry<Integer,ProductClass>>i1=p2.iterator();
		while(i1.hasNext())
		{
			Entry<Integer,ProductClass> kk=i1.next();
			//Integer i11=kk.getKey();
			//System.out.println(i11);
			ProductClass i22= kk.getValue();
			
			if(i22.pid==5)
			{
				i1.remove();
			}
		}
		for(Entry<Integer,ProductClass> ff:h1.entrySet())
		{
			
			ProductClass i22= ff.getValue();
			System.out.println(i22.pid+" "+i22.pdname+" "+i22.cost);
			
		}
		
			
		
		

	}

}
