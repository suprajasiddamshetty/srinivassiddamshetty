package Collectionpackage;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Cloneable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> a1=new ArrayList<Integer>();
//		a1.add(20);
//		a1.add(30);
//		System.out.println(a1);
//		ArrayList<Integer> copy=(ArrayList<Integer>)a1.clone();
//		System.out.println(copy);
//		
      TreeSet<Integer> a1=new TreeSet<Integer>();
      a1.add(10);
      a1.add(40);
      a1.add(20);
     SortedSet<Integer>s1= a1.subSet(10, 40);
      System.out.println(s1);
     SortedSet<Integer> s2= a1.tailSet(10);
     System.out.println(s2);
     SortedSet<Integer> s3=a1.headSet(20);
     System.out.println(s3);
      
	}

}
