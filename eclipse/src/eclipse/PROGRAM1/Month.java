package eclipse.PROGRAM1;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		 Scanner S = new Scanner(System.in);

	        System.out.print("Enter a months: ");
	        int month = S.nextInt();
	        switch(month)
	        {
	           case 1:
	           case 3:
	            case 5:
	            case 7:
	        	case 8:
	        	case 10:
	        	case 12:System.out.println("31 days");
	        	break;
	        	case 4:
		        case 6:
		            
		       case 9:
		            case 11:System.out.println("30 days");
		            break;
		            case 2:
		            	System.out.println("28/27 days");
		            	break;
		            	default:
		            		System.out.println("invalid months ");
	        }
		        	

	}

}
