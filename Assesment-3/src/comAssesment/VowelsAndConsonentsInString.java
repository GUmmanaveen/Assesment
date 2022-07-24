package comAssesment;

import java.util.Scanner;

public class VowelsAndConsonentsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a String");
		    String s=sc.next();
		   int vowelCount=0;
		    for(int j=0;j<s.length();j++)
		    {
		        if(s.charAt(j)=='a'|| s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'|| s.charAt(j)=='A' || s.charAt(j)=='E' || s.charAt(j)=='I' || s.charAt(j)=='O' || s.charAt(j)=='U')
		        {
		            	
		            		    vowelCount++;
		        }
		    }
		    System.out.println("vowel count in the String is "+vowelCount);
		    System.out.println("consonent count in the String is "+(s.length()-vowelCount));
		    
	}

}
