package eclipse.PROGRAM1;

import java.util.Scanner;

public class UnitPlace {

	public static void main(String[] args) {
		 Scanner S = new Scanner(System.in);

	        System.out.print("Enter a months: ");
	        int num = S.nextInt();
	        System.out.println("enter the number");
	        while(num>0) {
	        	int rem=num%10;
	        	System.out.println(rem);
	        	num=num/10;
	        }
	}

}
