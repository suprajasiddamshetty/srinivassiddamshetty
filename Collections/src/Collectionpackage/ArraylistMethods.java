package Collectionpackage;

import java.util.ArrayList;

public class ArraylistMethods {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("100");
		a3.add("200");
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(2,80);
		a3.remove("2000");
//		System.out.println(a1);
//		ArrayList<Integer> a2=new ArrayList<Integer>();
//		a2.addAll(a3);
//		a2.addAll(a1);
//		a2.add(50);
//		a2.add(60);
//		a2.contains(a1);
//		a2.clear();
//	
//		System.out.println();
		System.out.print(a3);
		
		
			}

}
