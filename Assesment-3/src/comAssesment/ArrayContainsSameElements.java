package comAssesment;

public class ArrayContainsSameElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  java.util.Scanner sc=new java.util.Scanner(System.in);
		  
		    int n=sc.nextInt();
		    
		    int a[]=new int[n];
		    int b[]=new int[n];
		    int c=0;
		    System.out.println("Enter elements of the Array a");
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		       
		    }
		    System.out.println("Enter elements of the Array b");
		    for(int i=0;i<n;i++)
		    {
		       
		        b[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            if(a[i]==b[j])
		            {
		                c++;
		            }
		        }
		    }
		    if(c==n)
		    {
			System.out.println("the elements in given two arrays matched");
		    }
		    else
		    {
		      	System.out.println("the elements in given two arrays not matched");  
		    }
	}

}
