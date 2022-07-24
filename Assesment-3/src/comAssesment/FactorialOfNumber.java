package comAssesment;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 System.out.println("Enter a Number");
		    int number =sc.nextInt();
		    int fact=1;
		    for(int i=1;i<=number;i++)
		    {
		        fact=fact*i;
		    }
		    System.out.println("factorial of a given number "+number+" is "+fact);

	}

}
