package comAssesment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 System.out.println("Enter a number");
		int n=sc.nextInt();
	    int t=n;
	    int sum=0;
	    while(n!=0)
	    {
	      int r=n%10;
	        n=n/10;
	       sum =sum +(int)Math.pow(r,3);
	    }
	    n=t;
	    if(sum==t)
	    {
	        System.out.println(n+" is an armstrong number");
	    }
	    else{
	        System.out.println(n+" is not an armstrong number");
	    }
	}

}
