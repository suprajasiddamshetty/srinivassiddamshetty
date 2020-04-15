package Collectionpackage;

import java.util.ArrayList;
import java.util.Scanner;

class Child
{
public static void main(String[] args)
{

String s=new String("supraja12");
String s1=new String("supraja1");
//boolean b=(s==s1);
//System.out.println(b);
StringBuffer s2=new StringBuffer("supraja");
StringBuffer s3=new StringBuffer("supraja");
//System.out.println(s2==s3);
String s4="supraja1";
String s5="supraja12";
//System.out.println(s4==s5);
//s4.concat("dddd");
//System.out.println(s4);

//equals method

//System.out.println(s4.equals(s5));
//System.out.println(s==s1);

//CompareTo method
//s2.append("ss");
//String s51=s.concat("dd");
//System.out.println(s51);
//	

//String a1="java";
//String a2="programming";
//String a3="language";
//System.out.println(a1.concat(" @ ").concat(a2).concat(" ").concat(a3));

//String array="supraja";
//ArrayList<String> array1=new ArrayList<String>();
//
//array1.add("supraja");
//array1.add("s1");
//for(String array2:array1)
//{
//	if(array2.equals(array))
//	{
//		System.out.println("supraja is present");
//	}
//}
//

//int a[]=new int[20];
//a[0]=1;
//a[1]=2;
//System.out.println(a);
String dd=new String("My name is supraja");
char c[]=new char[10];

dd.getChars(0,6, c,0);
//                     for(int i=0;i<c.length;i++)
//{
//	//System.out.println(c[i]);
//}
//System.out.println(c);
//String dd1=dd.substring(1,8);
//System.out.println(dd1);
//
//
//String str = new String("hello javatpoint how r u");  
//char[] ch = new char[10];  
//
//   str.getChars(6, 16, ch, 0);  
//   System.out.println(ch);  
//	   
String hh="My name supraja supraja";
//int count=0;is s
//for(int i=0;i<hh.length();i++)
//{
//	char chh=hh.charAt(i);
//	if(chh=='a')
//	{
//		count++;
//	}
//}
//System.out.println(count);
//    int index1=hh.indexOf('a',16);
//System.out.println(index1);
//int index2=hh.indexOf("supraja");
//System.out.println(index2);
//int index3=hh.indexOf("supraja",20);
//System.out.println(index3);
//	
//byte b[]=hh.getBytes();
//System.out.println(b.length);
//for(int i=0;i<b.length;i++)
//{
//	if(b[i]==32)
//	{
//	System.out.println(b[i]);
//	}
//}
//String date = String.join("/","");    
//System.out.print(date);    
//String time = String.join(":","%", "12","10","10");  
//System.out.println(" "+time);  

//String s1oo="this is index of example";  
////passing substring  
//int index1=s1oo.indexOf("is");
//System.out.println(index1);
//	
//String str="javatpoint";
//String ch[]=str.split("t",1);
//for(String c1:ch)
//	
//{
//	System.out.println(c1);
//}

//String str = "Javatpoint";  
//String str11=str.concat("trial");
////System.out.println(str.startsWith("J")); // True  
////System.out.println(str.startsWith("a")); // False  
////System.out.println(str.startsWith("t",1)); // True 
//System.out.println("Using substring");
//System.out.println(str.substring(0,4));
//char ch[]=new char[4];
//System.out.println(ch);
//str.getChars(0, 4, ch, 0);
//System.out.println("using getchar");
//System.out.println(str11+"jjj");

//String sww1="hello string";  
//System.out.println(sww1+"javatpoint");//without trim() 
//System.out.println(sww1.concat("javatpoint")); 
//System.out.println(sww1.trim()+"javatpoint");//with trim()  
//	
//String a="abc";
//String a1=new String("abc");
//System.out.println(a.equals(a1));
//
//String a11="supraja";
//String a12=a11+"soujanya";
//String a13="suprajasoujanya";
//String result=a11.concat(a12.concat(a13));
//System.out.println(a12==a13);
StringBuffer sb=new StringBuffer("supraja");
//sb.insert(1, 'c');
sb.ensureCapacity(100);

String sdd="what do you about me";
String sff=sdd.replace('d','h');
System.out.println(sff);



	
	
	
	
	
	
	
}
}
