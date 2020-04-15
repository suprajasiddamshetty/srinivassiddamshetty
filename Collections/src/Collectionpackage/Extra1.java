package Collectionpackage;

import java.util.ArrayList;
import java.util.Collections;

public class Extra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("s1");
		a1.add("s2");
		a1.add("s3");
		a1.add("s4");
		int c1=getCapacity(a1);
		System.out.println(a1.size());
		System.out.println("size="+a1.size()+" capacity="+getcapacity(a1));
	
		ArrayList<String> a2=new ArrayList<String>(a1.subList(1, 4));
		a2.add("s5");
		System.out.println(a2);
		System.out.println(a2.retainAll(a1));
		System.out.println(a2);
		Collections.swap(a1, 1, 2);
		System.out.println(a1);

	}

}
