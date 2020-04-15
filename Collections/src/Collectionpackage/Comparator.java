
package Collectionpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<ProductClass>p1=new ArrayList<ProductClass>();
//		p1.add(new ProductClass(4,"p1",2000));
//		p1.add(new ProductClass(1,"p0",8000));
//		p1.add(new ProductClass(2,"p2",6000));
//		Collections.sort(p1,  new ProductpidComparator());
//		for(ProductClass p:p1)
//		{
//			System.out.println(p.pid+" "+p.pdname+" "+p.cost);
			TreeMap<Integer,String>t1=new TreeMap<Integer,String>(new ProductpidComparator());
			t1.put(8,"s1");
			t1.put(2,"s2");
			t1.put(3,"s0");
			t1.put(4,"s4");
			System.out.println(t1);

		}
		

	}


