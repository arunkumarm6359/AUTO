package eclipse.PROGRAM1;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = S.nextInt();
        System.out.print("Enter a count number: ");
        int count = S.nextInt();
        while (num>0) {
        	num=num/10;
        	count++;
        	
			
		}
        System.out.println(count);
	}

}
