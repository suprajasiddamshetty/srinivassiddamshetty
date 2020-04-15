package Collectionpackage;

import java.util.ArrayList;

public class collectionClass {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("supraja");
		a1.add('c');
		a1.add(10);
		a1.add(true);
		a1.add(10.5);
		a1.add(10.5f);
		System.out.println(a1);
		
		a1.add("supraja");
		a1.add(Character.valueOf('c'));
		a1.add(Integer.valueOf(10));
		a1.add(Boolean.valueOf(true));
		a1.add(Float.valueOf(10.5f));
		a1.add(Double.valueOf(10.5));
		System.out.println(a1);	
		

	}

}
