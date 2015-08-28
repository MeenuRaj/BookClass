import java.util.Scanner;



public class LineItemApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Line Item Calculator");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
			String code = Validator.getString(scan, "Enter product code: ");
			int quantity = Validator.getInt(scan, "Enter quantity:   ",0,1000);
			
			//get the product object
			Book book = BookDB.getBook(code);
			
			//create the LineItem object and set its fields
			LineItem lineItem = new LineItem();
			line.Item.setproduct(product);
			line.Item.setquantity(quantity);
			
			//display the output
			System.out.println();
			System.out.println("LINE ITEM");
			System.out.println("Code:  " +product.getcode());
			System.out.println("Description: " +product.getdescription());
			System.out.println("Price: " +book.getFormattedPrice());
			System.out.println("Quantity:  " +lineItem.getQuantity());
			System.out.println("Total:  " +lineItem.getFormattedTotal() + "\n");
			
			//see if the user wants to continue
			choice = Validator.getString(scan, "Continue? (y/n): ");
			System.out.println();
			
		}


	}

}