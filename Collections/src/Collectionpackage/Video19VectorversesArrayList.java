package Collectionpackage;

import java.util.ArrayList;
import java.util.Vector;

public class Video19VectorversesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector(2,8);
		System.out.println(v1.capacity());
		v1.add(10);
		v1.add(20);
v1.add(30);
	v1.add(40);
	v1.add(50);
	v1.add(60);
	v1.add(70);
	v1.add(80);
	v1.add(90);
		v1.add(10);
		v1.add(11);
		ArrayList a1=new ArrayList(v1);
		a1.add(200);
		System.out.println(a1);
	


	}

}
