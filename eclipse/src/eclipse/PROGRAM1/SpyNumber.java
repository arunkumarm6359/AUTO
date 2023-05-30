package eclipse.PROGRAM1;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the  number");
		int num =sc.nextInt();
		String res=isSpy(num);
		System.out.println(res);
	}
	private static String isSpy(int num)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the sum number");
		int sum=sc.nextInt();
		System.out.println("enter the prod number");
		int prod=sc.nextInt();
		
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			prod=prod*rem;
			num=num/10;
			}
		if(sum==prod) {
			return "spy";
		}
			else {
				return "not a spy";
			}
	}

}
