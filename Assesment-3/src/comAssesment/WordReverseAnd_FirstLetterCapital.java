package comAssesment;

public class WordReverseAnd_FirstLetterCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter String input");
		String s=sc.nextLine();
		String newString="";
		String sArray[]=s.split(" ");
		for(int i=0;i<sArray.length;i++)
		{
			String stringRev = "";
						for(int j=0;j<sArray[i].length();j++)
			{
				char c;
			   if(j==sArray[i].length()-1)
					{
						c=Character.toUpperCase(sArray[i].charAt(j));
					}
			   else
				{
				c=sArray[i].charAt(j);
				}
				stringRev=c+stringRev;
				
			}
			
			newString=newString+stringRev+" ";
		}
		System.out.print(newString);

	}

}
