package Programs;

public class DuplicateCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stu;
		String s="supraja siddamshetty srinivas";
		char s1[]=s.toCharArray();
		String s2="";
		String toggle="";
		for(int i=s1.length-1;i>=0;i--)
		{
			s2+=s1[i];
			
		}
		System.out.println(s2);
		String[] s3=s2.split(" ");
		for(String ss:s3)
		{
			String first=ss.substring(0,1).toLowerCase();
			String next=ss.substring(1).toUpperCase();
			toggle=toggle+first+next+" ";
			
			
		}
		System.out.println(toggle);
		
		
		
		
		
		}
}
		

	
	

			
	