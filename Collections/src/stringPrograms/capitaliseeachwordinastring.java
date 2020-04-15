package stringPrograms;

public class capitaliseeachwordinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is supraja";
		String s1[]=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			String first=s1[i].substring(0,1).toUpperCase();
			String second=s1[i].substring(1).toLowerCase();
			s1[i]=first+second;
			System.out.print(s1[i]+" ");
		}
		
		for(String s2:s1)
		{
			String first=s2.substring(0,1).toUpperCase();
			String second=s2.substring(1).toLowerCase();
			s2=first+second;
			System.out.print(s2+" ");
		}
		

	}

}
