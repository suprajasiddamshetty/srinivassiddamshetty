package Programs;

import java.util.ArrayList;

public class PrimenumberusingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(3);
		a1.add(5);
		a1.add(10);
		a1.add(8);
		a1.add(7);
		System.out.println(a1);
		int flag=0;
		for(Integer a:a1)
		{
			for(int i=0;i<a1.size();i++)
			{
				for(int j=2;j<a1.get(i);i++)
				if(a%i==0)
				{
					flag=1;
				}
			}
		
		if(flag==0)
		{
			System.out.println(a);
		}
		}

	}

}
