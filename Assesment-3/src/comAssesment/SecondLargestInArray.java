package comAssesment;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
	    int [] a={1, 2, 3, -1, -2, 4};
	    for(int i=0;i<a.length;i++)
	    
	  Arrays.sort(a);
	    System.out.println("the second largest element in array "+a[a.length-2]);
	}

}
