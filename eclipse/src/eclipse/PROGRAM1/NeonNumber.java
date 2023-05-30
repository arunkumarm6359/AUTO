package eclipse.PROGRAM1;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the  number");
		int num =sc.nextInt();
		String res=isNeon(num);
		System.out.println(res);
	}
	private static String isNeon(int num)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the sum number");
		int sum=sc.nextInt();
		int sq=num*num;
		while(sq>0) {
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
			}
		if(num==sum) {
			return "neon";
		}
			else {
				return "not a neon";
			}
	}
	

}
