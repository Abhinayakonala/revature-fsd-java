
public class TVSchedule {

	public static void main(String[] args) {
		int date = 2;
		System.out.println("Using While loop:");
		LinePrinter.printLine();
		while (date <= 31)
		{
		System.out.println(date);
		date = date + 3;
		}
		System.out.println("Using do.. While loop:");
		date = 2;
		do
		{
			System.out.println(date);
			date = date + 3;
		}while (date <= 31);
		System.out.println("Using for loop:");
	   for (date = 2; date <= 31; date = date += 3)
	    {
		System.out.println(date);
		}
	}

}
