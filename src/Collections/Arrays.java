 package Collections;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
				
		ArrayList<String> a=new ArrayList<String>();
		a.add("Java");
		a.add("j2ee");
		a.add("Cobol");
		a.add("c");
		System.out.println(a);
		
		for (String n:a)  {      // it will run one by one
		System.out.println(n);
		}
	
		ArrayList<String> b=new ArrayList<String>();
		a.add("Java");
		a.add("j2ee");
		a.add("Cobol");
		a.add("c");
	 
 
      for(String s:b)
      {
    	 System.out.println(s);
    	 }

	}


}
