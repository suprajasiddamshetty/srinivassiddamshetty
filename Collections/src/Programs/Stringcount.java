package Programs;

public class Stringcount {
	
	//Reomove a particular word from  as tring

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s="Today is Monday today is monday";
//		System.out.println(s.substring(0,6)+s.substring(7));
		
		//Method 3
//      System.out.println(wordRemove(s,5));
		
		
	
	
		
		
		
		
		


		//Method2
		
//		String s1=s.substring(0,5)+s.substring(8);
//		System.out.println(s1);
//			
		
		
		
		//Method1
	int count=0;
		String s2="";
		//System.out.println(s1.length);
		for(int i=0;i<s.length();i++)
		
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
			if(count!=1)
			{
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);
		
		
}
	
//	public static String wordRemove(String s,int p)
//	{
//		return s.substring(0,p)+s.substring(p+3);
//	}
}