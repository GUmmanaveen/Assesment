package comAssesment;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="coach it";
		    String revString="";
		    for(int i=s.length()-1;i>=0;i--)
		    {
		        revString+=s.charAt(i);
		    }
			System.out.println(revString);

	}

}
