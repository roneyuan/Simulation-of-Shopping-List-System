import java.util.*;

/*
 * Class for set items price which is inherited from class Items
 */
public class ItemsPriceandPriority extends Items
{	
	
	private Scanner keyboard = new Scanner(System.in);
	private double []Price = new double[7];
	private String[]Items = new String[7];
	
	/*
	 * Get the Items' name in order to show the user and enter price
	 */
	public void getItems(String []ItemsName)
	{

		Items[0] = ItemsName[0];
		Items[1] = ItemsName[1];
		Items[2] = ItemsName[2];
		Items[3] = ItemsName[3];
		Items[4] = ItemsName[4];
		Items[5] = ItemsName[5];
		Items[6] = ItemsName[6];
		
		return;
		
	}
	
	/*
	 * Set the price
	 */
	public void setPrice()
	{
		System.out.println("Please enter the price for the following items");
		
		for (int i = 0; i<7; i++)
		{
			System.out.println(Items[i]);
			Price[i] = keyboard.nextDouble();
		}
			
	}
	/*
	 * Getter for price
	 */
	public double [] getPrice()
	{
		return Price;
	}
	
		
	

}
