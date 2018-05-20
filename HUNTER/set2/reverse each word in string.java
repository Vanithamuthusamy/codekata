

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		String reverseString="";
		for(int i=0;i<s1.length;i++)
		{
		String s2=s1[i];
    String reverseWord = "";
    for (int j = s2.length()-1; j >= 0; j--) 
    {                  
    reverseWord = reverseWord + s2.charAt(j);
    }
    reverseString = reverseWord +" ";
    System.out.print(reverseString);
    }}                
   }
