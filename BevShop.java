import java.util.ArrayList;

public class BevShop implements BevShopInterface {
	
	private int ALC_num;
	private int currentOrderIndex;
	private ArrayList<Order> orders;
	
	public BevShop() {
		this.orders = new ArrayList<>();

	}

	@Override
	public boolean isValidTime(int time) {
		if(time >= MIN_TIME || time <= MAX_TIME)
		{
			return true;
		}
		return false;

	}

	@Override
	public int getMaxNumOfFruits() {
		
		return MAX_FRUIT;
	}

	@Override
	public int getMinAgeForAlcohol() {
		
		return MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	public boolean isMaxFruit(int numOfFruits) {
		if(numOfFruits > MAX_FRUIT)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	@Override
	public int getMaxOrderForAlcohol() {
		
		return  MAX_ORDER_FOR_ALCOHOL;
	}

	@Override
	public boolean isEligibleForMore(){
		if(ALC_num < 3)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	

	@Override
	public int getNumOfAlcoholDrink() {
		return ALC_num;
	}

	@Override
	public boolean isValidAge(int age) {
		if(age >= MIN_AGE_FOR_ALCOHOL)
		{
			return true;
		}
		return false;
	}

	@Override
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		Customer cust2 = new Customer(customerName,customerAge);
		Order ord = new Order(time,day,cust2);
		orders.add(ord);
		ALC_num = 0; 
		
		
	}

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		orders.get(currentOrderIndex).addNewBeverage(bevName, size, extraShot, extraSyrup);
		
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) {
		orders.get(currentOrderIndex).addNewBeverage(bevName, size);
		ALC_num++;
		
	}

	@Override
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		orders.get(currentOrderIndex).addNewBeverage(bevName, size, numOfFruits, addProtein);
		
	}

	@Override
	public int findOrder(int orderNo) {
		for(int i = 0; i < orders.size(); i++)
		{
			if(orders.get(i).getOrderNum() == orderNo)
			{
				return i;
			}
		}
		return -1;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		double total = 0;
		for(Order o : orders)
		{
			if(o.getOrderNum() == orderNo)
			{
				for(Beverage bev : o.getBeverages())
				{
					total += bev.calcPrice();
				}
			}
		}
		return total;
	}

	@Override
	public double totalMonthlySale() {
		double totals = 0;
		for(Order o : orders)
		{
			for(int i = 0; i < orders.size(); i++)
			{
				totals += o.calcOrderTotal();
			}
		}
		return totals; 
	}

	@Override
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}

	@Override
	public Order getCurrentOrder() {
		return orders.get(currentOrderIndex);
	}

	@Override
	public Order getOrderAtIndex(int index) {
		
		return orders.get(index);
	}

	@Override
	public void sortOrders() {
		
		for (int i = 0; i < orders.size()-1; i++) 
		{
			int minOrderNumIdx = i;
			for (int j = i+1; j < orders.size(); j++) 
			{
				if (orders.get(j).getOrderNum() < orders.get(minOrderNumIdx).getOrderNum())
				{
					minOrderNumIdx = j;
				}
			}

			Order temp = orders.get(minOrderNumIdx);
			orders.set(minOrderNumIdx, orders.get(i));
			orders.set(i, temp);
		}
		
	}

	
		
	

}
