package stringPrograms;

public class swaptwostringwithoutusingtemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="supraja";
		String s1="siddamshetty";
		s=s+s1;
		s1=s.substring(0,s.length()-s1.length());
		s=s.substring(s1.length());
		System.out.println(s+" "+s1);
		
		

	}

}
