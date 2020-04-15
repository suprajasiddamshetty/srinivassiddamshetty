package Programs;

public class Removeduplicatecharactersfromastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india is my country";
	String s1[]=s.split("");
	//	char s1[]=s.toCharArray();
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
		if(s1[i].equals(" "))
	
			
		{
			s2+=s1[i];
		}
		else
		{
			if(!(s2.contains(s1[i])))
			{
				s2+=s1[i];
			}
		}
		                  


	}
	    System.out.println(s2);
	}
}
