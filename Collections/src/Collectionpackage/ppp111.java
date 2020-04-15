package Collectionpackage;

import java.util.ArrayList;
import java.util.Collections;


public class ppp111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CustomerClass> al=new ArrayList<CustomerClass>();
		al.add(new CustomerClass(1,"c1"));
		al.add(new CustomerClass(2,"c2"));
		al.add(new CustomerClass(3,"c3"));
		Collections.sort(al ,new CustomerClassSortingLogic());
	for(CustomerClass aa:al)
	{
		System.out.println(aa.cname+" "+aa.cid);
	}
		
		

	}

}
