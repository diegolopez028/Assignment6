
public class Smoothie extends Beverage{
	

	private int numOfFruits;
	private boolean addProtein;
	private final double addpro = 1.50;
	private final double addFruit = 0.50;
	
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		super(bevName,Type.SMOOTHIE,size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
		
	}
	
	public int getNumOfFruits()
	{
		return numOfFruits;
		
	}
	
	public boolean getAddProtein()
	{
		return addProtein;
		
	}

	  public double getFruitCost() {
        return addFruit;
}
	  public double getProteinCost() {
        return addpro;
}
	
	@Override
	public double calcPrice()
	{
		double totalPrice = super.getBasePrice();
		
				
		if(super.getSize() == Size.MEDIUM)
		{
			totalPrice += 1;
		}
		if(super.getSize() == (Size.LARGE))
		{
			totalPrice += 2 * super.getSizePrice();
			
		}
		totalPrice += numOfFruits * addFruit;
		
		if(addProtein)
		{
			totalPrice += addpro;
		}
		
	
		return totalPrice;
		
	}

	public boolean equals(Smoothie anotherBev)
	{
		boolean flag = false;
		if(super.equals(anotherBev) && this.numOfFruits == anotherBev.getNumOfFruits() && this.addProtein == anotherBev.getAddProtein())
		{
			flag = true;
		}
		return flag; 
		
	}
	
	public void setNumofFruits(int numOfFruits)
	{
		this.numOfFruits = numOfFruits;
	}
	public String toString()
	{
		return getBevName() + "Beverage Size: " + getSize() + "\n"; 
				// not done 
		
	}
	
	 public void setProteinPowder(boolean addProtien) 
	 {
          this.addProtein = addProtien;
	 }
	 
}
