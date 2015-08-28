public class Book 
{
	private String bookTitle;
	private String code;
	private String author;
	private String description;
	private double price; 
	private boolean isInStock;
	
	public Book()
	{
		bookTitle = "";
		code = "";
		author = "";
		description = "";
		price = 0;
		isInStock = true;
	}
	
	public void setbookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	public String getbookTitle()
	{
		return bookTitle;
	}
	
	public void setcode(String code)
	{
		this.code = code;
	}
	public String getcode()
	{
		return code;
	}
	
	public void setauthor(String author)
	{
		this.author = author;
	}
	public String getauthor()
	{
		return author;
	}
	
	public void setdescription(String description)
	{
		this.description = description;
	}
	public String getdescription()
	{
		return description;
	}
	
	public void setprice(double price)
	{
		this.price = price;
	}
	public double getprice()
	{
		return price;
	}
	
	public void setisInStock(boolean isInStock)
	{
		this.isInStock = isInStock;
	}
	public boolean getisInStock()
	{
		return isInStock;
	}
	
	
	//bonus
	
	public double totalPrice(int booknum)
	{
		double total = 0;
		
		if (isInStock == true)
		{
			total = booknum*price;
		}
		return total;
		
	}
	
	
}
