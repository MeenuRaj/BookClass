import java.util.Scanner;

public class BookApp 
{
	public static void main(String args[])
	{
		System.out.println("Welome to the Product Selector");
		System.out.println();
		
		//display one of more products
		Scanner scan = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.print("Enter product code: ");
			String code = scan.next();
			scan.nextLine();
			
			Book book = BookDB.getBook(code);
			
			//display output
			System.out.println();
			System.out.println("Selected Product");
			System.out.println("Description: " +book.getdescription());
			System.out.println("Price: $" +book.getprice());
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
			choice = scan.nextLine();
			System.out.println();
			
			
		}
	}
}
