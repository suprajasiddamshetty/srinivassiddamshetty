package Collectionpackage;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Readdatafromproductclassusing3cursorsvideo21 {

	private static final String v1 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<ProductClass> v1=new Vector<ProductClass>();
		v1.add(new ProductClass(1,"p1",1000));
		v1.add(new ProductClass(2,"p2",2000));
		v1.add(new ProductClass(3,"p3",3000));
		v1.add(new ProductClass(4,"p4",4000));
		v1.add(new ProductClass(5,"p5",5000));
		Enumeration<ProductClass> e1=v1.elements();
		while(e1.hasMoreElements())
		{
			ProductClass pc1= e1.nextElement();
			System.out.println(pc1.pid+" "+pc1.pdname+" "+pc1.cost);
		}
		
		Iterator<ProductClass> i1=v1.iterator();
		while(i1.hasNext())
		{
			ProductClass pc2=i1.next();
			
			if(pc2.pid==5)
			{
				i1.remove();
			}
			
		}
		for(ProductClass pp:v1)
		{
			System.out.println(pp.pid+" "+pp.pdname+" "+pp.cost);
		}
		ListIterator<ProductClass> i4=v1.listIterator();
		i4.add(new ProductClass(6,"p6",600));
		while(i4.hasNext())
		{
			ProductClass pc3=i4.next();
		}
		for(ProductClass p:v1)
		{
			System.out.println(p.pid+" "+p.pdname+" "+p.cost);
		}
		}
	


	while(i4.hasPrevious())
	{
		
		ProductClass pc3=i4.previous();
		System.out.println(pc3.pid+" "+pc3.pdname+" "+pc3.cost);
//	
		}
//		
			
		}
}
		


	


