package Programs;

public class Reverseastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//with only one string
//		String s="supraja";
//		String y="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			char c=s.charAt(i);
//			y=y+c;
//			 
//		}
//
//		System.out.println(y);
	
	//with list of strings
		
	String s1="My name is supraja";
//	char c[]=s1.toCharArray();
//	String s2="";
//	for(int i=c.length-1;i>=0;i--)
//	{
//		char c1=c[i];
//		s2+=c1;
//	}
//	System.out.println(s2);
	String s2="";
	String s3[]=s1.split("");
	System.out.println(s3.length);
	for(int i=s3.length-1;i>=0;i--)
	{
		String s=s3[i];
		//System.out.println(s);
		s2=s2.concat(s);
		
		
	}
	System.out.print(s2);
	
	}
	

}
