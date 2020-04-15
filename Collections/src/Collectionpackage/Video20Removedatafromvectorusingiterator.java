
package Collectionpackage;

import java.util.Iterator;
import java.util.Vector;


public class Video20Removedatafromvectorusingiterator{
	public static void main(String[] args) {

	Vector v1=new Vector();

	for(int i=1;i<=30;i++)
	{
		v1.add(i);
		
	}
	System.out.println(v1);
	
		Iterator li=v1.iterator();
		while(li.hasNext())
		{
			int a=(int)li.next();
			if(a%2==0)
			{
				System.out.println(a);
				
			}
			else
			{
				li.remove();
			}
		}
		System.out.println(v1);
}
}
