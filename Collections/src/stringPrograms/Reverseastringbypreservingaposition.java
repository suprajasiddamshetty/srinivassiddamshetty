package stringPrograms;

public class Reverseastringbypreservingaposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Today is Monday hhh";
		char ch[]=s.toCharArray();
		char ch1[]=new char[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				ch1[i]=' ';
			}
		}
		int j=ch1.length-1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				if(ch1[j]==' ')
				{
					j--;
				}
				ch1[j]=ch[i];
				j--;
			}
		}
		System.out.print(s.valueOf(ch1));
			}
		}
		

                
	


