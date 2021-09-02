import java.util.Scanner;

 public class DisplayMenu {
 
	public static void main(String[] args) {
		while(true) {
	 
		    System.out.println("Menu");
			System.out.println("====");
			System.out.println("1. Balance Enquiry");
			System.out.println("2. Recharge");
			System.out.println("3. Change Caller Tune");
			System.out.println("4. Exit");
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Choose an Option:");
			int option = scanner.nextInt();

				switch ( option ) {
					case 1:
						System.out.println("1. Balance Enquiry");
						break;
							
					case 2:
						System.out.println("2. Recharge");
						break;
							
					case 3:
						System.out.println("3. Change Caller Tune");
						break;
							
					 case 4:
						System.out.println("Exit");
						break;
						
					default:
						System.out.println("enter correct opyion");
						
						}
					}
			}
	}
 
 
						
					
			
	 
					
				
							
		
				

