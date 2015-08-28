public class Validator 
{
	public static getString(Scanner scan, String promt)
	{
		System.out.print(prompt);
		String s = scan.next();
		scan/netLine();
		return s;
	}
	
	public static int getInt(Scanner scan, String prompt)
	{
		int i = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			if (scan.hasNextInt())
			{
				i = scan.nextInt();
				isValid = true;
			}
			else
			{
				System.out.println("Error! Invalid integer value. Try again.");
			}
			scan.nextLine();
		}
		return i;
	}
}