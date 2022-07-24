package comAssesment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=10;
		    int a=0;int b=1;
		    System.out.println("fibonacci series upto "+n+" terms is");
		    	    for(int i=1;i<=n;i++)
		    {
		        System.out.println(a);
		        int c=a+b;
		        a=b;
		        b=c;
		        
		    }

	}

}
