package comAssesment;

public class NearestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   java.util.Scanner sc=new java.util.Scanner(System.in);
		    System.out.println("enter the number");
		    int number=sc.nextInt();
		    int temp=number;
		    int count=0;
		    for(int i=2;i<number;i++)
		    {
		        count=0;
		       
		        if(number%i==0)
		        {
		            number++;
		        }
		    }
		    System.out.println(number+" is the nearest prime to "+temp+" in increasing order");
		    number=temp;
		    for(int i=2;i<number;i++)
		    {
		    	
		        if(number%i==0)
		        {
		            number--; 
		        }
		    }
	     	System.out.println(number+" is the nearest prime to "+temp+" in decreasing order");
	}

}
