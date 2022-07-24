package comAssesment;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 System.out.println("Enter a number");
		    int n=sc.nextInt();
		  int  count =0;
		    for(int i=1;i<=n/2;i++)
		    {
		        if(n%i==0)
		        {
		            count+=i;
		        }
		    }
		   
		    if(count ==n)
		    {
		        System.out.println(n+" is perfect number");
		    }
		    else
		    {
		    	 System.out.println(n+" is not a perfect number");
		    }

	}

}
