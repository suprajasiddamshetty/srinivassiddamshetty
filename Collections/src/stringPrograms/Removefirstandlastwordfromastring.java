package stringPrograms;

public class Removefirstandlastwordfromastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india is supraja iii";
		String s1[]=s.split(" ");
		 for(int i=0;i<s1.length;i++)
		 {
			 if((i>0 && i<s1.length-1))
			 {
				// System.out.println(s1[i]);
				 s1[i]=s1[i];
			 }
			 else
			 {
				 s1[i]="";
			 }
			 System.out.print(s1[i]+" ");
		 }
		

	}

}
