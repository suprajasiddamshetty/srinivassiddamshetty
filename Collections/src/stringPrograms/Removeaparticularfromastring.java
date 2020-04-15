package stringPrograms;

import java.util.Scanner;

public class Removeaparticularfromastring {
	public  static String removeParticularCharacter(String s,int p)
	{
		
		return s.substring(0,p)+s.substring(p+1);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string");
//		String s=sc.next();
//		System.out.println(s);
		String s="Today is Monday Today is Monday";
		System.out.println(removeParticularCharacter(s,6));
		
		
		
		

	}

}
