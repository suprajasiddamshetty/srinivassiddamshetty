package Programs;

public class String33 {

	public static void main(java.lang.String[] args) {
		
		String s=" My name is sss";
		String s1[]=s.split(" ");
		System.out.println(s1);
		String s2=s1[4];
		System.out.println(s2);
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals(s2))
			{
				System.out.println(s1[i]);
			}
		}
		

	}

}
