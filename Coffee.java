
public class Coffee extends Beverage{

	private boolean extraShot;
	private boolean extraSyrup;
	private final double EXTRASHOT = .50;
	private final double EXTRASYRUP = .50;
	
	

	public Coffee(String bevName, Size size, boolean extraSyrup,boolean extraShot)
	{
		super(bevName,Type.COFFEE,size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
		
	}
	public void setExtraShot(boolean extraShot)
	{
		this.extraShot = extraShot;
	}
	public void setExtraSyrup(boolean extraSyrup)
	{
		this.extraSyrup = extraSyrup;
		
	}
	public boolean getExtraShot()
	{
		return extraShot;
		
	}
	public boolean getExtraSyrup()
	{
		return extraSyrup;
		
	}
	public double calcPrice()
	{
		double totalPrice = super.getBasePrice();
		
		if(super.getSize() == Size.MEDIUM)
		{
			totalPrice += super.getSizePrice();
		}
		else if(super.getSize() == Size.LARGE)
		{
			totalPrice += 2 * super.getSizePrice();
			
		}
		
		if(extraShot)
		{
			totalPrice += EXTRASHOT;
		}
		if(extraSyrup)
		{
			totalPrice += EXTRASYRUP;
		}
		
		return totalPrice;
		
	}
	public String toString()
	{
		return getBevName() + "size : " + getSize() + "\n" +
				"Extra Shot :" + extraShot + "\n" + 
				"Extra Syrup: " + extraSyrup;
		
	}
	
	public boolean equals(Coffee anotherBev)
	{
		boolean flag = false;
		if(super.equals(anotherBev) && this.extraShot == anotherBev.getExtraShot() 
				&& this.extraSyrup == anotherBev.getExtraSyrup())
						flag = true;
		
		return flag;
	}
	
	public double getExtraShotCost() 
	{
        return EXTRASHOT;
	}
	
	public double getExtraSyrupCost() 
	{
        return EXTRASYRUP;
	}

}
