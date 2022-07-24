package comAssesment;

public class RemoveWhiteSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 System.out.println("Enter String input");
		    String n=sc.nextLine();
		   String newString="";
		    for(int i=0;i<n.length();i++)
		    {
		       if(n.charAt(i)==' ')
		       {
		           continue;
		       }
		       else
		       newString+=n.charAt(i);
		    }
		   
		  
			System.out.println(newString);

	}

}
