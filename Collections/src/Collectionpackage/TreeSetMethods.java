package Collectionpackage;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<ProductClass> t1=new TreeSet<ProductClass>();
		t1.add(new ProductClass(4,"s3",2000));
		t1.add(new ProductClass(2,"s1",1000));
		t1.add(new ProductClass(1,"s2",500));
		t1.add(new ProductClass(3,"s0",600));
		System.out.println(t1
		
	
		TreeSet<ProductClass> t2=new TreeSet<ProductClass>(t1.subSet(1, 4));
		
		System.out.println(t2);
		
		TreeSet<ProductClass> t3=new TreeSet<ProductClass>(t1.tailSet(1,"s2",5000));
		System.out.println(t3);
		
		TreeSet<String> t4=new TreeSet<String>(t1.headSet("s4"));
		System.out.println(t4);
		
		
		
		
		

	}

}
