import java.util.Scanner;

public class ShortName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter Short Name: ");
	    String name = scanner.nextLine();
	    if(name.length() >= 2 && name.length() <= 6)
	    {
	    	System.out.println("This is a  valid Short Name");
	    }
	    else
	    {
	    	System.out.println("This is not a valid Short Name");
	    }

	}

}
