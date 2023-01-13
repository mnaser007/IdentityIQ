package CodeWithNaser;

import java.util.Scanner;

public class Exercise_01_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Percentage of all subjects");
			System.out.println("Eneter your subject-01 Marks");
			Scanner sc = new Scanner(System.in);
			 double a=sc.nextInt();
			System.out.println("Eneter your subject-02 Marks");
			double b=sc.nextInt();
			 System.out.println("Eneter your subject-03 Marks");
			 double c=sc.nextInt();
			 double sum=a+b+c;
			 System.out.println("Your total  marks are: "+ sum);
			 double perc=(100/sum)*100;
			 System.out.println("Your percentage is: "+ perc);
			sc.close();
	}

}
