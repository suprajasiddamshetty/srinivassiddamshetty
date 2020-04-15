package stringPrograms;

public class CheckoneStringisrotationofanother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India";
		String s1="diaIn";
		if(s.length()==(s1.length()))
		{
		String s2=s+s1;
		if(s2.contains(s1))
		{
			System.out.println(" s is rotation of s1");
		}
		}
		

	}

}
