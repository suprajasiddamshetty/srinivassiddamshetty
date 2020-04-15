package stringPrograms;

public class reverseastringinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Type 1

//		String s1="this is javatpoint";
//		//String[] s1=s.split("");
//		String s2="";
//		for(int i=s1.length()-1;i>=0;i--)
//		{
//			s2+=s1.charAt(i);
//		}
//		System.out.println(s2);
		
		//Type2
		
		String s="this is javatpoint";
	//	String s1[]=s.split(" ");
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2+=s.charAt(i);
		}
		System.out.print(s2);
		
	}

}
