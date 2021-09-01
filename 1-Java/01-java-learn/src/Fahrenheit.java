import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the celsius value");
		int celsius = scanner.nextInt();
		
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.println("Fahrenheit = " + fahrenheit);

	}

}
