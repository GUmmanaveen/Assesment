package comAssesment;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n=153;
		    int revNum=0;
		    while(n!=0)
		    {
		        int remainder=n%10;
		        revNum=revNum*10+remainder;
		        n=n/10;
		    }
			System.out.println(revNum);
	}

}
