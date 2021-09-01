import java.util.Scanner;

public class TimeExtractor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Time in hh:mm:ss format");
		String time = scanner.nextLine();
		System.out.println(time.substring(3,5));
	}

}
