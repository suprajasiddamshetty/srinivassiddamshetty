package stringPrograms;

public class ParticularRepeatedWordfromastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Today is Monday Today is Monday";
		String s1[]=s.split(" ");
		String s2="";
//		System.out.println(s);
//		String s1=s.replace("is ","");
//		System.out.println(s1);
		
		for(int i=0;i<s1.length;i++)
		{
			if(!(s1[i].equals("is")))
			{
				s2+=s1[i]+" ";
			}
			
		}
		System.out.println(s2);
//		for(int i=0;i<s1.length;i++)
//		{
//			if(s1[i].equals("is"))
//			{
//				s1[i]="";
//			}
//			System.out.print(s1[i]+" ");
//		}

	}

} 
