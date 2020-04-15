package Programs;

public class Removerepeatedwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="inida is my country and it is inspiration to many countries inn the world";
		String s1[]=s.split(" ");
		String s2="";
//		for(int i=0;i<s1.length;i++)
//		{
//			if(s1[i]!=null)
//			{
//			for(int j=i+1;j<s1.length;j++)
//			{
//				if(s1[i].equals(s1[j]))
//				{
//					s1[j]=null;
//				}
//			}
//			System.out.print(s1[i]+" ");
//		}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for(int i=0;i<s1.length;i++)
			{
			
			
			if(!(s2.contains(s1[i])))
			{
				s2=s2+s1[i]+" ";
			}
			
		}
		System.out.println(s2);
//		

	}

}
