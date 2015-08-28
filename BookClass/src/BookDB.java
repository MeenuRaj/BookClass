
public class BookDB 
{
	public static Book getBook(String code)
	{
		Book p = new Book();

	
	p.setcode(code);
	if(code.equalsIgnoreCase("java"))
	{
		p.setdescription("Murach's Beginning Java");
		p.setprice(49.50);
	}
	else if (code.equalsIgnoreCase("jsps"))
	{
		p.setdescription("Murach's Java Servlets and JSP");
		p.setprice(49.50);
	}
	else if (code.equalsIgnoreCase("mcb2"))
	{
		p.setdescription("Murach's Mainframe COBOL");
		p.setprice(59.50);
	}
	else
	{
		p.setdescription("Unknown");
	}
	return p;
	}
}
