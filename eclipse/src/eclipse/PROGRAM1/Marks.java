package eclipse.PROGRAM1;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

        System.out.print("Enter a 4 subjects marks: ");
        int sql  = S.nextInt();
        int mal = S.nextInt();
        int java = S.nextInt();
        int sel = S.nextInt();
        if (sql<35||mal<35||java<35||sel<35) {
        	System.out.println("fail");
        }
        else
        {
			int per=(sql+mal+java+sel)/4;
			if (per>=85) {
				System.out.println("distinct");
			}
			else if(per>=60) {
				System.out.println("1st class");
			}
			else {
				System.out.println("2n class");
				
			}
		}
	}

}
