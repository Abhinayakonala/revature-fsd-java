
public class LinePrinter {

	public static void main(String[] args) {
		printLine();
		printLine(15);
		printLine(10);
		printLine(25);
		System.out.println("A");
		System.out.println(1);

	}
	public static void printLine() {
		System.out.println("-----------------------");
	}
	//Method Overloading - polymorphism
	public static void printLine(int numberOfCharacters)
	{
		for(int i = 0; i < numberOfCharacters; i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
}
