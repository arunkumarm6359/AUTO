package eclipse.PROGRAM1;

import java.util.Scanner;

public class SpecialTwoDigit {

	public static void main(String[] args) {
		 Scanner S = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = S.nextInt();
	        int a=num%10;
	        int b=num/10;
	        int res=(a+b)+(a*b);
	        if(num==res) {

	        	System.out.println("special two digit number");
	        }
	        	else
	        	{
	        		System.out.println(" not special two digit number");
	        	
	        }

	}

}
