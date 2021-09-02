import java.util.Scanner;

 class ProfitCalculatorMethod {
	 
	 public int profitCalculator(int buyingPrice, int sellingPrice)
	 {
		 int profit = sellingPrice - buyingPrice;
		 return profit;
	 }
	 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter buyingprice: ");
		int bp = scanner.nextInt();
		System.out.println("Enter sellingPrice: ");
		int sp = scanner.nextInt();
		
		ProfitCalculatorMethod obj = new ProfitCalculatorMethod();
		
		int result = obj.profitCalculator(bp, sp);
		System.out.println("Profit : " + result);

	}
}
