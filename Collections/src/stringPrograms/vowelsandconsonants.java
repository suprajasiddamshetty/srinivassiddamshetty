package stringPrograms;

public class vowelsandconsonants {
public static void main(String[] args) {
	String str="suprajasiddamshetty";
	char ch[]=str.toCharArray();
	int vowel=0;
	int consonants=0;
	for(char c:ch)
	{
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			vowel++;
			System.out.print(c);
			
		}
		else
		{
			consonants++;
		}
		
	}
	System.out.print(" ");
	System.out.println(vowel+" "+consonants);
	

	
	
	
	
	
}

}