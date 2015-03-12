/*
 * Class for checking price 
 */

public class CheckPrice extends ItemsPriceandPriority {

	
	private double TotalPriceAllItems;
	
	public void checkpriceAllItems(double[]newPrice)
	{
		TotalPriceAllItems = newPrice[0]+newPrice[1]+newPrice[2]+newPrice[3]+newPrice[4]+newPrice[5]+newPrice[6];
		if(TotalPriceAllItems <= 100)
		{
			System.out.println("The total price is insufficient, please try again");
		}
		else
		return;
	}


}
