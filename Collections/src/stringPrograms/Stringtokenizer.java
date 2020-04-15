package stringPrograms;

import java.util.StringTokenizer;

public class Stringtokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer s=new StringTokenizer("supraja siddamshetty suppppp 1234");
		while(s.hasMoreElements())
		{
			Object s1=s.nextElement();
			String s2=s1.toString();
			System.out.println(s2);
		}
		System.out.println(s.countTokens());
		

	}

}
