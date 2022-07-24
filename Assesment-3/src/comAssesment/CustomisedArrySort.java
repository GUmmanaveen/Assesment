package comAssesment;

public class CustomisedArrySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 java.util.Scanner sc=new java.util.Scanner(System.in);
		    
		    int [] a={1, 2, 3, -1, -2, 4};
		    for(int i=0;i<a.length;i++)
		    {
		        for(int j=i+1;j<a.length;j++)
		        {
		            if(a[i]>a[j])
		            {
		                a[i]=a[i]+a[j]-(a[j]=a[i]);
		            }
		        }
		    }
		    for(int i=0;i<a.length;i++)
		    {
		       System.out.println(a[i]);
		    }
	}

}
