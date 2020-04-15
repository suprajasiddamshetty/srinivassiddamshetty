package stringPrograms;

public class retrieveawordataspecificposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India is my life";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==(' '))
			{
				count++;
			}
			
		
		if(count==1 && s.charAt(i)!=' ')
		{
			System.out.print(s.charAt(i));
		}
		}

	


	}

}
