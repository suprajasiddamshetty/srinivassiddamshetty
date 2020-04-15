package stringPrograms;

public class Capitaliseandreverseeachwordinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is supraja";
		String s1[]=s.split(" ");
		String s2="";
		
//		 for(int i=s1.length-1;i>=0;i--)
//		{
//			String first=s1[i].substring(0,1).toUpperCase();
//			String second=s1[i].substring(1).toLowerCase();
//			s1[i]=first+second;
//			System.out.print(s1[i] +" ");
//		}
//		
		for(int i=s.length()-1;i>=0;i--)
		{
			s2+=s.charAt(i);
			
		}
		//System.out.println(s2);
		String s3[]=s2.split(" ");
		for(int i=0;i<s3.length;i++)
		{
//		{String first=s3[i].substring(0,1).toUpperCase();
//		String second=s3[i].substring(1).toLowerCase();
//		s1[i]=first+second;
			System.out.print(s3[i].substring(0,1).toUpperCase()+s3[i].substring(1).toLowerCase()+"");
		}
		

	}

}
