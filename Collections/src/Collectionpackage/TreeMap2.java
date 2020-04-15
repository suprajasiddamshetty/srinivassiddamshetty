package Collectionpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,ProductClass>t1=new TreeMap<Integer,ProductClass>();
		t1.put(1,new ProductClass(4,"p1",1000));
		t1.put(0, new ProductClass(2,"p2",2000) )
		System.out.println(t1);
		
//		SortedMap s1=t1.subMap(2, 8);
//		TreeMap<Integer,String> t2=new TreeMap<Integer,String>(s1);
//		System.out.println(t2);
//		System.out.println(t1.tailMap(2));
//		System.out.println(t1.headMap(4));

	}

	}


