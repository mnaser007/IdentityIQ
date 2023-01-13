package CodeWithNaser;

import java.util.Scanner;

public class CWN_05_TakingInput {
	
	public static void main(String[] args) {
    /*System.out.println("taking input from the user ");
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the first numbr");
	int a =sc.nextInt();
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	 int sum= a+b;
    System.out.println("The sum of these number are:-->"+sum);*/
    
		System.out.println("taking input from the user ");
            Scanner sc1 = new Scanner(System.in);
     
            System.out.println("Enter Name, RollNo, Marks, Grade");
            
            String name = sc1.nextLine();		//used to read line
            int RollNo = sc1.nextInt();			//used to read int
            double Marks = sc1.nextDouble();		//used to read double
            char Grade = sc1.next().charAt(0);	//used to read till space
     
            System.out.println("Name: "+name);
            System.out.println("Gender: "+RollNo);
            System.out.println("Marks: "+Marks);
            System.out.println("Grade: "+Grade);
            
            sc1.close();
    
            String str=sc1.nextLine();
            System.out.println(str);
            
     
   	}


}
