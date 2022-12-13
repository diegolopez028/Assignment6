import java.util.*;
import java.util.ArrayList;

public class Order implements OrderInterface, Comparable<Order> {
	private int orderTime;
	private int orderNum;
	private Day orderDay;
	private Customer cust;
	private ArrayList<Beverage> beverages;
	
	public Order(int orderTime, Day orderDay, Customer cust)
	{
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.cust = cust;
		this.orderNum = genOrderNum();
		this.beverages = new ArrayList<>();
		
		
	}
	
	public int genOrderNum()
	{
		Random order = new Random();
		int orderNum1 = order.nextInt(90000 - 10000) + 10000;
		return orderNum1;
		
	}
	public void setOrderNum(int orderNum)
	{
		this.orderNum = orderNum;
		
	}
	public int getOrderNum()
	{
		return orderNum;
	}
	
	public void setCustomer(Customer cust)
	{
		this.cust = cust;
		
	}

	public Customer getCustomer()
	{
		return new Customer(cust);
		
	}
	
	public Day getDay()
	{
		return orderDay;
		
	}
	public void setOrderDay(Day orderDay)
	{
		this.orderDay = orderDay;
	}
	public Day getOrderDay()
	{
		return orderDay;
	}
	public void setDay(Day orderDay)
	{
		this.orderDay = orderDay;
		
	}
	
	public int getTotalItems()
	{
		return beverages.size();
		
	}

	@Override
	public int compareTo(Order o) {
		
		if(this.orderNum == o.getOrderNum())
		{
			return 0;
		}
		else if(this.orderNum > o.getOrderNum())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}

	@Override
	public boolean isWeekend() 
	{
		if(this.orderDay == Day.SATURDAY || this.orderDay == Day.SUNDAY)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		return beverages.get(itemNo);
		
	}

	@Override
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		
		Coffee coffee = new Coffee(bevName, size, extraShot,extraSyrup);
		beverages.add(coffee);
		
		
		
	}

	@Override
	public void addNewBeverage(String bevName, Size size) {
		boolean isWeekend = false;
		if(this.orderDay == Day.SATURDAY || this.orderDay == Day.SUNDAY)
		{
			isWeekend = true;
		}
		Alcohol alcohol = new Alcohol(bevName,size, isWeekend);
		beverages.add(alcohol);
		
	}
	
	@Override
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		
		Smoothie smoothie = new Smoothie(bevName,size,numOfFruits,addProtein); 
		beverages.add(smoothie);
	}

	@Override
	public double calcOrderTotal() {
		
		double total = 0.0;
		for(Beverage bevs : beverages)
		{
			total += bevs.calcPrice();
		}
		return total;
	}

	@Override
	public int findNumOfBeveType(Type type) {
		
		int totalofType = 0;
		for(Beverage b : beverages)
		{
			if(b.getType() == type)
			{
				totalofType++;
			}
		}
		
		return totalofType;
	}
	public String toString()
	{
		return "The order information is Order Number: " + orderTime + " Order Time: " + orderTime + 
				"Order Day: " + orderDay + " Customer Information: " + cust.getAge() + " " + cust.getName();
		
	}

	public ArrayList<Beverage> getBeverages() {
        return beverages;
}
}
