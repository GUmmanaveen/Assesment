package comAssesment;

import java.util.Arrays;

public class LargeAndSmallElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    java.util.Scanner sc=new java.util.Scanner(System.in);
	    
	    int [] a={1, 2, 3, -1, -2, 4};
	    for(int i=0;i<a.length;i++)
	    
	  Arrays.sort(a);
	  System.out.println("smallest number in the Array is "+a[0]);
	  System.out.println("largest number in the Array is "+a[a.length-1]);

	}

}
