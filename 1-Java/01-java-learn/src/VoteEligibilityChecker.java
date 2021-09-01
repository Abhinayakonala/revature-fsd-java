import java.util.Scanner;
public class VoteEligibilityChecker {

	public static void main(String[] args) {
		System.out.println("Enter the age");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age >= 18)
		{
			System.out.println("can vote");
			
		}
		else
		{
			System.out.println("cannot vote");
		}

	}

}
