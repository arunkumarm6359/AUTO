package eclipse.PROGRAM1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the given number");
		int number =sc.nextInt();
		int i=2;
		int count=0;
		while(i<=number/2) {
			if(number%2==0)
			{
				count++;
				break;
				
			}
			i++;
		}
		if(count==0) {
			System.out.println("is a prime number");
		}else {
			System.out.println("not a prime number");
		}

	}

}
