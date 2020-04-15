package stringPrograms;

public class Removewordatparticularindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Today is monday Today is monday";
		String s1[]=s.split("");
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals(" "))
			{
				count++;
			}
			if(count==1)
			{
				s1[i]="";
			}
			System.out.print(s1[i]);
		}

	}

}
