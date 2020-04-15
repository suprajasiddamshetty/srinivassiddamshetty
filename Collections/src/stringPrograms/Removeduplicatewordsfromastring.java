package stringPrograms;

public class Removeduplicatewordsfromastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India is my country supraja India is my country";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=null)
			
			{
				for(int j=i+1;j<s1.length;j++)
				{
					if(s1[i].equals(s1[j]))
					{
						s1[j]="";
					}
				}
				
			}
			System.out.print(s1[i]+" ");
		}
		
		

	}

}
