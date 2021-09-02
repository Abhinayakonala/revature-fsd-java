import java.util.Scanner;

 public class DisplayMenu() {
 
	public static void main(String[] args) {
	 
		    System.out.println("Menu");
			System.out.println("====");
			System.out.println("1. Balance Enquiry");
			System.out.println("2. Recharge");
			System.out.println("3. Change Caller Tune");
			System.out.println("4. Exit");
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Choose an Option:");
			int option = scanner.nextInt();

			
			while( option != 0)  {
		
					if( option > 5) {
						
						System.out.println(" Choose a valid option:" );
						System.out.println("Menu");
						System.out.println("====");
						System.out.println("1. Balance Enquiry");
						System.out.println("2. Recharge");
						System.out.println("3. Change Caller Tune");
						System.out.println("4. Exit");
						
						System.out.println("Choose an Option:");
					    option = scanner.nextInt();

					}
					else {
						switch ( option ) {
						case 1:
							System.out.println("1. Balance Enquiry");
							System.out.println("Menu");
							System.out.println("====");
							System.out.println("1. Balance Enquiry");
							System.out.println("2. Recharge");
							System.out.println("3. Change Caller Tune");
							System.out.println("4. Exit");
							
							System.out.println("Choose an Option:");
						    option = scanner.nextInt();
							break;
							
						case 2:
							System.out.println("2. Recharge");
							System.out.println("Menu");
							System.out.println("====");
							System.out.println("1. Balance Enquiry");
							System.out.println("2. Recharge");
							System.out.println("3. Change Caller Tune");
							System.out.println("4. Exit");
							
							System.out.println("Choose an Option:");
						    option = scanner.nextInt();
							break;
							
						case 3:
							System.out.println("3. Change Caller Tune");
							System.out.println("Menu");
							System.out.println("====");
							System.out.println("1. Balance Enquiry");
							System.out.println("2. Recharge");
							System.out.println("3. Change Caller Tune");
							System.out.println("4. Exit");
							
							System.out.println("Choose an Option:");
						    option = scanner.nextInt();
							break;
							
						case 4:
							System.out.println("Exit");
							break;
						}
					}
			}
	 }
					
				
							
		
				

