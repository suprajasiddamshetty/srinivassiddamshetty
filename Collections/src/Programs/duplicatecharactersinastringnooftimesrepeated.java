package Programs;

public class duplicatecharactersinastringnooftimesrepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india is my country";
		String s1[]=s.split("");
	//	System.out.println(s1.length);
		
		for(int i=0;i<s1.length;i++)
		{
			int count=1;
			for(int j=i+1;j<s1.length;j++)
				{
				if(s1[i]!="")
				{
				if(s1[i].equals(s1[j]))
				{
				count=count+1;
				s1[j]="";
					
				}
				
				
			}}
			if(count>1)
			{
			System.out.println(s1[i]+ " "+count+"times");
			}                              
		
		}
		
		
	}

}
