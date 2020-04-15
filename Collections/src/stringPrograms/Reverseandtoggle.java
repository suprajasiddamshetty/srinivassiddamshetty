package stringPrograms;

public class Reverseandtoggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is supraja";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
	
	StringBuffer sb=new StringBuffer(s1[i]);
	sb.reverse();
			System.out.print(sb.substring(0,1).toLowerCase()+sb.substring(1).toUpperCase()+" ");
		}

	}

}
