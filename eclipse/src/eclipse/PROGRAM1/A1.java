package eclipse.PROGRAM1;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		 Scanner S = new Scanner(System.in);

	        System.out.print("Enter a year: ");
	        int year = S.nextInt();
	        if((year%4==0 && year%100!=0)||(year%400==0)) {
	        	
	        	System.out.println("leap year");
	        }
	        	else
	        	{
	        		System.out.println("not a leap year");
	        		
	        	
	        }
	        
	}

}
