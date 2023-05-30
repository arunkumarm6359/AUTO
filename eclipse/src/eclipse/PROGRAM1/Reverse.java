package eclipse.PROGRAM1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = S.nextInt();
        System.out.print("Enter a rev number: ");
        int rev = S.nextInt();
       
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
					num=num/10;
		}
        System.out.println(rev);
	}

}
