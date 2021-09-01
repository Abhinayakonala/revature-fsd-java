import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the celsius value");
		 int celsius = scanner.nextInt();
		
		float fahrenheit = (celsius *(float)9/5) + 32;
		System.out.println("Fahrenheit = " + fahrenheit);

	}

}
