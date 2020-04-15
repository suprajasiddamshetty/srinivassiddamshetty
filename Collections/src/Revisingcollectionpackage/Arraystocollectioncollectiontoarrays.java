package Revisingcollectionpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Arraystocollectioncollectiontoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		Integer a1[]= {10,20,30};
		
		
		ArrayList<Integer>a2=new ArrayList<Integer>(Arrays.asList(a1));
	Vector <Integer> aggg4=new Vector<Integer>();
	System.out.println(aggg4.capacity());
		a2.add(80);
		a2.add(90);
		a2.add(100);
//		for(int i=0;i<a2.size();i++)
//		{
			System.out.println(a2);
			Integer a3[]=new Integer[a2.size()];
			a2.toArray(a3);
			for(int i=0;i<a3.length;i++)
			{
			System.out.println(a3[i]);
			}
			ArrayList a4=new ArrayList<Integer>();
			a4.add(110);
			a4.add(120);
			Object[] i=a4.toArray();
			for(Object oo:i)
			{
				System.out.println(oo);
			}
	
			
			
	//}
	}

}
