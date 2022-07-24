package comAssesment;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class EvenNumbersInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer>list= new ArrayList();
         ArrayList<Integer>evenList= new ArrayList();
  
  list.add(2);
  list.add(3);
  list.add(4);
  list.add(5);
  list.add(6);
  list.add(7);
  list.add(8);
   java.util.Iterator<Integer> itr= list.iterator();
   while (itr.hasNext())
   {
       int j=(int)itr.next();
       if(j%2==0)
       evenList.add(j);
   }
   System.out.println("even numbers in list are"+evenList);

	}

}
