
public abstract class Beverage{
	
	private String bevName;
	private Type type;
	private Size size;
	private final double BP = 2.0;
	private final double SP = 1.0;
	
	
	public Beverage(String bevName, Type type, Size size)
	{
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}

	public boolean equals(Beverage anotherBev)
	{
		boolean flag = false; 
		if(bevName.equals(anotherBev.getBevName()) && this.type == anotherBev.getType()&& this.size == anotherBev.getSize())
		{
			flag = true;
		}
		return flag;
	}
	
	public abstract double calcPrice();
	
	public String getBevName()
	{
		return bevName;
		
	}
	
	public double getBasePrice()
	{
		return BP;

	}
	public Type getType()
	{
		return type;
		
	}

	public Size getSize()
	{
		return size;
		
	}
	public double getSizePrice()
	{
		return SP;

	}
	
	public void setSize(Size size)
	{
		this.size = size;
	}
	public void setBevName(String bevName)
	{
		this.bevName = bevName;
	}
	public void setType(Type type)
	{
		this.type = type;
	}
	
	public String toString()
	{
		return "The beverage name is " + bevName + " and the size is " + size;
		
	}
}
