package Programs;

public class Stringparticularrepaetedwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Today is monday Today is monday";
		String s1[]=s.split(" ");
		String s2="";
		//System.out.println(s1.length);
		
		for(int i=0;i<s1.length;i++)
		{
			if(!s1[i].equals("is"))
				
			{
				//System.out.print(s1[i]+ " ");
				s2=s2+s1[i]+" ";
				
			}
		}
		System.out.println(s2);
		
		

	}

}
