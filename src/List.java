//Name: Sung-Yuan Chen


public class List
{
	public static void main(String[] args)
	{
		
	/*
	 * This is for getting the String and number from other classes	
	 */
	Items items = new Items();
	Priority priority = new Priority();
	ItemsPriceandPriority itemspriceandpriority = new ItemsPriceandPriority();
	CheckPrice checkprice = new CheckPrice();
	CheckItems checkitems = new CheckItems();
	Goshopping goshopping = new Goshopping();
	FinalReport finalreport = new FinalReport();
	
	System.out.println("Please Enter the 7 items");
	
	/*
	 * Get the Items Name
	 */
	
	items.setItemsName();
	String[]ItemsName = items.getItemsName();
	
	/*
	 * Check the items name to see if the items name be input two times
	 */
	
	checkitems.checkitemsname(ItemsName);
	
	System.out.println("Please Enter the priority by the order (From top to buttom) of following items");
	System.out.println("\n"+ItemsName[0]+"\n"+ItemsName[1]+"\n"+ItemsName[2]+"\n"+ItemsName[3]+"\n"+ItemsName[4]+"\n"+ItemsName[5]+"\n"+ItemsName[6]);
	
	/*
	 * Get the priority
	 */
	
	priority.setItemsPriority();
	int[] ItemsPriority = priority.getItemsPriority();
	
	/*
	 * Output for items' name and priority
	 */
	
	System.out.println("Items"+"\t"+"Priority");
	System.out.println("\n"+ItemsName[0]+"\t"+ItemsPriority[0]+"\n"+ItemsName[1]+"\t"+ItemsPriority[1]+"\n"+ItemsName[2]+"\t"+ItemsPriority[2]+"\n"+ItemsName[3]+"\t"+ItemsPriority[3]+"\n"+ItemsName[4]+"\t"+ItemsPriority[4]+"\n"+ItemsName[5]+"\t"+ItemsPriority[5]+"\n"+ItemsName[6]+"\t"+ItemsPriority[6]);
	
	/*
	 * Sort the priority order
	 */
	
	priority.SortPriority();
	int[] newItemsPriority = priority.SortedPriority();
		
	System.out.println("\n"+newItemsPriority[0]+"\n"+newItemsPriority[1]+"\n"+newItemsPriority[2]+"\n"+newItemsPriority[3]+"\n"+newItemsPriority[4]+"\n"+newItemsPriority[5]+"\n"+newItemsPriority[6]);
		
	/*
	 * Set the items' price
	 */
	
	itemspriceandpriority.getItems(ItemsName);
	itemspriceandpriority.setPrice();
	
	/*
	 * Check and get the price to see if the total price is over 100 dollars
	 */
	
	double[] newPrice = itemspriceandpriority.getPrice();
	checkprice.checkpriceAllItems(newPrice);
	
	System.out.println("Now, let's go shopping!"+"\n"+"Please enter the items you bought");
	
	/*
	 * Enter and get the items that user purchased
	 */
	
	goshopping.shopping();
	String[] ItemsBought = goshopping.getshpping();
	
	/*
	 * Make a final report that shows what user purchase and price
	 */
	
	finalreport.checkitemsbought(ItemsBought,ItemsName,newPrice);
	
	String [] getboughtitems = finalreport.getmatchitems();
	double [] getboughtprice = finalreport.getmatchprice();
	double totalgetboughtprice = getboughtprice[0]+getboughtprice[1]+getboughtprice[2]+getboughtprice[3]+getboughtprice[4]+getboughtprice[5]+getboughtprice[6];
	
	
	/*
	 * After user enters Done, the items which is not input will return null. Therefore, if there is null, the item's name will return empty
	 */
	
		if(getboughtitems[0] ==null)
		{
			getboughtitems[0]="";
		}
		if(getboughtitems[1] ==null)
		{
			getboughtitems[1]="";
		}
		if(getboughtitems[2] ==null)
		{
			getboughtitems[2]="";
		}
		if(getboughtitems[3] ==null)
		{
			getboughtitems[3]="";
		}
		if(getboughtitems[4] ==null)
		{
			getboughtitems[4]="";
		}
		if(getboughtitems[5] ==null)
		{
			getboughtitems[5]="";
		}
		if(getboughtitems[6] ==null)
		{
			getboughtitems[6]="";
		}
	
	
	
	System.out.println("Items you bought are "+"\n"+getboughtitems[0]+"\n"+getboughtitems[1]+"\n"+getboughtitems[2]+"\n"+getboughtitems[3]+"\n"+getboughtitems[4]+"\n"+getboughtitems[5]+"\n"+getboughtitems[6]+"\n");
	System.out.println("Price: "+totalgetboughtprice);
	
		if(totalgetboughtprice < 59)
		{
			System.out.println("You can buy more items! You still hava "+(59-totalgetboughtprice)+" to buy other items.");
		}
	
	}	
		
}
